/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v2.service;

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

public class AccessTokenTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.VERIFY.toString(),
                                          "/v2/Services/VAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/AccessTokens");
            request.addPostParam("Identity", serialize("identity"));
            request.addPostParam("FactorType", serialize(AccessToken.FactorTypes.PUSH));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AccessToken.creator("VAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "identity", AccessToken.FactorTypes.PUSH).create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"YKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"VAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"entity_identity\": \"ff483d1ff591898a9942916050d2ca3f\",\"factor_type\": \"push\",\"factor_friendly_name\": \"John Doe iPhone\",\"token\": \"eyJ6aXAiOiJERUYiLCJraWQiOiJTQVNfUzNfX19LTVNfdjEiLCJjdHkiOiJ0d2lsaW8tZnBhO3Y9MSIsImVuYyI6IkEyNTZHQ00iLCJhbGciOiJkaXIifQ..qjltWfIgQaTwp2De.81Z_6W4kR-hdlAUvJQCbwS8CQ7QAoFRkOvNMoySEj8zEB4BAY3MXhPARfaK4Lnr4YceA2cXEmrzPKQ7bPm0XZMGYm1fqLYzAR8YAqUetI9WEdQLFytg1h4XnJnXhgd99eNXsLkpKHhsCnFkchV9eGpRrdrfB0STR5Xq0fdakomb98iuIFt1XtP0_iqxvxQZKe1O4035XhK_ELVwQBz_qdI77XRZBFM0REAzlnEOe61nOcQxkaIM9Qel9L7RPhcndcCPFAyYjxo6Ri5c4vOnszLDiHmeK9Ep9fRE5-Oz0px0ZEg_FgTUEPFPo2OHQj076H1plJnFr-qPINDJkUL_i7loqG1IlapOi1JSlflPH-Ebj4hhpBdMIcs-OX7jhqzmVqkIKWkpPyPEmfvY2-eA5Zpoo08YpqAJ3G1l_xEcHl28Ijkefj1mdb6E8POx41skAwXCpdfIbzWzV_VjFpmwhacS3JZNt9C4hVG4Yp-RGPEl1C7aJHRIUavAmoRHaXbfG20zzv5Zu0P5PcopDszzoqVfZpzc.GCt35DWTurtP-QaIL5aBSQ\",\"url\": \"https://verify.twilio.com/v2/Services/VAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AccessTokens/YKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        AccessToken.creator("VAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "identity", AccessToken.FactorTypes.PUSH).create();
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VERIFY.toString(),
                                          "/v2/Services/VAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/AccessTokens/YKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AccessToken.fetcher("VAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "YKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"YKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"VAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"entity_identity\": \"ff483d1ff591898a9942916050d2ca3f\",\"factor_type\": \"push\",\"factor_friendly_name\": \"John Doe iPhone\",\"token\": \"eyJ6aXAiOiJERUYiLCJraWQiOiJTQVNfUzNfX19LTVNfdjEiLCJjdHkiOiJ0d2lsaW8tZnBhO3Y9MSIsImVuYyI6IkEyNTZHQ00iLCJhbGciOiJkaXIifQ..qjltWfIgQaTwp2De.81Z_6W4kR-hdlAUvJQCbwS8CQ7QAoFRkOvNMoySEj8zEB4BAY3MXhPARfaK4Lnr4YceA2cXEmrzPKQ7bPm0XZMGYm1fqLYzAR8YAqUetI9WEdQLFytg1h4XnJnXhgd99eNXsLkpKHhsCnFkchV9eGpRrdrfB0STR5Xq0fdakomb98iuIFt1XtP0_iqxvxQZKe1O4035XhK_ELVwQBz_qdI77XRZBFM0REAzlnEOe61nOcQxkaIM9Qel9L7RPhcndcCPFAyYjxo6Ri5c4vOnszLDiHmeK9Ep9fRE5-Oz0px0ZEg_FgTUEPFPo2OHQj076H1plJnFr-qPINDJkUL_i7loqG1IlapOi1JSlflPH-Ebj4hhpBdMIcs-OX7jhqzmVqkIKWkpPyPEmfvY2-eA5Zpoo08YpqAJ3G1l_xEcHl28Ijkefj1mdb6E8POx41skAwXCpdfIbzWzV_VjFpmwhacS3JZNt9C4hVG4Yp-RGPEl1C7aJHRIUavAmoRHaXbfG20zzv5Zu0P5PcopDszzoqVfZpzc.GCt35DWTurtP-QaIL5aBSQ\",\"url\": \"https://verify.twilio.com/v2/Services/VAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/AccessTokens/YKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(AccessToken.fetcher("VAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "YKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }
}