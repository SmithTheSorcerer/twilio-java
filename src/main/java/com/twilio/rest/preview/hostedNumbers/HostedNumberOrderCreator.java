/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Preview
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.preview.hostedNumbers;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.util.List;
import java.net.URI;

import java.util.List;



import java.net.URI;

/*
    * Twilio - Preview
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class HostedNumberOrderCreator extends Creator<HostedNumberOrder>{
    private com.twilio.type.PhoneNumber phoneNumber;
    private Boolean smsCapability;
    private String accountSid;
    private String friendlyName;
    private String uniqueName;
    private List<String> ccEmails;
    private URI smsUrl;
    private HttpMethod smsMethod;
    private URI smsFallbackUrl;
    private HttpMethod smsFallbackMethod;
    private URI statusCallbackUrl;
    private HttpMethod statusCallbackMethod;
    private String smsApplicationSid;
    private String addressSid;
    private String email;
    private HostedNumberOrder.VerificationType verificationType;
    private String verificationDocumentSid;

    public HostedNumberOrderCreator(final com.twilio.type.PhoneNumber phoneNumber, final Boolean smsCapability) {
        this.phoneNumber = phoneNumber;
        this.smsCapability = smsCapability;
    }

    public HostedNumberOrderCreator setPhoneNumber(final com.twilio.type.PhoneNumber phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public HostedNumberOrderCreator setPhoneNumber(final String phoneNumber){
    this.phoneNumber = Promoter.phoneNumberFromString(phoneNumber);
    return this;
    }
    public HostedNumberOrderCreator setSmsCapability(final Boolean smsCapability){
        this.smsCapability = smsCapability;
        return this;
    }
    public HostedNumberOrderCreator setAccountSid(final String accountSid){
        this.accountSid = accountSid;
        return this;
    }
    public HostedNumberOrderCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public HostedNumberOrderCreator setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public HostedNumberOrderCreator setCcEmails(final List<String> ccEmails){
        this.ccEmails = ccEmails;
        return this;
    }
    public HostedNumberOrderCreator setSmsUrl(final URI smsUrl){
        this.smsUrl = smsUrl;
        return this;
    }

    public HostedNumberOrderCreator setSmsUrl(final String smsUrl){
    this.smsUrl = Promoter.uriFromString(smsUrl);
    return this;
    }
    public HostedNumberOrderCreator setSmsMethod(final HttpMethod smsMethod){
        this.smsMethod = smsMethod;
        return this;
    }
    public HostedNumberOrderCreator setSmsFallbackUrl(final URI smsFallbackUrl){
        this.smsFallbackUrl = smsFallbackUrl;
        return this;
    }

    public HostedNumberOrderCreator setSmsFallbackUrl(final String smsFallbackUrl){
    this.smsFallbackUrl = Promoter.uriFromString(smsFallbackUrl);
    return this;
    }
    public HostedNumberOrderCreator setSmsFallbackMethod(final HttpMethod smsFallbackMethod){
        this.smsFallbackMethod = smsFallbackMethod;
        return this;
    }
    public HostedNumberOrderCreator setStatusCallbackUrl(final URI statusCallbackUrl){
        this.statusCallbackUrl = statusCallbackUrl;
        return this;
    }

    public HostedNumberOrderCreator setStatusCallbackUrl(final String statusCallbackUrl){
    this.statusCallbackUrl = Promoter.uriFromString(statusCallbackUrl);
    return this;
    }
    public HostedNumberOrderCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod){
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }
    public HostedNumberOrderCreator setSmsApplicationSid(final String smsApplicationSid){
        this.smsApplicationSid = smsApplicationSid;
        return this;
    }
    public HostedNumberOrderCreator setAddressSid(final String addressSid){
        this.addressSid = addressSid;
        return this;
    }
    public HostedNumberOrderCreator setEmail(final String email){
        this.email = email;
        return this;
    }
    public HostedNumberOrderCreator setVerificationType(final HostedNumberOrder.VerificationType verificationType){
        this.verificationType = verificationType;
        return this;
    }
    public HostedNumberOrderCreator setVerificationDocumentSid(final String verificationDocumentSid){
        this.verificationDocumentSid = verificationDocumentSid;
        return this;
    }

    @Override
    public HostedNumberOrder create(final TwilioRestClient client){
        String path = "/HostedNumbers/HostedNumberOrders";

        path = path.replace("{"+"PhoneNumber"+"}", this.phoneNumber.encode("utf-8"));
        path = path.replace("{"+"SmsCapability"+"}", this.smsCapability.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("HostedNumberOrder creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return HostedNumberOrder.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (phoneNumber != null) {
            request.addPostParam("PhoneNumber", phoneNumber.toString());
    
        }
        if (smsCapability != null) {
            request.addPostParam("SmsCapability", smsCapability.toString());
    
        }
        if (accountSid != null) {
            request.addPostParam("AccountSid", accountSid);
    
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
        if (ccEmails != null) {
            for (String prop : ccEmails) {
                request.addPostParam("CcEmails", prop);
            }
    
        }
        if (smsUrl != null) {
            request.addPostParam("SmsUrl", smsUrl.toString());
    
        }
        if (smsMethod != null) {
            request.addPostParam("SmsMethod", smsMethod.toString());
    
        }
        if (smsFallbackUrl != null) {
            request.addPostParam("SmsFallbackUrl", smsFallbackUrl.toString());
    
        }
        if (smsFallbackMethod != null) {
            request.addPostParam("SmsFallbackMethod", smsFallbackMethod.toString());
    
        }
        if (statusCallbackUrl != null) {
            request.addPostParam("StatusCallbackUrl", statusCallbackUrl.toString());
    
        }
        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
    
        }
        if (smsApplicationSid != null) {
            request.addPostParam("SmsApplicationSid", smsApplicationSid);
    
        }
        if (addressSid != null) {
            request.addPostParam("AddressSid", addressSid);
    
        }
        if (email != null) {
            request.addPostParam("Email", email);
    
        }
        if (verificationType != null) {
            request.addPostParam("VerificationType", verificationType.toString());
    
        }
        if (verificationDocumentSid != null) {
            request.addPostParam("VerificationDocumentSid", verificationDocumentSid);
    
        }
    }
}
