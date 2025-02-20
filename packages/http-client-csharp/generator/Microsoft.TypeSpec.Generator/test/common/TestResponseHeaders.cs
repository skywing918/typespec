// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System;
using System.ClientModel.Primitives;
using System.Collections.Generic;

namespace Microsoft.TypeSpec.Generator.Tests.Common
{
    public class TestResponseHeaders : PipelineResponseHeaders
    {
        private readonly Dictionary<string, string> _headers;

        public TestResponseHeaders()
        {
            _headers = new Dictionary<string, string>();
        }

        public override IEnumerator<KeyValuePair<string, string>> GetEnumerator()
        {
            throw new NotImplementedException();
        }

        public override bool TryGetValue(string name, out string? value)
        {
            return _headers.TryGetValue(name, out value);
        }

        public override bool TryGetValues(string name, out IEnumerable<string>? values)
        {
            throw new NotImplementedException();
        }
    }
}
