// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using Client.Structure.Service.TwoOperationGroup;
using Client.Structure.Service.TwoOperationGroup.Models;
using NUnit.Framework;
using System.ClientModel;
using System.Linq;
using System.Threading.Tasks;

namespace TestProjects.CadlRanch.Tests.Http.Client.Structure.TwoOperationGroup
{
    public class TwoOperationGroupTests : CadlRanchTestBase
    {
        [Test]
        public void Client_Structure_Two_Operation_Group_methods()
        {
            /* check the methods in service client. */
            var methodsOfServiceClient = typeof(TwoOperationGroupClient).GetMethods();
            Assert.IsNotNull(methodsOfServiceClient);
            Assert.AreEqual(0, methodsOfServiceClient.Where(method => method.Name.EndsWith("Async")).ToArray().Length);
            //check existence of method to get the operation group client
            Assert.AreNotEqual(null, typeof(TwoOperationGroupClient).GetMethod("GetGroup1Client"));
            Assert.AreNotEqual(null, typeof(TwoOperationGroupClient).GetMethod("GetGroup2Client"));

            /*check methods in operation group1 client. */
            var methodsOfGroup1 = typeof(Group1).GetMethods();
            Assert.IsNotNull(methodsOfGroup1);
            Assert.AreEqual(6, methodsOfGroup1.Where(method => method.Name.EndsWith("Async")).ToArray().Length);
            Assert.IsNotNull(typeof(Group1).GetMethods().Where(m => m.Name == "OneAsync").FirstOrDefault());
            Assert.IsNotNull(typeof(Group1).GetMethods().Where(m => m.Name == "ThreeAsync").FirstOrDefault());
            Assert.IsNotNull(typeof(Group1).GetMethods().Where(m => m.Name == "FourAsync").FirstOrDefault());

            /*check methods in operation group2 client. */
            var methodsOfGroup2 = typeof(Group2).GetMethods();
            Assert.IsNotNull(methodsOfGroup2);
            Assert.AreEqual(6, methodsOfGroup2.Where(method => method.Name.EndsWith("Async")).ToArray().Length);
            Assert.IsNotNull(typeof(Group2).GetMethods().Where(m => m.Name == "TwoAsync").FirstOrDefault());
            Assert.IsNotNull(typeof(Group2).GetMethods().Where(m => m.Name == "FiveAsync").FirstOrDefault());
            Assert.IsNotNull(typeof(Group2).GetMethods().Where(m => m.Name == "SixAsync").FirstOrDefault());
        }

        [CadlRanchTest]
        public Task One() => Test(async (host) =>
        {
            ClientResult result = await new TwoOperationGroupClient(host, ClientType.TwoOperationGroup).GetGroup1Client().OneAsync();
            Assert.AreEqual(204, result.GetRawResponse().Status);
        });

        [CadlRanchTest]
        public Task Three() => Test(async (host) =>
        {
            ClientResult result = await new TwoOperationGroupClient(host, ClientType.TwoOperationGroup).GetGroup1Client().ThreeAsync();
            Assert.AreEqual(204, result.GetRawResponse().Status);
        });

        [CadlRanchTest]
        public Task Four() => Test(async (host) =>
        {
            ClientResult result = await new TwoOperationGroupClient(host, ClientType.TwoOperationGroup).GetGroup1Client().FourAsync();
            Assert.AreEqual(204, result.GetRawResponse().Status);
        });

        [CadlRanchTest]
        public Task Two() => Test(async (host) =>
        {
            ClientResult result = await new TwoOperationGroupClient(host, ClientType.TwoOperationGroup).GetGroup2Client().TwoAsync();
            Assert.AreEqual(204, result.GetRawResponse().Status);
        });

        [CadlRanchTest]
        public Task Five() => Test(async (host) =>
        {
            ClientResult result = await new TwoOperationGroupClient(host, ClientType.TwoOperationGroup).GetGroup2Client().FiveAsync();
            Assert.AreEqual(204, result.GetRawResponse().Status);
        });

        [CadlRanchTest]
        public Task Six() => Test(async (host) =>
        {
            ClientResult result = await new TwoOperationGroupClient(host, ClientType.TwoOperationGroup).GetGroup2Client().SixAsync();
            Assert.AreEqual(204, result.GetRawResponse().Status);
        });
    }
}