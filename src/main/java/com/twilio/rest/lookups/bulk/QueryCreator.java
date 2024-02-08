/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Lookup
 * Lookup APIs for individual, bulk and job based requests  Discussion topics: - API version to use - Using or not lookup in the path or just as lookups subdomain
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.lookups.bulk;

import com.fasterxml.jackson.databind.ObjectMapper;
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




public class QueryCreator extends Creator<Query>{
    private Query.LookupRequest1 lookupRequest1;

    public QueryCreator() {
    }

    public QueryCreator setLookupRequest1(final Query.LookupRequest1 lookupRequest1){
        this.lookupRequest1 = lookupRequest1;
        return this;
    }

    @Override
    public Query create(final TwilioRestClient client){
        String path = "/v2/batch/query";


        Request request = new Request(
            HttpMethod.POST,
            Domains.LOOKUPS.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.JSON);
        addPostParams(request, client);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Query creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return Query.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request, TwilioRestClient client) {
        ObjectMapper objectMapper = client.getObjectMapper();
        if (lookupRequest1 != null) {
            request.setBody(Query.toJson(lookupRequest1, objectMapper));
        }
    }
}
