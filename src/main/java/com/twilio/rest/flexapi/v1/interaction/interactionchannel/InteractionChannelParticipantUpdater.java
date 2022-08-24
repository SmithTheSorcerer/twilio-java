/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1.interaction.interactionchannel;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Flex
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class InteractionChannelParticipantUpdater extends Updater<InteractionChannelParticipant>{
    private String interactionSid;
    private String channelSid;
    private String sid;
    private InteractionChannelParticipant.Status status;

    public InteractionChannelParticipantUpdater(final String interactionSid, final String channelSid, final String sid, final InteractionChannelParticipant.Status status){
        this.interactionSid = interactionSid;
        this.channelSid = channelSid;
        this.sid = sid;
        this.status = status;
    }

    public InteractionChannelParticipantUpdater setStatus(final InteractionChannelParticipant.Status status){
        this.status = status;
        return this;
    }

    @Override
    public InteractionChannelParticipant update(final TwilioRestClient client){
        String path = "/v1/Interactions/{InteractionSid}/Channels/{ChannelSid}/Participants/{Sid}";

        path = path.replace("{"+"InteractionSid"+"}", this.interactionSid.toString());
        path = path.replace("{"+"ChannelSid"+"}", this.channelSid.toString());
        path = path.replace("{"+"Sid"+"}", this.sid.toString());
        path = path.replace("{"+"Status"+"}", this.status.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.FLEXAPI.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("InteractionChannelParticipant update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return InteractionChannelParticipant.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (status != null) {
            request.addPostParam("Status", status.toString());
    
        }
    }
}
