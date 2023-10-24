/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Content
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.content.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Map;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Content extends Resource {
    private static final long serialVersionUID = 58899890984300L;

    
        @ToString
        static public class ContentCreateRequest {
            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("friendly_name")
            @Getter @Setter private String friendlyName;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("variables")
            @Getter @Setter private Map<String, String> variables;
            public String getVariables() {
                return Converter.mapToJson(variables);
            }
            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("language")
            @Getter @Setter private String language;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("types")
            @Getter @Setter private Map<String, Object> types;
            public String getTypes() {
                return Converter.mapToJson(types);
            }

            public static ContentCreateRequest fromJson(String jsonString, ObjectMapper mapper) throws IOException {
                return mapper.readValue(jsonString, ContentCreateRequest.class);
            }
        }

    public static ContentCreator creator(final Content.ContentCreateRequest contentCreateRequest){
        return new ContentCreator(contentCreateRequest);
    }

    public static ContentDeleter deleter(final String pathSid){
        return new ContentDeleter(pathSid);
    }

    public static ContentFetcher fetcher(final String pathSid){
        return new ContentFetcher(pathSid);
    }

    public static ContentReader reader(){
        return new ContentReader();
    }

    /**
    * Converts a JSON String into a Content object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Content object represented by the provided JSON
    */
    public static Content fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Content.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Content object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Content object represented by the provided JSON
    */
    public static Content fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Content.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public static String toJson(Object object, ObjectMapper mapper) {
        try {
            return mapper.writeValueAsString(object);
        } catch (final JsonMappingException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (JsonProcessingException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final String language;
    private final Map<String, Object> variables;
    private final Map<String, Object> types;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Content(
        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("language")
        final String language,

        @JsonProperty("variables")
        final Map<String, Object> variables,

        @JsonProperty("types")
        final Map<String, Object> types,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links
    ) {
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.language = language;
        this.variables = variables;
        this.types = types;
        this.url = url;
        this.links = links;
    }

        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getLanguage() {
            return this.language;
        }
        public final Map<String, Object> getVariables() {
            return this.variables;
        }
        public final Map<String, Object> getTypes() {
            return this.types;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Content other = (Content) o;

        return Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(language, other.language) &&  Objects.equals(variables, other.variables) &&  Objects.equals(types, other.types) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateCreated, dateUpdated, sid, accountSid, friendlyName, language, variables, types, url, links);
    }


}

