// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace _Type.Model.Inheritance.NestedDiscriminator.Models
{
    public partial class SawShark : Shark
    {
        public SawShark(int age) : base("saw", age) => throw null;

        internal SawShark(string sharktype, string kind, int age, IDictionary<string, BinaryData> additionalBinaryDataProperties) : base(sharktype, kind, age, additionalBinaryDataProperties) => throw null;
    }
}
