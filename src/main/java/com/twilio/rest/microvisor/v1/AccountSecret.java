/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Microvisor
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.microvisor.v1;

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
public class AccountSecret extends Resource {
    private static final long serialVersionUID = 245444757442788L;

    

    public static AccountSecretCreator creator(final String key, final String value){
        return new AccountSecretCreator(key, value);
    }

    public static AccountSecretDeleter deleter(final String pathKey){
        return new AccountSecretDeleter(pathKey);
    }

    public static AccountSecretFetcher fetcher(final String pathKey){
        return new AccountSecretFetcher(pathKey);
    }

    public static AccountSecretReader reader(){
        return new AccountSecretReader();
    }

    public static AccountSecretUpdater updater(final String pathKey, final String value){
        return new AccountSecretUpdater(pathKey, value);
    }

    /**
    * Converts a JSON String into a AccountSecret object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return AccountSecret object represented by the provided JSON
    */
    public static AccountSecret fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AccountSecret.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a AccountSecret object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return AccountSecret object represented by the provided JSON
    */
    public static AccountSecret fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AccountSecret.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }


    private final String key;
    private final ZonedDateTime dateRotated;
    private final URI url;

    @JsonCreator
    private AccountSecret(
        @JsonProperty("key")
        final String key,

        @JsonProperty("date_rotated")
        final String dateRotated,

        @JsonProperty("url")
        final URI url
    ) {
        this.key = key;
        this.dateRotated = DateConverter.iso8601DateTimeFromString(dateRotated);
        this.url = url;
    }

        public final String getKey() {
            return this.key;
        }
        public final ZonedDateTime getDateRotated() {
            return this.dateRotated;
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

        AccountSecret other = (AccountSecret) o;

        return Objects.equals(key, other.key) &&  Objects.equals(dateRotated, other.dateRotated) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, dateRotated, url);
    }


}

