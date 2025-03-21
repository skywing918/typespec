// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package type.property.additionalproperties;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import type.property.additionalproperties.models.IsFloatAdditionalProperties;

public class IsFloatClientTest {
    private final IsFloatClient client = new AdditionalPropertiesClientBuilder().buildIsFloatClient();

    @Test
    public void testPullAndGet() {
        IsFloatAdditionalProperties body = new IsFloatAdditionalProperties(43.125);
        Map<String, Double> propertyMap = new LinkedHashMap<>();
        propertyMap.put("prop", 43.125);
        body.setAdditionalProperties(propertyMap);
        client.put(body);

        IsFloatAdditionalProperties properties = client.get();
        Assertions.assertNotNull(properties);
        Assertions.assertNotNull(properties.getAdditionalProperties());
        Assertions.assertIterableEquals(propertyMap.entrySet(), properties.getAdditionalProperties().entrySet());
    }
}
