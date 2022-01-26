/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.insights.v1;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class SettingFetcher extends Fetcher<Setting> {
    private String subaccountSid;

    /**
     * The subaccount_sid.
     *
     * @param subaccountSid The subaccount_sid
     * @return this
     */
    public SettingFetcher setSubaccountSid(final String subaccountSid) {
        this.subaccountSid = subaccountSid;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched Setting
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Setting fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.INSIGHTS.toString(),
            "/v1/Voice/Settings"
        );

        addQueryParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Setting fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Setting.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (subaccountSid != null) {
            request.addQueryParam("SubaccountSid", subaccountSid);
        }
    }
}