/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Bulk Messaging API
 * This is the public Twilio REST API for 1:Many Message creation.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.previewmessaging.v1;

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
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Message extends Resource {
    private static final long serialVersionUID = 198419191205133L;

    
        @ToString
        static public class MessagingV1Message {
            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("to")
            @Getter @Setter private com.twilio.type.PhoneNumber to;
            public String getTo() {
                return to.getEndpoint();
            }
            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("body")
            @Getter @Setter private String body;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("content_variables")
            @Getter @Setter private Map<String, String> contentVariables;
            public String getContentVariables() {
                return Converter.mapToJson(contentVariables);
            }

            public static MessagingV1Message fromJson(String jsonString, ObjectMapper mapper) throws IOException {
                return mapper.readValue(jsonString, MessagingV1Message.class);
            }
        }
        @ToString
        static public class CreateMessagesRequest {
            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("messages")
            @Getter @Setter private List<MessagingV1Message> messages;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("from")
            @Getter @Setter private com.twilio.type.PhoneNumber from;
            public String getFrom() {
                return from.getEndpoint();
            }
            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("messaging_service_sid")
            @Getter @Setter private String messagingServiceSid;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("body")
            @Getter @Setter private String body;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("content_sid")
            @Getter @Setter private String contentSid;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("media_url")
            @Getter @Setter private List<URI> mediaUrl;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("status_callback")
            @Getter @Setter private URI statusCallback;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("validity_period")
            @Getter @Setter private Integer validityPeriod;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("send_at")
            @Getter @Setter private String sendAt;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("schedule_type")
            @Getter @Setter private String scheduleType;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("shorten_urls")
            @Getter @Setter private Boolean shortenUrls;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("send_as_mms")
            @Getter @Setter private Boolean sendAsMms;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("max_price")
            @Getter @Setter private BigDecimal maxPrice;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("attempt")
            @Getter @Setter private Integer attempt;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("smart_encoded")
            @Getter @Setter private Boolean smartEncoded;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("force_delivery")
            @Getter @Setter private Boolean forceDelivery;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("application_sid")
            @Getter @Setter private String applicationSid;

            public CreateMessagesRequest( ) {
            }

            public static CreateMessagesRequest fromJson(String jsonString, ObjectMapper mapper) throws IOException {
                return mapper.readValue(jsonString, CreateMessagesRequest.class);
            }
        }
        @ToString
        static public class MessagingV1MessageReceipt {
            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("to")
            @Getter @Setter private String to;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("sid")
            @Getter @Setter private String sid;


            public static MessagingV1MessageReceipt fromJson(String jsonString, ObjectMapper mapper) throws IOException {
                return mapper.readValue(jsonString, MessagingV1MessageReceipt.class);
            }
        }
        @ToString
        static public class MessagingV1FailedMessageReceipt {
            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("to")
            @Getter @Setter private String to;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("error_message")
            @Getter @Setter private String errorMessage;

            @JsonInclude(JsonInclude.Include.NON_EMPTY)
            @JsonProperty("error_code")
            @Getter @Setter private Integer errorCode;


            public static MessagingV1FailedMessageReceipt fromJson(String jsonString, ObjectMapper mapper) throws IOException {
                return mapper.readValue(jsonString, MessagingV1FailedMessageReceipt.class);
            }
        }

    public static MessageCreator creator(final Message.CreateMessagesRequest createMessagesRequest){
        return new MessageCreator(createMessagesRequest);
    }

    /**
    * Converts a JSON String into a Message object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Message object represented by the provided JSON
    */
    public static Message fromJson(final String json, final ObjectMapper objectMapper) {
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
    public static Message fromJson(final InputStream json, final ObjectMapper objectMapper) {
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

    private final Integer totalMessageCount;
    private final Integer successCount;
    private final Integer errorCount;
    private final List<MessagingV1MessageReceipt> messageReceipts;
    private final List<MessagingV1FailedMessageReceipt> failedMessageReceipts;

    @JsonCreator
    private Message(
        @JsonProperty("total_message_count")
        final Integer totalMessageCount,

        @JsonProperty("success_count")
        final Integer successCount,

        @JsonProperty("error_count")
        final Integer errorCount,

        @JsonProperty("message_receipts")
        final List<MessagingV1MessageReceipt> messageReceipts,

        @JsonProperty("failed_message_receipts")
        final List<MessagingV1FailedMessageReceipt> failedMessageReceipts
    ) {
        this.totalMessageCount = totalMessageCount;
        this.successCount = successCount;
        this.errorCount = errorCount;
        this.messageReceipts = messageReceipts;
        this.failedMessageReceipts = failedMessageReceipts;
    }

        public final Integer getTotalMessageCount() {
            return this.totalMessageCount;
        }
        public final Integer getSuccessCount() {
            return this.successCount;
        }
        public final Integer getErrorCount() {
            return this.errorCount;
        }
        public final List<MessagingV1MessageReceipt> getMessageReceipts() {
            return this.messageReceipts;
        }
        public final List<MessagingV1FailedMessageReceipt> getFailedMessageReceipts() {
            return this.failedMessageReceipts;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Message other = (Message) o;

        return Objects.equals(totalMessageCount, other.totalMessageCount) &&  Objects.equals(successCount, other.successCount) &&  Objects.equals(errorCount, other.errorCount) &&  Objects.equals(messageReceipts, other.messageReceipts) &&  Objects.equals(failedMessageReceipts, other.failedMessageReceipts)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalMessageCount, successCount, errorCount, messageReceipts, failedMessageReceipts);
    }


}

