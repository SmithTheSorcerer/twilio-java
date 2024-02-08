/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Trusthub
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.trusthub.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.Objects;

import lombok.ToString;


@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ComplianceTollfreeInquiries extends Resource {
    private static final long serialVersionUID = 153862952025802L;

    

    public static ComplianceTollfreeInquiriesCreator creator(final com.twilio.type.PhoneNumber tollfreePhoneNumber, final String notificationEmail){
        return new ComplianceTollfreeInquiriesCreator(tollfreePhoneNumber, notificationEmail);
    }

    /**
    * Converts a JSON String into a ComplianceTollfreeInquiries object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return ComplianceTollfreeInquiries object represented by the provided JSON
    */
    public static ComplianceTollfreeInquiries fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ComplianceTollfreeInquiries.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a ComplianceTollfreeInquiries object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return ComplianceTollfreeInquiries object represented by the provided JSON
    */
    public static ComplianceTollfreeInquiries fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ComplianceTollfreeInquiries.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public enum OptInType {
        VERBAL("VERBAL"),
        WEB_FORM("WEB_FORM"),
        PAPER_FORM("PAPER_FORM"),
        VIA_TEXT("VIA_TEXT"),
        MOBILE_QR_CODE("MOBILE_QR_CODE");

        private final String value;

        private OptInType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static OptInType forValue(final String value) {
            return Promoter.enumFromString(value, OptInType.values());
        }
    }

    private final String inquiryId;
    private final String inquirySessionToken;
    private final String registrationId;
    private final URI url;

    @JsonCreator
    private ComplianceTollfreeInquiries(
        @JsonProperty("inquiry_id")
        final String inquiryId,

        @JsonProperty("inquiry_session_token")
        final String inquirySessionToken,

        @JsonProperty("registration_id")
        final String registrationId,

        @JsonProperty("url")
        final URI url
    ) {
        this.inquiryId = inquiryId;
        this.inquirySessionToken = inquirySessionToken;
        this.registrationId = registrationId;
        this.url = url;
    }

        public final String getInquiryId() {
            return this.inquiryId;
        }
        public final String getInquirySessionToken() {
            return this.inquirySessionToken;
        }
        public final String getRegistrationId() {
            return this.registrationId;
        }
        public final URI getUrl() {
            return this.url;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ComplianceTollfreeInquiries other = (ComplianceTollfreeInquiries) o;

        return Objects.equals(inquiryId, other.inquiryId) &&  Objects.equals(inquirySessionToken, other.inquirySessionToken) &&  Objects.equals(registrationId, other.registrationId) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inquiryId, inquirySessionToken, registrationId, url);
    }


}

