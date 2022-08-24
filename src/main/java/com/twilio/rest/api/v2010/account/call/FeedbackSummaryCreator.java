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

package com.twilio.rest.api.v2010.account.call;

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
import java.time.LocalDate;
import java.net.URI;
import com.twilio.converter.DateConverter;




import java.net.URI;

/*
    * Twilio - Api
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class FeedbackSummaryCreator extends Creator<FeedbackSummary>{
    private LocalDate startDate;
    private LocalDate endDate;
    private String accountSid;
    private Boolean includeSubaccounts;
    private URI statusCallback;
    private HttpMethod statusCallbackMethod;

    public FeedbackSummaryCreator(final LocalDate startDate, final LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public FeedbackSummaryCreator(final String accountSid, final LocalDate startDate, final LocalDate endDate) {
        this.accountSid = accountSid;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public FeedbackSummaryCreator setStartDate(final LocalDate startDate){
        this.startDate = startDate;
        return this;
    }
    public FeedbackSummaryCreator setEndDate(final LocalDate endDate){
        this.endDate = endDate;
        return this;
    }
    public FeedbackSummaryCreator setIncludeSubaccounts(final Boolean includeSubaccounts){
        this.includeSubaccounts = includeSubaccounts;
        return this;
    }
    public FeedbackSummaryCreator setStatusCallback(final URI statusCallback){
        this.statusCallback = statusCallback;
        return this;
    }

    public FeedbackSummaryCreator setStatusCallback(final String statusCallback){
    this.statusCallback = Promoter.uriFromString(statusCallback);
    return this;
    }
    public FeedbackSummaryCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod){
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    @Override
    public FeedbackSummary create(final TwilioRestClient client){
        String path = "/2010-04-01/Accounts/{AccountSid}/Calls/FeedbackSummary.json";

        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        path = path.replace("{"+"AccountSid"+"}", this.accountSid.toString());
        path = path.replace("{"+"StartDate"+"}", this.startDate.toString());
        path = path.replace("{"+"EndDate"+"}", this.endDate.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("FeedbackSummary creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return FeedbackSummary.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (startDate != null) {
            request.addPostParam("StartDate", DateConverter.dateStringFromLocalDate(startDate));

        }
        if (endDate != null) {
            request.addPostParam("EndDate", DateConverter.dateStringFromLocalDate(endDate));

        }
        if (includeSubaccounts != null) {
            request.addPostParam("IncludeSubaccounts", includeSubaccounts.toString());
    
        }
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
    
        }
        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
    
        }
    }
}
