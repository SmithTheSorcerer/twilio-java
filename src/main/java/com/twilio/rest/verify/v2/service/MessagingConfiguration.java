/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Verify
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.verify.v2.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Objects;

import lombok.ToString;


@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class MessagingConfiguration extends Resource {
    private static final long serialVersionUID = 141221540042494L;

    

    public static MessagingConfigurationCreator creator(final String pathServiceSid, final String country, final String messagingServiceSid){
        return new MessagingConfigurationCreator(pathServiceSid, country, messagingServiceSid);
    }

    public static MessagingConfigurationDeleter deleter(final String pathServiceSid, final String pathCountry){
        return new MessagingConfigurationDeleter(pathServiceSid, pathCountry);
    }

    public static MessagingConfigurationFetcher fetcher(final String pathServiceSid, final String pathCountry){
        return new MessagingConfigurationFetcher(pathServiceSid, pathCountry);
    }

    public static MessagingConfigurationReader reader(final String pathServiceSid){
        return new MessagingConfigurationReader(pathServiceSid);
    }

    public static MessagingConfigurationUpdater updater(final String pathServiceSid, final String pathCountry, final String messagingServiceSid){
        return new MessagingConfigurationUpdater(pathServiceSid, pathCountry, messagingServiceSid);
    }

    /**
    * Converts a JSON String into a MessagingConfiguration object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return MessagingConfiguration object represented by the provided JSON
    */
    public static MessagingConfiguration fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, MessagingConfiguration.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a MessagingConfiguration object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return MessagingConfiguration object represented by the provided JSON
    */
    public static MessagingConfiguration fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, MessagingConfiguration.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }


    private final String accountSid;
    private final String serviceSid;
    private final String country;
    private final String messagingServiceSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private MessagingConfiguration(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("country")
        final String country,

        @JsonProperty("messaging_service_sid")
        final String messagingServiceSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.country = country;
        this.messagingServiceSid = messagingServiceSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }
        public final String getCountry() {
            return this.country;
        }
        public final String getMessagingServiceSid() {
            return this.messagingServiceSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
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

        MessagingConfiguration other = (MessagingConfiguration) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(country, other.country) &&  Objects.equals(messagingServiceSid, other.messagingServiceSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, serviceSid, country, messagingServiceSid, dateCreated, dateUpdated, url);
    }


}

