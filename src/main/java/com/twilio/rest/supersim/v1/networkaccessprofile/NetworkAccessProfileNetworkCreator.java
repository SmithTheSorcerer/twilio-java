/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.supersim.v1.networkaccessprofile;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class NetworkAccessProfileNetworkCreator extends Creator<NetworkAccessProfileNetwork> {
    private final String pathNetworkAccessProfileSid;
    private final String network;

    /**
     * Construct a new NetworkAccessProfileNetworkCreator.
     *
     * @param pathNetworkAccessProfileSid The unique string that identifies the
     *                                    Network Access Profile resource
     * @param network The SID that identifies the Network resource
     */
    public NetworkAccessProfileNetworkCreator(final String pathNetworkAccessProfileSid,
                                              final String network) {
        this.pathNetworkAccessProfileSid = pathNetworkAccessProfileSid;
        this.network = network;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created NetworkAccessProfileNetwork
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public NetworkAccessProfileNetwork create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.SUPERSIM.toString(),
            "/v1/NetworkAccessProfiles/" + this.pathNetworkAccessProfileSid + "/Networks",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("NetworkAccessProfileNetwork creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return NetworkAccessProfileNetwork.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (network != null) {
            request.addPostParam("Network", network);
        }
    }
}