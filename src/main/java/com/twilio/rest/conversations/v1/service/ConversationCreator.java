/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Conversations
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.conversations.v1.service;

import com.twilio.base.Creator;
import com.twilio.constant.EnumConstants;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.time.ZonedDateTime;




public class ConversationCreator extends Creator<Conversation>{
    private String pathChatServiceSid;
    private Conversation.WebhookEnabledType xTwilioWebhookEnabled;
    private String friendlyName;
    private String uniqueName;
    private String attributes;
    private String messagingServiceSid;
    private ZonedDateTime dateCreated;
    private ZonedDateTime dateUpdated;
    private Conversation.State state;
    private String timersInactive;
    private String timersClosed;

    public ConversationCreator(final String pathChatServiceSid) {
        this.pathChatServiceSid = pathChatServiceSid;
    }

    public ConversationCreator setXTwilioWebhookEnabled(final Conversation.WebhookEnabledType xTwilioWebhookEnabled){
        this.xTwilioWebhookEnabled = xTwilioWebhookEnabled;
        return this;
    }
    public ConversationCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public ConversationCreator setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public ConversationCreator setAttributes(final String attributes){
        this.attributes = attributes;
        return this;
    }
    public ConversationCreator setMessagingServiceSid(final String messagingServiceSid){
        this.messagingServiceSid = messagingServiceSid;
        return this;
    }
    public ConversationCreator setDateCreated(final ZonedDateTime dateCreated){
        this.dateCreated = dateCreated;
        return this;
    }
    public ConversationCreator setDateUpdated(final ZonedDateTime dateUpdated){
        this.dateUpdated = dateUpdated;
        return this;
    }
    public ConversationCreator setState(final Conversation.State state){
        this.state = state;
        return this;
    }
    public ConversationCreator setTimersInactive(final String timersInactive){
        this.timersInactive = timersInactive;
        return this;
    }
    public ConversationCreator setTimersClosed(final String timersClosed){
        this.timersClosed = timersClosed;
        return this;
    }

    @Override
    public Conversation create(final TwilioRestClient client){
        String path = "/v1/Services/{ChatServiceSid}/Conversations";

        path = path.replace("{"+"ChatServiceSid"+"}", this.pathChatServiceSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.CONVERSATIONS.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Conversation creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return Conversation.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
        if (attributes != null) {
            request.addPostParam("Attributes", attributes);
    
        }
        if (messagingServiceSid != null) {
            request.addPostParam("MessagingServiceSid", messagingServiceSid);
    
        }
        if (dateCreated != null) {
            request.addPostParam("DateCreated", dateCreated.toInstant().toString());

        }
        if (dateUpdated != null) {
            request.addPostParam("DateUpdated", dateUpdated.toInstant().toString());

        }
        if (state != null) {
            request.addPostParam("State", state.toString());
    
        }
        if (timersInactive != null) {
            request.addPostParam("Timers.Inactive", timersInactive);
    
        }
        if (timersClosed != null) {
            request.addPostParam("Timers.Closed", timersClosed);
    
        }
    }
    private void addHeaderParams(final Request request) {
        if (xTwilioWebhookEnabled != null) {
            request.addHeaderParam("X-Twilio-Webhook-Enabled", xTwilioWebhookEnabled.toString());
        }
    }
}
