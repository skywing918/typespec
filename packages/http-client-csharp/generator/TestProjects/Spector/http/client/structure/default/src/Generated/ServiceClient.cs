// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Threading;
using System.Threading.Tasks;
using Client.Structure.Service._Baz;
using Client.Structure.Service._Qux;

namespace Client.Structure.Service
{
    public partial class ServiceClient
    {
        protected ServiceClient() => throw null;

        public ServiceClient(Uri endpoint, ClientType client) : this(endpoint, client, new ServiceClientOptions()) => throw null;

        public ServiceClient(Uri endpoint, ClientType client, ServiceClientOptions options) => throw null;

        public ClientPipeline Pipeline => throw null;

        public virtual ClientResult One(RequestOptions options) => throw null;

        public virtual Task<ClientResult> OneAsync(RequestOptions options) => throw null;

        public virtual ClientResult One(CancellationToken cancellationToken = default) => throw null;

        public virtual Task<ClientResult> OneAsync(CancellationToken cancellationToken = default) => throw null;

        public virtual ClientResult Two(RequestOptions options) => throw null;

        public virtual Task<ClientResult> TwoAsync(RequestOptions options) => throw null;

        public virtual ClientResult Two(CancellationToken cancellationToken = default) => throw null;

        public virtual Task<ClientResult> TwoAsync(CancellationToken cancellationToken = default) => throw null;

        public virtual Baz GetBazClient() => throw null;

        public virtual Qux GetQuxClient() => throw null;

        public virtual Foo GetFooClient() => throw null;

        public virtual Bar GetBarClient() => throw null;
    }
}
