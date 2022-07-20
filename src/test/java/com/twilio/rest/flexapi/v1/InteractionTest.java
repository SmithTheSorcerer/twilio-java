/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.flexapi.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class InteractionTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.FLEXAPI.toString(),
                                          "/v1/Interactions/KDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Interaction.fetcher("KDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"KDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel\": {\"type\": \"sms\",\"sid\": \"UOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},\"routing\": {\"properties\": {\"workflow_sid\": \"WWxx\",\"attributes\": \"WWxx\",\"task_channel_unique_name\": \"sms\",\"routing_target\": \"WKXX\",\"queue_name\": \"WQXX\"}},\"url\": \"https://flex-api.twilio.com/v1/Interactions/KDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"channels\": \"https://flex-api.twilio.com/v1/Interactions/KDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Interaction.fetcher("KDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.FLEXAPI.toString(),
                                          "/v1/Interactions");
            request.addPostParam("Channel", serialize(new java.util.HashMap<String, Object>()));
            request.addPostParam("Routing", serialize(new java.util.HashMap<String, Object>()));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Interaction.creator(new java.util.HashMap<String, Object>(), new java.util.HashMap<String, Object>()).create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"KDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel\": {\"type\": \"sms\",\"sid\": \"UOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},\"routing\": {\"properties\": {\"workflow_sid\": \"WWxx\",\"attributes\": \"WWxx\",\"task_channel_unique_name\": \"sms\",\"routing_target\": \"WKXX\",\"queue_name\": \"WQXX\"}},\"url\": \"https://flex-api.twilio.com/v1/Interactions/KDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"channels\": \"https://flex-api.twilio.com/v1/Interactions/KDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Interaction.creator(new java.util.HashMap<String, Object>(), new java.util.HashMap<String, Object>()).create();
    }
}