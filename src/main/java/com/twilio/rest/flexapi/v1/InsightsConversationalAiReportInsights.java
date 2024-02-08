/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1;

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

import java.util.List;
import java.util.Map;
import java.util.Objects;

import lombok.ToString;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class InsightsConversationalAiReportInsights extends Resource {
    private static final long serialVersionUID = 215589850844764L;

    

    public static InsightsConversationalAiReportInsightsFetcher fetcher(final String pathInstanceSid){
        return new InsightsConversationalAiReportInsightsFetcher(pathInstanceSid);
    }

    /**
    * Converts a JSON String into a InsightsConversationalAiReportInsights object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return InsightsConversationalAiReportInsights object represented by the provided JSON
    */
    public static InsightsConversationalAiReportInsights fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InsightsConversationalAiReportInsights.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a InsightsConversationalAiReportInsights object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return InsightsConversationalAiReportInsights object represented by the provided JSON
    */
    public static InsightsConversationalAiReportInsights fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InsightsConversationalAiReportInsights.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }


    private final String instanceSid;
    private final String reportId;
    private final ZonedDateTime periodStart;
    private final ZonedDateTime periodEnd;
    private final ZonedDateTime updated;
    private final List<Map<String, Object>> insights;
    private final URI url;

    @JsonCreator
    private InsightsConversationalAiReportInsights(
        @JsonProperty("instance_sid")
        final String instanceSid,

        @JsonProperty("report_id")
        final String reportId,

        @JsonProperty("period_start")
        final String periodStart,

        @JsonProperty("period_end")
        final String periodEnd,

        @JsonProperty("updated")
        final String updated,

        @JsonProperty("insights")
        final List<Map<String, Object>> insights,

        @JsonProperty("url")
        final URI url
    ) {
        this.instanceSid = instanceSid;
        this.reportId = reportId;
        this.periodStart = DateConverter.iso8601DateTimeFromString(periodStart);
        this.periodEnd = DateConverter.iso8601DateTimeFromString(periodEnd);
        this.updated = DateConverter.iso8601DateTimeFromString(updated);
        this.insights = insights;
        this.url = url;
    }

        public final String getInstanceSid() {
            return this.instanceSid;
        }
        public final String getReportId() {
            return this.reportId;
        }
        public final ZonedDateTime getPeriodStart() {
            return this.periodStart;
        }
        public final ZonedDateTime getPeriodEnd() {
            return this.periodEnd;
        }
        public final ZonedDateTime getUpdated() {
            return this.updated;
        }
        public final List<Map<String, Object>> getInsights() {
            return this.insights;
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

        InsightsConversationalAiReportInsights other = (InsightsConversationalAiReportInsights) o;

        return Objects.equals(instanceSid, other.instanceSid) &&  Objects.equals(reportId, other.reportId) &&  Objects.equals(periodStart, other.periodStart) &&  Objects.equals(periodEnd, other.periodEnd) &&  Objects.equals(updated, other.updated) &&  Objects.equals(insights, other.insights) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceSid, reportId, periodStart, periodEnd, updated, insights, url);
    }


}

