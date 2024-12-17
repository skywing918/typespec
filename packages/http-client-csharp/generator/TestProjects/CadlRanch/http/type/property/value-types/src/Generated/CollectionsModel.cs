// <auto-generated/>

#nullable disable

using System.ClientModel;
using System.ClientModel.Primitives;
using System.Threading;
using System.Threading.Tasks;
using _Type.Property.ValueTypes.Models;

namespace _Type.Property.ValueTypes
{
    public partial class CollectionsModel
    {
        protected CollectionsModel() => throw null;

        public ClientPipeline Pipeline => throw null;

        public virtual ClientResult Get(RequestOptions options) => throw null;

        public virtual Task<ClientResult> GetAsync(RequestOptions options) => throw null;

        public virtual ClientResult<CollectionsModelProperty> Get(CancellationToken cancellationToken = default) => throw null;

        public virtual Task<ClientResult<CollectionsModelProperty>> GetAsync(CancellationToken cancellationToken = default) => throw null;

        public virtual ClientResult Put(BinaryContent content, RequestOptions options = null) => throw null;

        public virtual Task<ClientResult> PutAsync(BinaryContent content, RequestOptions options = null) => throw null;

        public virtual ClientResult Put(CollectionsModelProperty body, CancellationToken cancellationToken = default) => throw null;

        public virtual Task<ClientResult> PutAsync(CollectionsModelProperty body, CancellationToken cancellationToken = default) => throw null;
    }
}
