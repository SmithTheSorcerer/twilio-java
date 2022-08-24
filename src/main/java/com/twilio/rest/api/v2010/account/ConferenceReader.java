/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account;

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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;





/*
    * Twilio - Api
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class ConferenceReader extends Reader<Conference> {
    private String accountSid;
    private LocalDate dateCreated;
    private LocalDate dateCreatedBefore;
    private LocalDate dateCreatedAfter;
    private LocalDate dateUpdated;
    private LocalDate dateUpdatedBefore;
    private LocalDate dateUpdatedAfter;
    private String friendlyName;
    private Conference.Status status;
    private Integer pageSize;

    public ConferenceReader(){
    }
    public ConferenceReader(final String accountSid){
        this.accountSid = accountSid;
    }

    public ConferenceReader setDateCreated(final LocalDate dateCreated){
        this.dateCreated = dateCreated;
        return this;
    }
    public ConferenceReader setDateCreatedBefore(final LocalDate dateCreatedBefore){
        this.dateCreatedBefore = dateCreatedBefore;
        return this;
    }
    public ConferenceReader setDateCreatedAfter(final LocalDate dateCreatedAfter){
        this.dateCreatedAfter = dateCreatedAfter;
        return this;
    }
    public ConferenceReader setDateUpdated(final LocalDate dateUpdated){
        this.dateUpdated = dateUpdated;
        return this;
    }
    public ConferenceReader setDateUpdatedBefore(final LocalDate dateUpdatedBefore){
        this.dateUpdatedBefore = dateUpdatedBefore;
        return this;
    }
    public ConferenceReader setDateUpdatedAfter(final LocalDate dateUpdatedAfter){
        this.dateUpdatedAfter = dateUpdatedAfter;
        return this;
    }
    public ConferenceReader setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public ConferenceReader setStatus(final Conference.Status status){
        this.status = status;
        return this;
    }
    public ConferenceReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<Conference> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<Conference> firstPage(final TwilioRestClient client) {
        String path = "/2010-04-01/Accounts/{AccountSid}/Conferences.json";
        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        path = path.replace("{"+"AccountSid"+"}", this.accountSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.API.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<Conference> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Conference read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "conferences",
            response.getContent(),
            Conference.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<Conference> previousPage(final Page<Conference> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<Conference> nextPage(final Page<Conference> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Conference> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (dateCreated != null) {
            request.addQueryParam("DateCreated", dateCreated.format(DateTimeFormatter.ofPattern(Request.QUERY_STRING_DATE_TIME_FORMAT)));
        }
        else if (dateCreatedAfter != null || dateCreatedBefore != null) {
            request.addQueryDateRange("DateCreated", dateCreatedAfter, dateCreatedBefore);
        }
        if (dateUpdated != null) {
            request.addQueryParam("DateUpdated", dateUpdated.format(DateTimeFormatter.ofPattern(Request.QUERY_STRING_DATE_TIME_FORMAT)));
        }
        else if (dateUpdatedAfter != null || dateUpdatedBefore != null) {
            request.addQueryDateRange("DateUpdated", dateUpdatedAfter, dateUpdatedBefore);
        }
        if (friendlyName != null) {
    
            request.addQueryParam("FriendlyName", friendlyName);
        }
        if (status != null) {
    
            request.addQueryParam("Status", status.toString());
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }
    }
}

