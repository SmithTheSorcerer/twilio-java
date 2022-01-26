/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.insights.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Conference extends Resource {
    private static final long serialVersionUID = 212374686072337L;

    public enum ConferenceStatus {
        IN_PROGRESS("in_progress"),
        NOT_STARTED("not_started"),
        COMPLETED("completed"),
        SUMMARY_TIMEOUT("summary_timeout");

        private final String value;

        private ConferenceStatus(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a ConferenceStatus from a string.
         * @param value string value
         * @return generated ConferenceStatus
         */
        @JsonCreator
        public static ConferenceStatus forValue(final String value) {
            return Promoter.enumFromString(value, ConferenceStatus.values());
        }
    }

    public enum ConferenceEndReason {
        LAST_PARTICIPANT_LEFT("last_participant_left"),
        CONFERENCE_ENDED_VIA_API("conference_ended_via_api"),
        PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT("participant_with_end_conference_on_exit_left"),
        LAST_PARTICIPANT_KICKED("last_participant_kicked"),
        PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_KICKED("participant_with_end_conference_on_exit_kicked");

        private final String value;

        private ConferenceEndReason(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a ConferenceEndReason from a string.
         * @param value string value
         * @return generated ConferenceEndReason
         */
        @JsonCreator
        public static ConferenceEndReason forValue(final String value) {
            return Promoter.enumFromString(value, ConferenceEndReason.values());
        }
    }

    public enum Region {
        US1("us1"),
        AU1("au1"),
        BR1("br1"),
        IE1("ie1"),
        JP1("jp1"),
        SG1("sg1"),
        DE1("de1");

        private final String value;

        private Region(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Region from a string.
         * @param value string value
         * @return generated Region
         */
        @JsonCreator
        public static Region forValue(final String value) {
            return Promoter.enumFromString(value, Region.values());
        }
    }

    public enum Tag {
        INVALID_REQUESTED_REGION("invalid_requested_region"),
        DUPLICATE_IDENTITY("duplicate_identity"),
        START_FAILURE("start_failure"),
        REGION_CONFIGURATION_ISSUES("region_configuration_issues"),
        QUALITY_WARNINGS("quality_warnings"),
        PARTICIPANT_BEHAVIOR_ISSUES("participant_behavior_issues"),
        HIGH_PACKET_LOSS("high_packet_loss"),
        HIGH_JITTER("high_jitter"),
        HIGH_LATENCY("high_latency"),
        LOW_MOS("low_mos"),
        DETECTED_SILENCE("detected_silence");

        private final String value;

        private Tag(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Tag from a string.
         * @param value string value
         * @return generated Tag
         */
        @JsonCreator
        public static Tag forValue(final String value) {
            return Promoter.enumFromString(value, Tag.values());
        }
    }

    /**
     * Create a ConferenceFetcher to execute fetch.
     *
     * @param pathConferenceSid The conference_sid
     * @return ConferenceFetcher capable of executing the fetch
     */
    public static ConferenceFetcher fetcher(final String pathConferenceSid) {
        return new ConferenceFetcher(pathConferenceSid);
    }

    /**
     * Create a ConferenceReader to execute read.
     *
     * @return ConferenceReader capable of executing the read
     */
    public static ConferenceReader reader() {
        return new ConferenceReader();
    }

    /**
     * Converts a JSON String into a Conference object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Conference object represented by the provided JSON
     */
    public static Conference fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Conference.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Conference object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Conference object represented by the provided JSON
     */
    public static Conference fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Conference.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String conferenceSid;
    private final String accountSid;
    private final String friendlyName;
    private final ZonedDateTime createTime;
    private final ZonedDateTime startTime;
    private final ZonedDateTime endTime;
    private final Integer durationSeconds;
    private final Integer connectDurationSeconds;
    private final Conference.ConferenceStatus status;
    private final Integer maxParticipants;
    private final Integer maxConcurrentParticipants;
    private final Integer uniqueParticipants;
    private final Conference.ConferenceEndReason endReason;
    private final String endedBy;
    private final Conference.Region mixerRegion;
    private final Conference.Region mixerRegionRequested;
    private final Boolean recordingEnabled;
    private final Map<String, Object> detectedIssues;
    private final List<Conference.Tag> tags;
    private final Map<String, Object> tagInfo;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Conference(@JsonProperty("conference_sid")
                       final String conferenceSid,
                       @JsonProperty("account_sid")
                       final String accountSid,
                       @JsonProperty("friendly_name")
                       final String friendlyName,
                       @JsonProperty("create_time")
                       final String createTime,
                       @JsonProperty("start_time")
                       final String startTime,
                       @JsonProperty("end_time")
                       final String endTime,
                       @JsonProperty("duration_seconds")
                       final Integer durationSeconds,
                       @JsonProperty("connect_duration_seconds")
                       final Integer connectDurationSeconds,
                       @JsonProperty("status")
                       final Conference.ConferenceStatus status,
                       @JsonProperty("max_participants")
                       final Integer maxParticipants,
                       @JsonProperty("max_concurrent_participants")
                       final Integer maxConcurrentParticipants,
                       @JsonProperty("unique_participants")
                       final Integer uniqueParticipants,
                       @JsonProperty("end_reason")
                       final Conference.ConferenceEndReason endReason,
                       @JsonProperty("ended_by")
                       final String endedBy,
                       @JsonProperty("mixer_region")
                       final Conference.Region mixerRegion,
                       @JsonProperty("mixer_region_requested")
                       final Conference.Region mixerRegionRequested,
                       @JsonProperty("recording_enabled")
                       final Boolean recordingEnabled,
                       @JsonProperty("detected_issues")
                       final Map<String, Object> detectedIssues,
                       @JsonProperty("tags")
                       final List<Conference.Tag> tags,
                       @JsonProperty("tag_info")
                       final Map<String, Object> tagInfo,
                       @JsonProperty("url")
                       final URI url,
                       @JsonProperty("links")
                       final Map<String, String> links) {
        this.conferenceSid = conferenceSid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.createTime = DateConverter.iso8601DateTimeFromString(createTime);
        this.startTime = DateConverter.iso8601DateTimeFromString(startTime);
        this.endTime = DateConverter.iso8601DateTimeFromString(endTime);
        this.durationSeconds = durationSeconds;
        this.connectDurationSeconds = connectDurationSeconds;
        this.status = status;
        this.maxParticipants = maxParticipants;
        this.maxConcurrentParticipants = maxConcurrentParticipants;
        this.uniqueParticipants = uniqueParticipants;
        this.endReason = endReason;
        this.endedBy = endedBy;
        this.mixerRegion = mixerRegion;
        this.mixerRegionRequested = mixerRegionRequested;
        this.recordingEnabled = recordingEnabled;
        this.detectedIssues = detectedIssues;
        this.tags = tags;
        this.tagInfo = tagInfo;
        this.url = url;
        this.links = links;
    }

    /**
     * Returns The conference_sid.
     *
     * @return The conference_sid
     */
    public final String getConferenceSid() {
        return this.conferenceSid;
    }

    /**
     * Returns The account_sid.
     *
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The friendly_name.
     *
     * @return The friendly_name
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The create_time.
     *
     * @return The create_time
     */
    public final ZonedDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Returns The start_time.
     *
     * @return The start_time
     */
    public final ZonedDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Returns The end_time.
     *
     * @return The end_time
     */
    public final ZonedDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Returns The duration_seconds.
     *
     * @return The duration_seconds
     */
    public final Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * Returns The connect_duration_seconds.
     *
     * @return The connect_duration_seconds
     */
    public final Integer getConnectDurationSeconds() {
        return this.connectDurationSeconds;
    }

    /**
     * Returns The status.
     *
     * @return The status
     */
    public final Conference.ConferenceStatus getStatus() {
        return this.status;
    }

    /**
     * Returns The max_participants.
     *
     * @return The max_participants
     */
    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    /**
     * Returns The max_concurrent_participants.
     *
     * @return The max_concurrent_participants
     */
    public final Integer getMaxConcurrentParticipants() {
        return this.maxConcurrentParticipants;
    }

    /**
     * Returns The unique_participants.
     *
     * @return The unique_participants
     */
    public final Integer getUniqueParticipants() {
        return this.uniqueParticipants;
    }

    /**
     * Returns The end_reason.
     *
     * @return The end_reason
     */
    public final Conference.ConferenceEndReason getEndReason() {
        return this.endReason;
    }

    /**
     * Returns The ended_by.
     *
     * @return The ended_by
     */
    public final String getEndedBy() {
        return this.endedBy;
    }

    /**
     * Returns The mixer_region.
     *
     * @return The mixer_region
     */
    public final Conference.Region getMixerRegion() {
        return this.mixerRegion;
    }

    /**
     * Returns The mixer_region_requested.
     *
     * @return The mixer_region_requested
     */
    public final Conference.Region getMixerRegionRequested() {
        return this.mixerRegionRequested;
    }

    /**
     * Returns The recording_enabled.
     *
     * @return The recording_enabled
     */
    public final Boolean getRecordingEnabled() {
        return this.recordingEnabled;
    }

    /**
     * Returns The detected_issues.
     *
     * @return The detected_issues
     */
    public final Map<String, Object> getDetectedIssues() {
        return this.detectedIssues;
    }

    /**
     * Returns The tags.
     *
     * @return The tags
     */
    public final List<Conference.Tag> getTags() {
        return this.tags;
    }

    /**
     * Returns The tag_info.
     *
     * @return The tag_info
     */
    public final Map<String, Object> getTagInfo() {
        return this.tagInfo;
    }

    /**
     * Returns The url.
     *
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The links.
     *
     * @return The links
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Conference other = (Conference) o;

        return Objects.equals(conferenceSid, other.conferenceSid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(createTime, other.createTime) &&
               Objects.equals(startTime, other.startTime) &&
               Objects.equals(endTime, other.endTime) &&
               Objects.equals(durationSeconds, other.durationSeconds) &&
               Objects.equals(connectDurationSeconds, other.connectDurationSeconds) &&
               Objects.equals(status, other.status) &&
               Objects.equals(maxParticipants, other.maxParticipants) &&
               Objects.equals(maxConcurrentParticipants, other.maxConcurrentParticipants) &&
               Objects.equals(uniqueParticipants, other.uniqueParticipants) &&
               Objects.equals(endReason, other.endReason) &&
               Objects.equals(endedBy, other.endedBy) &&
               Objects.equals(mixerRegion, other.mixerRegion) &&
               Objects.equals(mixerRegionRequested, other.mixerRegionRequested) &&
               Objects.equals(recordingEnabled, other.recordingEnabled) &&
               Objects.equals(detectedIssues, other.detectedIssues) &&
               Objects.equals(tags, other.tags) &&
               Objects.equals(tagInfo, other.tagInfo) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceSid,
                            accountSid,
                            friendlyName,
                            createTime,
                            startTime,
                            endTime,
                            durationSeconds,
                            connectDurationSeconds,
                            status,
                            maxParticipants,
                            maxConcurrentParticipants,
                            uniqueParticipants,
                            endReason,
                            endedBy,
                            mixerRegion,
                            mixerRegionRequested,
                            recordingEnabled,
                            detectedIssues,
                            tags,
                            tagInfo,
                            url,
                            links);
    }
}