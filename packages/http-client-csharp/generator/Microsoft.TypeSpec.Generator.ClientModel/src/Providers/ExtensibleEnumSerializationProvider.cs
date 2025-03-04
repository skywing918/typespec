// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System;
using System.IO;
using Microsoft.TypeSpec.Generator.Input;
using Microsoft.TypeSpec.Generator.Primitives;
using Microsoft.TypeSpec.Generator.Providers;

namespace Microsoft.TypeSpec.Generator.ClientModel.Providers
{
    /// <summary>
    /// This defines a class with extension methods for enums to convert an enum to its underlying value, or from its underlying value to an instance of the enum
    /// </summary>
    public partial class ExtensibleEnumSerializationProvider : TypeProvider
    {
        private readonly InputEnumType _enumType;
        private TypeProvider _enumProvider;

        protected override string BuildNamespace() => _enumProvider.Type.Namespace;

        public ExtensibleEnumSerializationProvider(InputEnumType enumType, TypeProvider enumProvider)
        {
            _enumType = enumType;
            _enumProvider = enumProvider;
        }

        protected override string BuildRelativeFilePath()
        {
            return Path.Combine("src", "Generated", "Models", $"{_enumProvider.Name}.Serialization.cs");
        }

        protected override string BuildName() => _enumProvider.Name;

        protected override TypeSignatureModifiers BuildDeclarationModifiers() => _enumProvider.DeclarationModifiers;

        protected override MethodProvider[] BuildMethods()
        {
            // for string-based extensible enums, we are using `ToString` as its serialization
            // for non-string-based extensible enums, we need a method to serialize them
            if (!_enumProvider.EnumUnderlyingType.Equals(typeof(string)))
            {
                var toSerialSignature = new MethodSignature(
                    Name: $"ToSerial{_enumProvider.EnumUnderlyingType.Name}",
                    Modifiers: MethodSignatureModifiers.Internal,
                    ReturnType: _enumProvider.EnumUnderlyingType,
                    Parameters: Array.Empty<ParameterProvider>(),
                    Description: null,
                    ReturnDescription: null);

                // writes the method:
                // internal float ToSerialSingle() => _value; // when ValueType is float
                // internal int ToSerialInt32() => _value; // when ValueType is int
                // etc
                var valueField = new FieldProvider(FieldModifiers.Private | FieldModifiers.ReadOnly, _enumProvider.EnumUnderlyingType, "_value", this);
                return [new MethodProvider(toSerialSignature, valueField, this)];
            }
            else
            {
                return Array.Empty<MethodProvider>();
            }
        }
    }
}
