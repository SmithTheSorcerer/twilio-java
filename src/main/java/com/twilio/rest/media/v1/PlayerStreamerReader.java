/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Media
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.media.v1;

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



public class PlayerStreamerReader extends Reader<PlayerStreamer> {
    private PlayerStreamer.Order order;
    private PlayerStreamer.Status status;
    private Integer pageSize;

    public PlayerStreamerReader(){
    }

    public PlayerStreamerReader setOrder(final PlayerStreamer.Order order){
        this.order = order;
        return this;
    }
    public PlayerStreamerReader setStatus(final PlayerStreamer.Status status){
        this.status = status;
        return this;
    }
    public PlayerStreamerReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<PlayerStreamer> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<PlayerStreamer> firstPage(final TwilioRestClient client) {
        String path = "/v1/PlayerStreamers";

        Request request = new Request(
            HttpMethod.GET,
            Domains.MEDIA.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<PlayerStreamer> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("PlayerStreamer read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "player_streamers",
            response.getContent(),
            PlayerStreamer.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<PlayerStreamer> previousPage(final Page<PlayerStreamer> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.MEDIA.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<PlayerStreamer> nextPage(final Page<PlayerStreamer> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.MEDIA.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<PlayerStreamer> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (order != null) {
    
            request.addQueryParam("Order", order.toString());
        }
        if (status != null) {
    
            request.addQueryParam("Status", status.toString());
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if(getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
