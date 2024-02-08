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
import com.twilio.converter.Promoter;
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
public class Configuration extends Resource {
    private static final long serialVersionUID = 32578567436971L;

    

    public static ConfigurationFetcher fetcher(){
        return new ConfigurationFetcher();
    }

    public static ConfigurationUpdater updater(){
        return new ConfigurationUpdater();
    }

    /**
    * Converts a JSON String into a Configuration object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Configuration object represented by the provided JSON
    */
    public static Configuration fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Configuration.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Configuration object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Configuration object represented by the provided JSON
    */
    public static Configuration fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Configuration.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public enum Status {
        OK("ok"),
        INPROGRESS("inprogress"),
        NOTSTARTED("notstarted");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final Map<String, Object> attributes;
    private final Configuration.Status status;
    private final String taskrouterWorkspaceSid;
    private final String taskrouterTargetWorkflowSid;
    private final String taskrouterTargetTaskqueueSid;
    private final List<Map<String, Object>> taskrouterTaskqueues;
    private final List<Map<String, Object>> taskrouterSkills;
    private final Map<String, Object> taskrouterWorkerChannels;
    private final Map<String, Object> taskrouterWorkerAttributes;
    private final String taskrouterOfflineActivitySid;
    private final URI runtimeDomain;
    private final String messagingServiceInstanceSid;
    private final String chatServiceInstanceSid;
    private final String flexServiceInstanceSid;
    private final String flexInstanceSid;
    private final String uiLanguage;
    private final Map<String, Object> uiAttributes;
    private final Map<String, Object> uiDependencies;
    private final String uiVersion;
    private final String serviceVersion;
    private final Boolean callRecordingEnabled;
    private final URI callRecordingWebhookUrl;
    private final Boolean crmEnabled;
    private final String crmType;
    private final URI crmCallbackUrl;
    private final URI crmFallbackUrl;
    private final Map<String, Object> crmAttributes;
    private final Map<String, Object> publicAttributes;
    private final Boolean pluginServiceEnabled;
    private final Map<String, Object> pluginServiceAttributes;
    private final List<Map<String, Object>> integrations;
    private final Map<String, Object> outboundCallFlows;
    private final List<String> serverlessServiceSids;
    private final Map<String, Object> queueStatsConfiguration;
    private final Map<String, Object> notifications;
    private final Map<String, Object> markdown;
    private final URI url;
    private final Map<String, Object> flexInsightsHr;
    private final Boolean flexInsightsDrilldown;
    private final URI flexUrl;
    private final List<Map<String, Object>> channelConfigs;
    private final Map<String, Object> debuggerIntegration;
    private final Map<String, Object> flexUiStatusReport;
    private final Map<String, Object> agentConvEndMethods;
    private final Map<String, Object> citrixVoiceVdi;
    private final Map<String, Object> offlineConfig;

    @JsonCreator
    private Configuration(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("attributes")
        final Map<String, Object> attributes,

        @JsonProperty("status")
        final Configuration.Status status,

        @JsonProperty("taskrouter_workspace_sid")
        final String taskrouterWorkspaceSid,

        @JsonProperty("taskrouter_target_workflow_sid")
        final String taskrouterTargetWorkflowSid,

        @JsonProperty("taskrouter_target_taskqueue_sid")
        final String taskrouterTargetTaskqueueSid,

        @JsonProperty("taskrouter_taskqueues")
        final List<Map<String, Object>> taskrouterTaskqueues,

        @JsonProperty("taskrouter_skills")
        final List<Map<String, Object>> taskrouterSkills,

        @JsonProperty("taskrouter_worker_channels")
        final Map<String, Object> taskrouterWorkerChannels,

        @JsonProperty("taskrouter_worker_attributes")
        final Map<String, Object> taskrouterWorkerAttributes,

        @JsonProperty("taskrouter_offline_activity_sid")
        final String taskrouterOfflineActivitySid,

        @JsonProperty("runtime_domain")
        final URI runtimeDomain,

        @JsonProperty("messaging_service_instance_sid")
        final String messagingServiceInstanceSid,

        @JsonProperty("chat_service_instance_sid")
        final String chatServiceInstanceSid,

        @JsonProperty("flex_service_instance_sid")
        final String flexServiceInstanceSid,

        @JsonProperty("flex_instance_sid")
        final String flexInstanceSid,

        @JsonProperty("ui_language")
        final String uiLanguage,

        @JsonProperty("ui_attributes")
        final Map<String, Object> uiAttributes,

        @JsonProperty("ui_dependencies")
        final Map<String, Object> uiDependencies,

        @JsonProperty("ui_version")
        final String uiVersion,

        @JsonProperty("service_version")
        final String serviceVersion,

        @JsonProperty("call_recording_enabled")
        final Boolean callRecordingEnabled,

        @JsonProperty("call_recording_webhook_url")
        final URI callRecordingWebhookUrl,

        @JsonProperty("crm_enabled")
        final Boolean crmEnabled,

        @JsonProperty("crm_type")
        final String crmType,

        @JsonProperty("crm_callback_url")
        final URI crmCallbackUrl,

        @JsonProperty("crm_fallback_url")
        final URI crmFallbackUrl,

        @JsonProperty("crm_attributes")
        final Map<String, Object> crmAttributes,

        @JsonProperty("public_attributes")
        final Map<String, Object> publicAttributes,

        @JsonProperty("plugin_service_enabled")
        final Boolean pluginServiceEnabled,

        @JsonProperty("plugin_service_attributes")
        final Map<String, Object> pluginServiceAttributes,

        @JsonProperty("integrations")
        final List<Map<String, Object>> integrations,

        @JsonProperty("outbound_call_flows")
        final Map<String, Object> outboundCallFlows,

        @JsonProperty("serverless_service_sids")
        final List<String> serverlessServiceSids,

        @JsonProperty("queue_stats_configuration")
        final Map<String, Object> queueStatsConfiguration,

        @JsonProperty("notifications")
        final Map<String, Object> notifications,

        @JsonProperty("markdown")
        final Map<String, Object> markdown,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("flex_insights_hr")
        final Map<String, Object> flexInsightsHr,

        @JsonProperty("flex_insights_drilldown")
        final Boolean flexInsightsDrilldown,

        @JsonProperty("flex_url")
        final URI flexUrl,

        @JsonProperty("channel_configs")
        final List<Map<String, Object>> channelConfigs,

        @JsonProperty("debugger_integration")
        final Map<String, Object> debuggerIntegration,

        @JsonProperty("flex_ui_status_report")
        final Map<String, Object> flexUiStatusReport,

        @JsonProperty("agent_conv_end_methods")
        final Map<String, Object> agentConvEndMethods,

        @JsonProperty("citrix_voice_vdi")
        final Map<String, Object> citrixVoiceVdi,

        @JsonProperty("offline_config")
        final Map<String, Object> offlineConfig
    ) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.attributes = attributes;
        this.status = status;
        this.taskrouterWorkspaceSid = taskrouterWorkspaceSid;
        this.taskrouterTargetWorkflowSid = taskrouterTargetWorkflowSid;
        this.taskrouterTargetTaskqueueSid = taskrouterTargetTaskqueueSid;
        this.taskrouterTaskqueues = taskrouterTaskqueues;
        this.taskrouterSkills = taskrouterSkills;
        this.taskrouterWorkerChannels = taskrouterWorkerChannels;
        this.taskrouterWorkerAttributes = taskrouterWorkerAttributes;
        this.taskrouterOfflineActivitySid = taskrouterOfflineActivitySid;
        this.runtimeDomain = runtimeDomain;
        this.messagingServiceInstanceSid = messagingServiceInstanceSid;
        this.chatServiceInstanceSid = chatServiceInstanceSid;
        this.flexServiceInstanceSid = flexServiceInstanceSid;
        this.flexInstanceSid = flexInstanceSid;
        this.uiLanguage = uiLanguage;
        this.uiAttributes = uiAttributes;
        this.uiDependencies = uiDependencies;
        this.uiVersion = uiVersion;
        this.serviceVersion = serviceVersion;
        this.callRecordingEnabled = callRecordingEnabled;
        this.callRecordingWebhookUrl = callRecordingWebhookUrl;
        this.crmEnabled = crmEnabled;
        this.crmType = crmType;
        this.crmCallbackUrl = crmCallbackUrl;
        this.crmFallbackUrl = crmFallbackUrl;
        this.crmAttributes = crmAttributes;
        this.publicAttributes = publicAttributes;
        this.pluginServiceEnabled = pluginServiceEnabled;
        this.pluginServiceAttributes = pluginServiceAttributes;
        this.integrations = integrations;
        this.outboundCallFlows = outboundCallFlows;
        this.serverlessServiceSids = serverlessServiceSids;
        this.queueStatsConfiguration = queueStatsConfiguration;
        this.notifications = notifications;
        this.markdown = markdown;
        this.url = url;
        this.flexInsightsHr = flexInsightsHr;
        this.flexInsightsDrilldown = flexInsightsDrilldown;
        this.flexUrl = flexUrl;
        this.channelConfigs = channelConfigs;
        this.debuggerIntegration = debuggerIntegration;
        this.flexUiStatusReport = flexUiStatusReport;
        this.agentConvEndMethods = agentConvEndMethods;
        this.citrixVoiceVdi = citrixVoiceVdi;
        this.offlineConfig = offlineConfig;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }
        public final Configuration.Status getStatus() {
            return this.status;
        }
        public final String getTaskrouterWorkspaceSid() {
            return this.taskrouterWorkspaceSid;
        }
        public final String getTaskrouterTargetWorkflowSid() {
            return this.taskrouterTargetWorkflowSid;
        }
        public final String getTaskrouterTargetTaskqueueSid() {
            return this.taskrouterTargetTaskqueueSid;
        }
        public final List<Map<String, Object>> getTaskrouterTaskqueues() {
            return this.taskrouterTaskqueues;
        }
        public final List<Map<String, Object>> getTaskrouterSkills() {
            return this.taskrouterSkills;
        }
        public final Map<String, Object> getTaskrouterWorkerChannels() {
            return this.taskrouterWorkerChannels;
        }
        public final Map<String, Object> getTaskrouterWorkerAttributes() {
            return this.taskrouterWorkerAttributes;
        }
        public final String getTaskrouterOfflineActivitySid() {
            return this.taskrouterOfflineActivitySid;
        }
        public final URI getRuntimeDomain() {
            return this.runtimeDomain;
        }
        public final String getMessagingServiceInstanceSid() {
            return this.messagingServiceInstanceSid;
        }
        public final String getChatServiceInstanceSid() {
            return this.chatServiceInstanceSid;
        }
        public final String getFlexServiceInstanceSid() {
            return this.flexServiceInstanceSid;
        }
        public final String getFlexInstanceSid() {
            return this.flexInstanceSid;
        }
        public final String getUiLanguage() {
            return this.uiLanguage;
        }
        public final Map<String, Object> getUiAttributes() {
            return this.uiAttributes;
        }
        public final Map<String, Object> getUiDependencies() {
            return this.uiDependencies;
        }
        public final String getUiVersion() {
            return this.uiVersion;
        }
        public final String getServiceVersion() {
            return this.serviceVersion;
        }
        public final Boolean getCallRecordingEnabled() {
            return this.callRecordingEnabled;
        }
        public final URI getCallRecordingWebhookUrl() {
            return this.callRecordingWebhookUrl;
        }
        public final Boolean getCrmEnabled() {
            return this.crmEnabled;
        }
        public final String getCrmType() {
            return this.crmType;
        }
        public final URI getCrmCallbackUrl() {
            return this.crmCallbackUrl;
        }
        public final URI getCrmFallbackUrl() {
            return this.crmFallbackUrl;
        }
        public final Map<String, Object> getCrmAttributes() {
            return this.crmAttributes;
        }
        public final Map<String, Object> getPublicAttributes() {
            return this.publicAttributes;
        }
        public final Boolean getPluginServiceEnabled() {
            return this.pluginServiceEnabled;
        }
        public final Map<String, Object> getPluginServiceAttributes() {
            return this.pluginServiceAttributes;
        }
        public final List<Map<String, Object>> getIntegrations() {
            return this.integrations;
        }
        public final Map<String, Object> getOutboundCallFlows() {
            return this.outboundCallFlows;
        }
        public final List<String> getServerlessServiceSids() {
            return this.serverlessServiceSids;
        }
        public final Map<String, Object> getQueueStatsConfiguration() {
            return this.queueStatsConfiguration;
        }
        public final Map<String, Object> getNotifications() {
            return this.notifications;
        }
        public final Map<String, Object> getMarkdown() {
            return this.markdown;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, Object> getFlexInsightsHr() {
            return this.flexInsightsHr;
        }
        public final Boolean getFlexInsightsDrilldown() {
            return this.flexInsightsDrilldown;
        }
        public final URI getFlexUrl() {
            return this.flexUrl;
        }
        public final List<Map<String, Object>> getChannelConfigs() {
            return this.channelConfigs;
        }
        public final Map<String, Object> getDebuggerIntegration() {
            return this.debuggerIntegration;
        }
        public final Map<String, Object> getFlexUiStatusReport() {
            return this.flexUiStatusReport;
        }
        public final Map<String, Object> getAgentConvEndMethods() {
            return this.agentConvEndMethods;
        }
        public final Map<String, Object> getCitrixVoiceVdi() {
            return this.citrixVoiceVdi;
        }
        public final Map<String, Object> getOfflineConfig() {
            return this.offlineConfig;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Configuration other = (Configuration) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(attributes, other.attributes) &&  Objects.equals(status, other.status) &&  Objects.equals(taskrouterWorkspaceSid, other.taskrouterWorkspaceSid) &&  Objects.equals(taskrouterTargetWorkflowSid, other.taskrouterTargetWorkflowSid) &&  Objects.equals(taskrouterTargetTaskqueueSid, other.taskrouterTargetTaskqueueSid) &&  Objects.equals(taskrouterTaskqueues, other.taskrouterTaskqueues) &&  Objects.equals(taskrouterSkills, other.taskrouterSkills) &&  Objects.equals(taskrouterWorkerChannels, other.taskrouterWorkerChannels) &&  Objects.equals(taskrouterWorkerAttributes, other.taskrouterWorkerAttributes) &&  Objects.equals(taskrouterOfflineActivitySid, other.taskrouterOfflineActivitySid) &&  Objects.equals(runtimeDomain, other.runtimeDomain) &&  Objects.equals(messagingServiceInstanceSid, other.messagingServiceInstanceSid) &&  Objects.equals(chatServiceInstanceSid, other.chatServiceInstanceSid) &&  Objects.equals(flexServiceInstanceSid, other.flexServiceInstanceSid) &&  Objects.equals(flexInstanceSid, other.flexInstanceSid) &&  Objects.equals(uiLanguage, other.uiLanguage) &&  Objects.equals(uiAttributes, other.uiAttributes) &&  Objects.equals(uiDependencies, other.uiDependencies) &&  Objects.equals(uiVersion, other.uiVersion) &&  Objects.equals(serviceVersion, other.serviceVersion) &&  Objects.equals(callRecordingEnabled, other.callRecordingEnabled) &&  Objects.equals(callRecordingWebhookUrl, other.callRecordingWebhookUrl) &&  Objects.equals(crmEnabled, other.crmEnabled) &&  Objects.equals(crmType, other.crmType) &&  Objects.equals(crmCallbackUrl, other.crmCallbackUrl) &&  Objects.equals(crmFallbackUrl, other.crmFallbackUrl) &&  Objects.equals(crmAttributes, other.crmAttributes) &&  Objects.equals(publicAttributes, other.publicAttributes) &&  Objects.equals(pluginServiceEnabled, other.pluginServiceEnabled) &&  Objects.equals(pluginServiceAttributes, other.pluginServiceAttributes) &&  Objects.equals(integrations, other.integrations) &&  Objects.equals(outboundCallFlows, other.outboundCallFlows) &&  Objects.equals(serverlessServiceSids, other.serverlessServiceSids) &&  Objects.equals(queueStatsConfiguration, other.queueStatsConfiguration) &&  Objects.equals(notifications, other.notifications) &&  Objects.equals(markdown, other.markdown) &&  Objects.equals(url, other.url) &&  Objects.equals(flexInsightsHr, other.flexInsightsHr) &&  Objects.equals(flexInsightsDrilldown, other.flexInsightsDrilldown) &&  Objects.equals(flexUrl, other.flexUrl) &&  Objects.equals(channelConfigs, other.channelConfigs) &&  Objects.equals(debuggerIntegration, other.debuggerIntegration) &&  Objects.equals(flexUiStatusReport, other.flexUiStatusReport) &&  Objects.equals(agentConvEndMethods, other.agentConvEndMethods) &&  Objects.equals(citrixVoiceVdi, other.citrixVoiceVdi) &&  Objects.equals(offlineConfig, other.offlineConfig)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, dateCreated, dateUpdated, attributes, status, taskrouterWorkspaceSid, taskrouterTargetWorkflowSid, taskrouterTargetTaskqueueSid, taskrouterTaskqueues, taskrouterSkills, taskrouterWorkerChannels, taskrouterWorkerAttributes, taskrouterOfflineActivitySid, runtimeDomain, messagingServiceInstanceSid, chatServiceInstanceSid, flexServiceInstanceSid, flexInstanceSid, uiLanguage, uiAttributes, uiDependencies, uiVersion, serviceVersion, callRecordingEnabled, callRecordingWebhookUrl, crmEnabled, crmType, crmCallbackUrl, crmFallbackUrl, crmAttributes, publicAttributes, pluginServiceEnabled, pluginServiceAttributes, integrations, outboundCallFlows, serverlessServiceSids, queueStatsConfiguration, notifications, markdown, url, flexInsightsHr, flexInsightsDrilldown, flexUrl, channelConfigs, debuggerIntegration, flexUiStatusReport, agentConvEndMethods, citrixVoiceVdi, offlineConfig);
    }


}

