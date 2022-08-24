/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Ip_messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.ipmessaging.v2.service.channel;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.util.List;

import java.util.List;




/*
    * Twilio - Ip_messaging
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class WebhookCreator extends Creator<Webhook>{
    private String serviceSid;
    private String channelSid;
    private Webhook.Type type;
    private String configurationUrl;
    private Webhook.Method configurationMethod;
    private List<String> configurationFilters;
    private List<String> configurationTriggers;
    private String configurationFlowSid;
    private Integer configurationRetryCount;

    public WebhookCreator(final String serviceSid, final String channelSid, final Webhook.Type type) {
        this.serviceSid = serviceSid;
        this.channelSid = channelSid;
        this.type = type;
    }

    public WebhookCreator setType(final Webhook.Type type){
        this.type = type;
        return this;
    }
    public WebhookCreator setConfigurationUrl(final String configurationUrl){
        this.configurationUrl = configurationUrl;
        return this;
    }
    public WebhookCreator setConfigurationMethod(final Webhook.Method configurationMethod){
        this.configurationMethod = configurationMethod;
        return this;
    }
    public WebhookCreator setConfigurationFilters(final List<String> configurationFilters){
        this.configurationFilters = configurationFilters;
        return this;
    }
    public WebhookCreator setConfigurationTriggers(final List<String> configurationTriggers){
        this.configurationTriggers = configurationTriggers;
        return this;
    }
    public WebhookCreator setConfigurationFlowSid(final String configurationFlowSid){
        this.configurationFlowSid = configurationFlowSid;
        return this;
    }
    public WebhookCreator setConfigurationRetryCount(final Integer configurationRetryCount){
        this.configurationRetryCount = configurationRetryCount;
        return this;
    }

    @Override
    public Webhook create(final TwilioRestClient client){
        String path = "/v2/Services/{ServiceSid}/Channels/{ChannelSid}/Webhooks";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());
        path = path.replace("{"+"ChannelSid"+"}", this.channelSid.toString());
        path = path.replace("{"+"Type"+"}", this.type.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.IPMESSAGING.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Webhook creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Webhook.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (type != null) {
            request.addPostParam("Type", type.toString());
    
        }
        if (configurationUrl != null) {
            request.addPostParam("Configuration.Url", configurationUrl);
    
        }
        if (configurationMethod != null) {
            request.addPostParam("ConfigurationMethod", configurationMethod.toString());
    
        }
        if (configurationFilters != null) {
            for (String prop : configurationFilters) {
                request.addPostParam("Configuration.Filters", prop);
            }
    
        }
        if (configurationTriggers != null) {
            for (String prop : configurationTriggers) {
                request.addPostParam("Configuration.Triggers", prop);
            }
    
        }
        if (configurationFlowSid != null) {
            request.addPostParam("Configuration.FlowSid", configurationFlowSid);
    
        }
        if (configurationRetryCount != null) {
            request.addPostParam("ConfigurationRetryCount", configurationRetryCount.toString());
    
        }
    }
}
