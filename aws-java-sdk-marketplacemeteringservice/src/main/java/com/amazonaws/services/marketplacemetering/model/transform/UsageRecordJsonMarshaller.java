/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.marketplacemetering.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.marketplacemetering.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UsageRecordMarshaller
 */
public class UsageRecordJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(UsageRecord usageRecord, StructuredJsonGenerator jsonGenerator) {

        if (usageRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (usageRecord.getTimestamp() != null) {
                jsonGenerator.writeFieldName("Timestamp").writeValue(usageRecord.getTimestamp());
            }
            if (usageRecord.getCustomerIdentifier() != null) {
                jsonGenerator.writeFieldName("CustomerIdentifier").writeValue(usageRecord.getCustomerIdentifier());
            }
            if (usageRecord.getDimension() != null) {
                jsonGenerator.writeFieldName("Dimension").writeValue(usageRecord.getDimension());
            }
            if (usageRecord.getQuantity() != null) {
                jsonGenerator.writeFieldName("Quantity").writeValue(usageRecord.getQuantity());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static UsageRecordJsonMarshaller instance;

    public static UsageRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsageRecordJsonMarshaller();
        return instance;
    }

}
