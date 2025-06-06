// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package type.property.additionalproperties.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.util.Configuration;
import type.property.additionalproperties.AdditionalPropertiesClientBuilder;
import type.property.additionalproperties.ExtendsDifferentSpreadFloatClient;
import type.property.additionalproperties.ExtendsDifferentSpreadModelArrayClient;
import type.property.additionalproperties.ExtendsDifferentSpreadModelClient;
import type.property.additionalproperties.ExtendsDifferentSpreadStringClient;
import type.property.additionalproperties.ExtendsFloatClient;
import type.property.additionalproperties.ExtendsModelArrayClient;
import type.property.additionalproperties.ExtendsModelClient;
import type.property.additionalproperties.ExtendsStringClient;
import type.property.additionalproperties.ExtendsUnknownClient;
import type.property.additionalproperties.ExtendsUnknownDerivedClient;
import type.property.additionalproperties.ExtendsUnknownDiscriminatedClient;
import type.property.additionalproperties.IsFloatClient;
import type.property.additionalproperties.IsModelArrayClient;
import type.property.additionalproperties.IsModelClient;
import type.property.additionalproperties.IsStringClient;
import type.property.additionalproperties.IsUnknownClient;
import type.property.additionalproperties.IsUnknownDerivedClient;
import type.property.additionalproperties.IsUnknownDiscriminatedClient;
import type.property.additionalproperties.MultipleSpreadClient;
import type.property.additionalproperties.SpreadDifferentFloatClient;
import type.property.additionalproperties.SpreadDifferentModelArrayClient;
import type.property.additionalproperties.SpreadDifferentModelClient;
import type.property.additionalproperties.SpreadDifferentStringClient;
import type.property.additionalproperties.SpreadFloatClient;
import type.property.additionalproperties.SpreadModelArrayClient;
import type.property.additionalproperties.SpreadModelClient;
import type.property.additionalproperties.SpreadRecordNonDiscriminatedUnion2Client;
import type.property.additionalproperties.SpreadRecordNonDiscriminatedUnion3Client;
import type.property.additionalproperties.SpreadRecordNonDiscriminatedUnionClient;
import type.property.additionalproperties.SpreadRecordUnionClient;
import type.property.additionalproperties.SpreadStringClient;

class AdditionalPropertiesClientTestBase extends TestProxyTestBase {
    protected ExtendsUnknownClient extendsUnknownClient;

    protected ExtendsUnknownDerivedClient extendsUnknownDerivedClient;

    protected ExtendsUnknownDiscriminatedClient extendsUnknownDiscriminatedClient;

    protected IsUnknownClient isUnknownClient;

    protected IsUnknownDerivedClient isUnknownDerivedClient;

    protected IsUnknownDiscriminatedClient isUnknownDiscriminatedClient;

    protected ExtendsStringClient extendsStringClient;

    protected IsStringClient isStringClient;

    protected SpreadStringClient spreadStringClient;

    protected ExtendsFloatClient extendsFloatClient;

    protected IsFloatClient isFloatClient;

    protected SpreadFloatClient spreadFloatClient;

    protected ExtendsModelClient extendsModelClient;

    protected IsModelClient isModelClient;

    protected SpreadModelClient spreadModelClient;

    protected ExtendsModelArrayClient extendsModelArrayClient;

    protected IsModelArrayClient isModelArrayClient;

    protected SpreadModelArrayClient spreadModelArrayClient;

    protected SpreadDifferentStringClient spreadDifferentStringClient;

    protected SpreadDifferentFloatClient spreadDifferentFloatClient;

    protected SpreadDifferentModelClient spreadDifferentModelClient;

    protected SpreadDifferentModelArrayClient spreadDifferentModelArrayClient;

    protected ExtendsDifferentSpreadStringClient extendsDifferentSpreadStringClient;

    protected ExtendsDifferentSpreadFloatClient extendsDifferentSpreadFloatClient;

    protected ExtendsDifferentSpreadModelClient extendsDifferentSpreadModelClient;

    protected ExtendsDifferentSpreadModelArrayClient extendsDifferentSpreadModelArrayClient;

    protected MultipleSpreadClient multipleSpreadClient;

    protected SpreadRecordUnionClient spreadRecordUnionClient;

    protected SpreadRecordNonDiscriminatedUnionClient spreadRecordNonDiscriminatedUnionClient;

    protected SpreadRecordNonDiscriminatedUnion2Client spreadRecordNonDiscriminatedUnion2Client;

    protected SpreadRecordNonDiscriminatedUnion3Client spreadRecordNonDiscriminatedUnion3Client;

    @Override
    protected void beforeTest() {
        AdditionalPropertiesClientBuilder extendsUnknownClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsUnknownClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsUnknownClient = extendsUnknownClientbuilder.buildExtendsUnknownClient();

        AdditionalPropertiesClientBuilder extendsUnknownDerivedClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsUnknownDerivedClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsUnknownDerivedClient = extendsUnknownDerivedClientbuilder.buildExtendsUnknownDerivedClient();

        AdditionalPropertiesClientBuilder extendsUnknownDiscriminatedClientbuilder
            = new AdditionalPropertiesClientBuilder()
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
                .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsUnknownDiscriminatedClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsUnknownDiscriminatedClient
            = extendsUnknownDiscriminatedClientbuilder.buildExtendsUnknownDiscriminatedClient();

        AdditionalPropertiesClientBuilder isUnknownClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            isUnknownClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        isUnknownClient = isUnknownClientbuilder.buildIsUnknownClient();

        AdditionalPropertiesClientBuilder isUnknownDerivedClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            isUnknownDerivedClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        isUnknownDerivedClient = isUnknownDerivedClientbuilder.buildIsUnknownDerivedClient();

        AdditionalPropertiesClientBuilder isUnknownDiscriminatedClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            isUnknownDiscriminatedClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        isUnknownDiscriminatedClient = isUnknownDiscriminatedClientbuilder.buildIsUnknownDiscriminatedClient();

        AdditionalPropertiesClientBuilder extendsStringClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsStringClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsStringClient = extendsStringClientbuilder.buildExtendsStringClient();

        AdditionalPropertiesClientBuilder isStringClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            isStringClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        isStringClient = isStringClientbuilder.buildIsStringClient();

        AdditionalPropertiesClientBuilder spreadStringClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadStringClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadStringClient = spreadStringClientbuilder.buildSpreadStringClient();

        AdditionalPropertiesClientBuilder extendsFloatClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsFloatClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsFloatClient = extendsFloatClientbuilder.buildExtendsFloatClient();

        AdditionalPropertiesClientBuilder isFloatClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            isFloatClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        isFloatClient = isFloatClientbuilder.buildIsFloatClient();

        AdditionalPropertiesClientBuilder spreadFloatClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadFloatClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadFloatClient = spreadFloatClientbuilder.buildSpreadFloatClient();

        AdditionalPropertiesClientBuilder extendsModelClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsModelClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsModelClient = extendsModelClientbuilder.buildExtendsModelClient();

        AdditionalPropertiesClientBuilder isModelClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            isModelClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        isModelClient = isModelClientbuilder.buildIsModelClient();

        AdditionalPropertiesClientBuilder spreadModelClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadModelClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadModelClient = spreadModelClientbuilder.buildSpreadModelClient();

        AdditionalPropertiesClientBuilder extendsModelArrayClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsModelArrayClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsModelArrayClient = extendsModelArrayClientbuilder.buildExtendsModelArrayClient();

        AdditionalPropertiesClientBuilder isModelArrayClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            isModelArrayClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        isModelArrayClient = isModelArrayClientbuilder.buildIsModelArrayClient();

        AdditionalPropertiesClientBuilder spreadModelArrayClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadModelArrayClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadModelArrayClient = spreadModelArrayClientbuilder.buildSpreadModelArrayClient();

        AdditionalPropertiesClientBuilder spreadDifferentStringClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadDifferentStringClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadDifferentStringClient = spreadDifferentStringClientbuilder.buildSpreadDifferentStringClient();

        AdditionalPropertiesClientBuilder spreadDifferentFloatClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadDifferentFloatClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadDifferentFloatClient = spreadDifferentFloatClientbuilder.buildSpreadDifferentFloatClient();

        AdditionalPropertiesClientBuilder spreadDifferentModelClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadDifferentModelClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadDifferentModelClient = spreadDifferentModelClientbuilder.buildSpreadDifferentModelClient();

        AdditionalPropertiesClientBuilder spreadDifferentModelArrayClientbuilder
            = new AdditionalPropertiesClientBuilder()
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
                .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadDifferentModelArrayClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadDifferentModelArrayClient = spreadDifferentModelArrayClientbuilder.buildSpreadDifferentModelArrayClient();

        AdditionalPropertiesClientBuilder extendsDifferentSpreadStringClientbuilder
            = new AdditionalPropertiesClientBuilder()
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
                .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsDifferentSpreadStringClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsDifferentSpreadStringClient
            = extendsDifferentSpreadStringClientbuilder.buildExtendsDifferentSpreadStringClient();

        AdditionalPropertiesClientBuilder extendsDifferentSpreadFloatClientbuilder
            = new AdditionalPropertiesClientBuilder()
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
                .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsDifferentSpreadFloatClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsDifferentSpreadFloatClient
            = extendsDifferentSpreadFloatClientbuilder.buildExtendsDifferentSpreadFloatClient();

        AdditionalPropertiesClientBuilder extendsDifferentSpreadModelClientbuilder
            = new AdditionalPropertiesClientBuilder()
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
                .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsDifferentSpreadModelClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsDifferentSpreadModelClient
            = extendsDifferentSpreadModelClientbuilder.buildExtendsDifferentSpreadModelClient();

        AdditionalPropertiesClientBuilder extendsDifferentSpreadModelArrayClientbuilder
            = new AdditionalPropertiesClientBuilder()
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
                .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            extendsDifferentSpreadModelArrayClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        extendsDifferentSpreadModelArrayClient
            = extendsDifferentSpreadModelArrayClientbuilder.buildExtendsDifferentSpreadModelArrayClient();

        AdditionalPropertiesClientBuilder multipleSpreadClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            multipleSpreadClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        multipleSpreadClient = multipleSpreadClientbuilder.buildMultipleSpreadClient();

        AdditionalPropertiesClientBuilder spreadRecordUnionClientbuilder = new AdditionalPropertiesClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadRecordUnionClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadRecordUnionClient = spreadRecordUnionClientbuilder.buildSpreadRecordUnionClient();

        AdditionalPropertiesClientBuilder spreadRecordNonDiscriminatedUnionClientbuilder
            = new AdditionalPropertiesClientBuilder()
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
                .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadRecordNonDiscriminatedUnionClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadRecordNonDiscriminatedUnionClient
            = spreadRecordNonDiscriminatedUnionClientbuilder.buildSpreadRecordNonDiscriminatedUnionClient();

        AdditionalPropertiesClientBuilder spreadRecordNonDiscriminatedUnion2Clientbuilder
            = new AdditionalPropertiesClientBuilder()
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
                .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadRecordNonDiscriminatedUnion2Clientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadRecordNonDiscriminatedUnion2Client
            = spreadRecordNonDiscriminatedUnion2Clientbuilder.buildSpreadRecordNonDiscriminatedUnion2Client();

        AdditionalPropertiesClientBuilder spreadRecordNonDiscriminatedUnion3Clientbuilder
            = new AdditionalPropertiesClientBuilder()
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
                .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            spreadRecordNonDiscriminatedUnion3Clientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        spreadRecordNonDiscriminatedUnion3Client
            = spreadRecordNonDiscriminatedUnion3Clientbuilder.buildSpreadRecordNonDiscriminatedUnion3Client();

    }
}
