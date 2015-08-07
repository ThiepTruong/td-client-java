/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.treasuredata.client.api;

public class TDApiClientConfig
{
    private final String endpoint;
    private final String apiKey;
    private final String internalKey;
    private final String internalKeyVersion;

    public TDApiClientConfig(String apiKey) {
        this("api.treasuredata.com", null, null, null);
    }

    public TDApiClientConfig(String endpoint, String apiKey,  String internalKey, String internalKeyVersion)
    {
        this.endpoint = endpoint;
        this.apiKey = apiKey;
        this.internalKey = internalKey;
        this.internalKeyVersion = internalKeyVersion;
    }

    public String getEndpoint()
    {
        return endpoint;
    }

    public String getApiKey()
    {
        return apiKey;
    }

    public String getInternalKey()
    {
        return internalKey;
    }

    public String getInternalKeyVersion()
    {
        return internalKeyVersion;
    }
}
