/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Intelligence
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.intelligence.v2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;
import com.twilio.http.HttpMethod;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Objects;

import lombok.ToString;


@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Service extends Resource {
    private static final long serialVersionUID = 160239821590245L;

    

    public static ServiceCreator creator(final String uniqueName){
        return new ServiceCreator(uniqueName);
    }

    public static ServiceDeleter deleter(final String pathSid){
        return new ServiceDeleter(pathSid);
    }

    public static ServiceFetcher fetcher(final String pathSid){
        return new ServiceFetcher(pathSid);
    }

    public static ServiceReader reader(){
        return new ServiceReader();
    }

    public static ServiceUpdater updater(final String pathSid){
        return new ServiceUpdater(pathSid);
    }

    /**
    * Converts a JSON String into a Service object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Service object represented by the provided JSON
    */
    public static Service fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Service.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Service object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Service object represented by the provided JSON
    */
    public static Service fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Service.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public enum HttpMethod {
        GET("GET"),
        POST("POST"),
        NULL("NULL");

        private final String value;

        private HttpMethod(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static HttpMethod forValue(final String value) {
            return Promoter.enumFromString(value, HttpMethod.values());
        }
    }

    private final String accountSid;
    private final Boolean autoRedaction;
    private final Boolean mediaRedaction;
    private final Boolean autoTranscribe;
    private final Boolean dataLogging;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String friendlyName;
    private final String languageCode;
    private final String sid;
    private final String uniqueName;
    private final URI url;
    private final String webhookUrl;
    private final Service.HttpMethod webhookHttpMethod;
    private final Integer version;

    @JsonCreator
    private Service(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("auto_redaction")
        final Boolean autoRedaction,

        @JsonProperty("media_redaction")
        final Boolean mediaRedaction,

        @JsonProperty("auto_transcribe")
        final Boolean autoTranscribe,

        @JsonProperty("data_logging")
        final Boolean dataLogging,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("language_code")
        final String languageCode,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("webhook_url")
        final String webhookUrl,

        @JsonProperty("webhook_http_method")
        final Service.HttpMethod webhookHttpMethod,

        @JsonProperty("version")
        final Integer version
    ) {
        this.accountSid = accountSid;
        this.autoRedaction = autoRedaction;
        this.mediaRedaction = mediaRedaction;
        this.autoTranscribe = autoTranscribe;
        this.dataLogging = dataLogging;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.languageCode = languageCode;
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.url = url;
        this.webhookUrl = webhookUrl;
        this.webhookHttpMethod = webhookHttpMethod;
        this.version = version;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final Boolean getAutoRedaction() {
            return this.autoRedaction;
        }
        public final Boolean getMediaRedaction() {
            return this.mediaRedaction;
        }
        public final Boolean getAutoTranscribe() {
            return this.autoTranscribe;
        }
        public final Boolean getDataLogging() {
            return this.dataLogging;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getLanguageCode() {
            return this.languageCode;
        }
        public final String getSid() {
            return this.sid;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final String getWebhookUrl() {
            return this.webhookUrl;
        }
        public final Service.HttpMethod getWebhookHttpMethod() {
            return this.webhookHttpMethod;
        }
        public final Integer getVersion() {
            return this.version;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Service other = (Service) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(autoRedaction, other.autoRedaction) &&  Objects.equals(mediaRedaction, other.mediaRedaction) &&  Objects.equals(autoTranscribe, other.autoTranscribe) &&  Objects.equals(dataLogging, other.dataLogging) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(languageCode, other.languageCode) &&  Objects.equals(sid, other.sid) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(url, other.url) &&  Objects.equals(webhookUrl, other.webhookUrl) &&  Objects.equals(webhookHttpMethod, other.webhookHttpMethod) &&  Objects.equals(version, other.version)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, autoRedaction, mediaRedaction, autoTranscribe, dataLogging, dateCreated, dateUpdated, friendlyName, languageCode, sid, uniqueName, url, webhookUrl, webhookHttpMethod, version);
    }


}

