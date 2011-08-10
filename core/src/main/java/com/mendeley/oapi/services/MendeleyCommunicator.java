/*
 * Copyright 2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.mendeley.oapi.services;

import java.util.Map;

import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

/**
 * The Interface MendeleyCommunicator.
 */
public interface MendeleyCommunicator {

    /**
     * Sets the request headers.
     * 
     * @param requestHeaders the request headers
     */
    public void setRequestHeaders(Map<String, String> requestHeaders);

    /**
     * Gets the request headers.
     * 
     * @return the request headers
     */
    public Map<String, String> getRequestHeaders();

    /**
     * Adds the request header.
     * 
     * @param headerName the header name
     * @param headerValue the header value
     */
    public void addRequestHeader(String headerName, String headerValue);

    /**
     * Removes the request header.
     * 
     * @param headerName the header name
     */
    public void removeRequestHeader(String headerName);
    
    /**
     * Sets the api consumer.
     * 
     * @param apiConsumer the new api consumer
     */
    public void setApiConsumer(MendeleyApiConsumer apiConsumer);
}
