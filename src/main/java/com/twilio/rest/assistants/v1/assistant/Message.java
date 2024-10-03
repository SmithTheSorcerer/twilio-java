/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Assistants
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.assistants.v1.assistant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Message extends Resource {

    private static final long serialVersionUID = 131790089402244L;

    @ToString
    public static class AssistantsV1ServiceAssistantSendMessageRequest {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("identity")
        @Getter
        @Setter
        private String identity;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("session_id")
        @Getter
        @Setter
        private String sessionId;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("webhook")
        @Getter
        @Setter
        private String webhook;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("mode")
        @Getter
        @Setter
        private String mode;

        public AssistantsV1ServiceAssistantSendMessageRequest(
            final String identity,
            final String body
        ) {
            this.identity = identity;
            this.body = body;
        }

        public static AssistantsV1ServiceAssistantSendMessageRequest fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(
                jsonString,
                AssistantsV1ServiceAssistantSendMessageRequest.class
            );
        }
    }

    public static MessageCreator creator(
        final String pathId,
        final Message.AssistantsV1ServiceAssistantSendMessageRequest assistantsV1ServiceAssistantSendMessageRequest
    ) {
        return new MessageCreator(
            pathId,
            assistantsV1ServiceAssistantSendMessageRequest
        );
    }

    /**
     * Converts a JSON String into a Message object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Message object represented by the provided JSON
     */
    public static Message fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Message.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Message object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Message object represented by the provided JSON
     */
    public static Message fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Message.class);
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

    private final String status;
    private final Boolean flagged;
    private final Boolean aborted;
    private final String sessionId;
    private final String accountSid;
    private final String body;
    private final String error;

    @JsonCreator
    private Message(
        @JsonProperty("status") final String status,
        @JsonProperty("flagged") final Boolean flagged,
        @JsonProperty("aborted") final Boolean aborted,
        @JsonProperty("session_id") final String sessionId,
        @JsonProperty("account_sid") final String accountSid,
        @JsonProperty("body") final String body,
        @JsonProperty("error") final String error
    ) {
        this.status = status;
        this.flagged = flagged;
        this.aborted = aborted;
        this.sessionId = sessionId;
        this.accountSid = accountSid;
        this.body = body;
        this.error = error;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Boolean getFlagged() {
        return this.flagged;
    }

    public final Boolean getAborted() {
        return this.aborted;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getAccountSid() {
        return this.accountSid;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getError() {
        return this.error;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Message other = (Message) o;

        return (
            Objects.equals(status, other.status) &&
            Objects.equals(flagged, other.flagged) &&
            Objects.equals(aborted, other.aborted) &&
            Objects.equals(sessionId, other.sessionId) &&
            Objects.equals(accountSid, other.accountSid) &&
            Objects.equals(body, other.body) &&
            Objects.equals(error, other.error)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            status,
            flagged,
            aborted,
            sessionId,
            accountSid,
            body,
            error
        );
    }
}