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

package com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist;

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
    * Twilio - Api
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class IpAddressReader extends Reader<IpAddress> {
    private String ipAccessControlListSid;
    private String accountSid;
    private Integer pageSize;

    public IpAddressReader(final String ipAccessControlListSid){
        this.ipAccessControlListSid = ipAccessControlListSid;
    }
    public IpAddressReader(final String accountSid, final String ipAccessControlListSid){
        this.accountSid = accountSid;
        this.ipAccessControlListSid = ipAccessControlListSid;
    }

    public IpAddressReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<IpAddress> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<IpAddress> firstPage(final TwilioRestClient client) {
        String path = "/2010-04-01/Accounts/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses.json";
        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        path = path.replace("{"+"AccountSid"+"}", this.accountSid.toString());
        path = path.replace("{"+"IpAccessControlListSid"+"}", this.ipAccessControlListSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.API.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<IpAddress> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("IpAddress read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "ip_addresses",
            response.getContent(),
            IpAddress.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<IpAddress> previousPage(final Page<IpAddress> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<IpAddress> nextPage(final Page<IpAddress> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<IpAddress> getPage(final String targetUrl, final TwilioRestClient client) {
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

