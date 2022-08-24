/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Trusthub
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.trusthub.v1;

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
import java.net.URI;




import java.net.URI;

/*
    * Twilio - Trusthub
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class TrustProductsCreator extends Creator<TrustProducts>{
    private String friendlyName;
    private String email;
    private String policySid;
    private URI statusCallback;

    public TrustProductsCreator(final String friendlyName, final String email, final String policySid) {
        this.friendlyName = friendlyName;
        this.email = email;
        this.policySid = policySid;
    }

    public TrustProductsCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public TrustProductsCreator setEmail(final String email){
        this.email = email;
        return this;
    }
    public TrustProductsCreator setPolicySid(final String policySid){
        this.policySid = policySid;
        return this;
    }
    public TrustProductsCreator setStatusCallback(final URI statusCallback){
        this.statusCallback = statusCallback;
        return this;
    }

    public TrustProductsCreator setStatusCallback(final String statusCallback){
    this.statusCallback = Promoter.uriFromString(statusCallback);
    return this;
    }

    @Override
    public TrustProducts create(final TwilioRestClient client){
        String path = "/v1/TrustProducts";

        path = path.replace("{"+"FriendlyName"+"}", this.friendlyName.toString());
        path = path.replace("{"+"Email"+"}", this.email.toString());
        path = path.replace("{"+"PolicySid"+"}", this.policySid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.TRUSTHUB.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("TrustProducts creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return TrustProducts.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (email != null) {
            request.addPostParam("Email", email);
    
        }
        if (policySid != null) {
            request.addPostParam("PolicySid", policySid);
    
        }
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
    
        }
    }
}
