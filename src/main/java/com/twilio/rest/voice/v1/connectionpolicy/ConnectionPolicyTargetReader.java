/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Voice
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.voice.v1.connectionpolicy;

import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.base.Page;





/*
    * Twilio - Voice
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class ConnectionPolicyTargetReader extends Reader<ConnectionPolicyTarget> {
    private String connectionPolicySid;
    private Integer pageSize;

    public ConnectionPolicyTargetReader(final String connectionPolicySid){
        this.connectionPolicySid = connectionPolicySid;
    }

    public ConnectionPolicyTargetReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<ConnectionPolicyTarget> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<ConnectionPolicyTarget> firstPage(final TwilioRestClient client) {
        String path = "/v1/ConnectionPolicies/{ConnectionPolicySid}/Targets";
        path = path.replace("{"+"ConnectionPolicySid"+"}", this.connectionPolicySid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.VOICE.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<ConnectionPolicyTarget> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("ConnectionPolicyTarget read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "targets",
            response.getContent(),
            ConnectionPolicyTarget.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<ConnectionPolicyTarget> previousPage(final Page<ConnectionPolicyTarget> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.VOICE.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<ConnectionPolicyTarget> nextPage(final Page<ConnectionPolicyTarget> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.VOICE.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<ConnectionPolicyTarget> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }
    }
}

