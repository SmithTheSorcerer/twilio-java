/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Taskrouter
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Taskrouter
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class TaskQueueCreator extends Creator<TaskQueue>{
    private String workspaceSid;
    private String friendlyName;
    private String targetWorkers;
    private Integer maxReservedWorkers;
    private TaskQueue.TaskOrder taskOrder;
    private String reservationActivitySid;
    private String assignmentActivitySid;

    public TaskQueueCreator(final String workspaceSid, final String friendlyName) {
        this.workspaceSid = workspaceSid;
        this.friendlyName = friendlyName;
    }

    public TaskQueueCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public TaskQueueCreator setTargetWorkers(final String targetWorkers){
        this.targetWorkers = targetWorkers;
        return this;
    }
    public TaskQueueCreator setMaxReservedWorkers(final Integer maxReservedWorkers){
        this.maxReservedWorkers = maxReservedWorkers;
        return this;
    }
    public TaskQueueCreator setTaskOrder(final TaskQueue.TaskOrder taskOrder){
        this.taskOrder = taskOrder;
        return this;
    }
    public TaskQueueCreator setReservationActivitySid(final String reservationActivitySid){
        this.reservationActivitySid = reservationActivitySid;
        return this;
    }
    public TaskQueueCreator setAssignmentActivitySid(final String assignmentActivitySid){
        this.assignmentActivitySid = assignmentActivitySid;
        return this;
    }

    @Override
    public TaskQueue create(final TwilioRestClient client){
        String path = "/v1/Workspaces/{WorkspaceSid}/TaskQueues";

        path = path.replace("{"+"WorkspaceSid"+"}", this.workspaceSid.toString());
        path = path.replace("{"+"FriendlyName"+"}", this.friendlyName.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.TASKROUTER.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("TaskQueue creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return TaskQueue.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (targetWorkers != null) {
            request.addPostParam("TargetWorkers", targetWorkers);
    
        }
        if (maxReservedWorkers != null) {
            request.addPostParam("MaxReservedWorkers", maxReservedWorkers.toString());
    
        }
        if (taskOrder != null) {
            request.addPostParam("TaskOrder", taskOrder.toString());
    
        }
        if (reservationActivitySid != null) {
            request.addPostParam("ReservationActivitySid", reservationActivitySid);
    
        }
        if (assignmentActivitySid != null) {
            request.addPostParam("AssignmentActivitySid", assignmentActivitySid);
    
        }
    }
}
