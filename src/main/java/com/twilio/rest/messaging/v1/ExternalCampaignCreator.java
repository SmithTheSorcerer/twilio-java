/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.messaging.v1;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Messaging
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class ExternalCampaignCreator extends Creator<ExternalCampaign>{
    private String campaignId;
    private String messagingServiceSid;

    public ExternalCampaignCreator(final String campaignId, final String messagingServiceSid) {
        this.campaignId = campaignId;
        this.messagingServiceSid = messagingServiceSid;
    }

    public ExternalCampaignCreator setCampaignId(final String campaignId){
        this.campaignId = campaignId;
        return this;
    }
    public ExternalCampaignCreator setMessagingServiceSid(final String messagingServiceSid){
        this.messagingServiceSid = messagingServiceSid;
        return this;
    }

    @Override
    public ExternalCampaign create(final TwilioRestClient client){
        String path = "/v1/Services/PreregisteredUsa2p";

        path = path.replace("{"+"CampaignId"+"}", this.campaignId.toString());
        path = path.replace("{"+"MessagingServiceSid"+"}", this.messagingServiceSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.MESSAGING.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("ExternalCampaign creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return ExternalCampaign.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (campaignId != null) {
            request.addPostParam("CampaignId", campaignId);
    
        }
        if (messagingServiceSid != null) {
            request.addPostParam("MessagingServiceSid", messagingServiceSid);
    
        }
    }
}
