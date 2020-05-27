/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Form extends Resource {
    private static final long serialVersionUID = 262438037114282L;

    public enum FormTypes {
        FORM_APP_PUSH("form-app-push"),
        FORM_SMS("form-sms"),
        FORM_TOTP("form-totp");

        private final String value;

        private FormTypes(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a FormTypes from a string.
         * @param value string value
         * @return generated FormTypes
         */
        @JsonCreator
        public static FormTypes forValue(final String value) {
            return Promoter.enumFromString(value, FormTypes.values());
        }
    }

    /**
     * Create a FormFetcher to execute fetch.
     *
     * @param pathFormType The Type of this Form
     * @return FormFetcher capable of executing the fetch
     */
    public static FormFetcher fetcher(final Form.FormTypes pathFormType) {
        return new FormFetcher(pathFormType);
    }

    /**
     * Converts a JSON String into a Form object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Form object represented by the provided JSON
     */
    public static Form fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Form.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Form object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Form object represented by the provided JSON
     */
    public static Form fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Form.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final Form.FormTypes formType;
    private final Map<String, Object> forms;
    private final Map<String, Object> formMeta;
    private final URI url;

    @JsonCreator
    private Form(@JsonProperty("form_type")
                 final Form.FormTypes formType,
                 @JsonProperty("forms")
                 final Map<String, Object> forms,
                 @JsonProperty("form_meta")
                 final Map<String, Object> formMeta,
                 @JsonProperty("url")
                 final URI url) {
        this.formType = formType;
        this.forms = forms;
        this.formMeta = formMeta;
        this.url = url;
    }

    /**
     * Returns The Type of this Form.
     *
     * @return The Type of this Form
     */
    public final Form.FormTypes getFormType() {
        return this.formType;
    }

    /**
     * Returns Object that contains the available forms for this type..
     *
     * @return Object that contains the available forms for this type.
     */
    public final Map<String, Object> getForms() {
        return this.forms;
    }

    /**
     * Returns Additional information for the available forms for this type..
     *
     * @return Additional information for the available forms for this type.
     */
    public final Map<String, Object> getFormMeta() {
        return this.formMeta;
    }

    /**
     * Returns The URL to access the forms for this type..
     *
     * @return The URL to access the forms for this type.
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Form other = (Form) o;

        return Objects.equals(formType, other.formType) &&
               Objects.equals(forms, other.forms) &&
               Objects.equals(formMeta, other.formMeta) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formType,
                            forms,
                            formMeta,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("formType", formType)
                          .add("forms", forms)
                          .add("formMeta", formMeta)
                          .add("url", url)
                          .toString();
    }
}