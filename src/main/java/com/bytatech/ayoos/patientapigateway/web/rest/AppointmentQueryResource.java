package com.bytatech.ayoos.patientapigateway.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.appointment.model.PaymentInfo;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.RestVariable;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.Appointment;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.AppointmentDTO;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.AppointmentDetails;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.ConsultationDetails;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.DataResponse;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.DoctorInfo;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.HistoricTaskInstanceQueryRequest;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.OpenAppointmentResponse;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.Slot;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.TaskQueryRequest;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.TaskResponse;
import com.bytatech.ayoos.patientapigateway.client.appointment.api.AppointmentQueryResourceApi;

import com.codahale.metrics.annotation.Timed;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/query")
public class AppointmentQueryResource {

	@Autowired
	private  AppointmentQueryResourceApi appointmentQueryResourceApi;

	private final Logger log = LoggerFactory.getLogger(AppointmentQueryResource.class);

	@GetMapping("/_search/appointments")
	@Timed
	public ResponseEntity<List<AppointmentDTO>> searchAppointments(@RequestParam String query) {
		log.debug("REST request to search Appointments for query {}", query);
		return appointmentQueryResourceApi.searchAppointmentsUsingGET(query);
	}

	@GetMapping("/tasks")
	public ResponseEntity<DataResponse> getTasks(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "description", required = false) String description,
			@RequestParam(value = "priority", required = false) String priority,
			@RequestParam(value = "minimumPriority", required = false) String minimumPriority,
			@RequestParam(value = "maximumPriority", required = false) String maximumPriority,
			@RequestParam(value = "assignee", required = false) String assignee,
			@RequestParam(value = "assigneeLike", required = false) String assigneeLike,
			@RequestParam(value = "owner", required = false) String owner,
			@RequestParam(value = "ownerLike", required = false) String ownerLike,
			@RequestParam(value = "unassigned", required = false) String unassigned,
			@RequestParam(value = "delegationState", required = false) String delegationState,
			@RequestParam(value = "candidateUser", required = false) String candidateUser,
			@RequestParam(value = "candidateGroup", required = false) String candidateGroup,
			@RequestParam(value = "candidateGroups", required = false) String candidateGroups,
			@RequestParam(value = "involvedUser", required = false) String involvedUser,
			@RequestParam(value = "taskDefinitionKey", required = false) String taskDefinitionKey,
			@RequestParam(value = "taskDefinitionKeyLike", required = false) String taskDefinitionKeyLike,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processInstanceBusinessKey", required = false) String processInstanceBusinessKey,
			@RequestParam(value = "processInstanceBusinessKeyLike", required = false) String processInstanceBusinessKeyLike,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given id.") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given key.") @Valid @RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a key like the given value.") @Valid @RequestParam(value = "processDefinitionKeyLike", required = false) String processDefinitionKeyLike,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given name.") @Valid @RequestParam(value = "processDefinitionName", required = false) String processDefinitionName,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a name like the given value.") @Valid @RequestParam(value = "processDefinitionNameLike", required = false) String processDefinitionNameLike,
			@ApiParam(value = "Only return tasks which are part of the execution with the given id.") @Valid @RequestParam(value = "executionId", required = false) String executionId,
			@ApiParam(value = "Only return tasks which are created on the given date.") @Valid @RequestParam(value = "createdOn", required = false) String createdOn,
			@ApiParam(value = "Only return tasks which are created before the given date.") @Valid @RequestParam(value = "createdBefore", required = false) String createdBefore,
			@ApiParam(value = "Only return tasks which are created after the given date.") @Valid @RequestParam(value = "createdAfter", required = false) String createdAfter,
			@ApiParam(value = "Only return tasks which are due on the given date.") @Valid @RequestParam(value = "dueOn", required = false) String dueOn,
			@ApiParam(value = "Only return tasks which are due before the given date.") @Valid @RequestParam(value = "dueBefore", required = false) String dueBefore,
			@ApiParam(value = "Only return tasks which are due after the given date.") @Valid @RequestParam(value = "dueAfter", required = false) String dueAfter,
			@ApiParam(value = "Only return tasks which don�t have a due date. The property is ignored if the value is false.") @Valid @RequestParam(value = "withoutDueDate", required = false) Boolean withoutDueDate,
			@ApiParam(value = "Only return tasks that are not a subtask of another task.") @Valid @RequestParam(value = "excludeSubTasks", required = false) Boolean excludeSubTasks,
			@ApiParam(value = "If true, only return tasks that are not suspended (either part of a process that is not suspended or not part of a process at all). If false, only tasks that are part of suspended process instances are returned.") @Valid @RequestParam(value = "active", required = false) Boolean active,
			@ApiParam(value = "Indication to include task local variables in the result.") @Valid @RequestParam(value = "includeTaskLocalVariables", required = false) Boolean includeTaskLocalVariables,
			@ApiParam(value = "Indication to include process variables in the result.") @Valid @RequestParam(value = "includeProcessVariables", required = false) Boolean includeProcessVariables,
			@ApiParam(value = "Only return tasks with the given tenantId.") @Valid @RequestParam(value = "tenantId", required = false) String tenantId,
			@ApiParam(value = "Only return tasks with a tenantId like the given value.") @Valid @RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@ApiParam(value = "If true, only returns tasks without a tenantId set. If false, the withoutTenantId parameter is ignored.") @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@ApiParam(value = "Select tasks that has been claimed or assigned to user or waiting to claim by user (candidate user or groups).") @Valid @RequestParam(value = "candidateOrAssigned", required = false) String candidateOrAssigned,
			@ApiParam(value = "Select tasks with the given category. Note that this is the task category, not the category of the process definition (namespace within the BPMN Xml). ") @Valid @RequestParam(value = "category", required = false) String category) {

		return appointmentQueryResourceApi.getTasksUsingGET(active, assignee, assigneeLike, candidateGroup, candidateGroups, candidateOrAssigned, candidateUser, category, createdAfter, createdBefore, createdOn, delegationState, description, dueAfter, dueBefore, dueOn, excludeSubTasks, executionId, includeProcessVariables, includeTaskLocalVariables, involvedUser, maximumPriority, minimumPriority, name, nameLike, owner, ownerLike, maximumPriority, processDefinitionId, processDefinitionKey, processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, processInstanceBusinessKey, processInstanceBusinessKeyLike, processInstanceId, taskDefinitionKey, taskDefinitionKeyLike, tenantId, tenantIdLike, unassigned, withoutDueDate, withoutTenantId);
	}
	@PostMapping("/tasks")
	public ResponseEntity<DataResponse> getQueryResult(@RequestBody TaskQueryRequest taskQueryRequest) {
		return appointmentQueryResourceApi.getQueryResultUsingPOST(taskQueryRequest);
	}

	@GetMapping("/tasks/{taskId}")
	public ResponseEntity<TaskResponse> getTask(@PathVariable String taskId) {
		return appointmentQueryResourceApi.getTaskUsingGET(taskId);
	}

	@GetMapping("/tasks/{taskId}/{variableName}")
	public ResponseEntity<RestVariable> getTaskInstanceVariable(@PathVariable String taskId,
			@PathVariable String variableName, @RequestParam(required = false) String scope) {

		return appointmentQueryResourceApi.getTaskInstanceVariableUsingGET(taskId, variableName, scope);

	}

	@GetMapping("/tasks/{taskId}/variables")
	public ResponseEntity<List<RestVariable>> getTaskVariables(@PathVariable String taskId) {

		return appointmentQueryResourceApi.getTaskVariablesUsingGET(taskId);

	}

	@GetMapping("/history")
	public ResponseEntity<DataResponse> getTaskFormProperties(@RequestParam(required = false) String id,
			@RequestParam(required = false) String processInstanceId,
			@RequestParam(required = false) String executionId,
			@RequestParam(required = false) String activityInstanceId, @RequestParam(required = false) String taskId,
			@RequestParam(required = false) Boolean selectOnlyFormProperties,
			@RequestParam(required = false) Boolean selectOnlyVariableUpdates) {
		return appointmentQueryResourceApi.getTaskFormPropertiesUsingGET(activityInstanceId, executionId,
				activityInstanceId, processInstanceId, selectOnlyFormProperties, selectOnlyVariableUpdates, taskId);
	}

	@GetMapping("/appointmentAttributes/{processInstanceId}")
	public ResponseEntity<List<RestVariable>> getAllProcessAttributes(@PathVariable String processInstanceId,
			@RequestParam(required = false) String scope) {
		ResponseEntity<List<RestVariable>> variables = appointmentQueryResourceApi
				.getAllProcessAttributesUsingGET(processInstanceId, scope);
		return variables;
	}

	@GetMapping("/appointment-details/{processInstanceId}")
	public ResponseEntity<AppointmentDetails> getAppointmentDetails(@PathVariable String processInstanceId) {

		return appointmentQueryResourceApi.getAppointmentDetailsUsingGET(processInstanceId);
	}

	@GetMapping("/symptoms/{taskId}")
	public ResponseEntity<ConsultationDetails> getSymptoms(@PathVariable String taskId) {

		return appointmentQueryResourceApi.getSymptomsUsingGET(taskId);
	}

	@GetMapping("/paymentInfo/{taskId}")
	public PaymentInfo getPaymentInfo(@PathVariable String taskId) {

		// return appointmentQueryService.getPaymentInfo(taskId);
		return null;
	}


	@GetMapping("/appointments")
	@Timed
	public ResponseEntity<List<AppointmentDTO>> getAllAppointments() {
		log.debug("REST request to get all Appointments");
		return appointmentQueryResourceApi.getAllAppointmentsUsingGET();
	}

	/**
	 * GET /appointments/:id : get the "id" appointment.
	 *
	 * @param id the id of the appointmentDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         appointmentDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/appointments/{id}")
	@Timed
	public ResponseEntity<AppointmentDTO> getAppointment(@PathVariable Long id) {
		log.debug("REST request to get Appointment : {}", id);
		return  appointmentQueryResourceApi.getAppointmentUsingGET(id);
		
	}

	@PostMapping("/getHistoricTask")
	public ResponseEntity<DataResponse> getHistoricTask(@RequestBody HistoricTaskInstanceQueryRequest request) {

		return appointmentQueryResourceApi.getHistoricTaskUsingPOST(request);
	}

	@GetMapping("/myAppointments")
	public ResponseEntity<List<OpenAppointmentResponse>> getMyAppointments(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "description", required = false) String description,
			@RequestParam(value = "priority", required = false) String priority,
			@RequestParam(value = "minimumPriority", required = false) String minimumPriority,
			@RequestParam(value = "maximumPriority", required = false) String maximumPriority,
			@RequestParam(value = "assignee", required = false) String assignee,
			@RequestParam(value = "assigneeLike", required = false) String assigneeLike,
			@RequestParam(value = "owner", required = false) String owner,
			@RequestParam(value = "ownerLike", required = false) String ownerLike,
			@RequestParam(value = "unassigned", required = false) String unassigned,
			@RequestParam(value = "delegationState", required = false) String delegationState,
			@RequestParam(value = "candidateUser", required = false) String candidateUser,
			@RequestParam(value = "candidateGroup", required = false) String candidateGroup,
			@RequestParam(value = "candidateGroups", required = false) String candidateGroups,
			@RequestParam(value = "involvedUser", required = false) String involvedUser,
			@RequestParam(value = "taskDefinitionKey", required = false) String taskDefinitionKey,
			@RequestParam(value = "taskDefinitionKeyLike", required = false) String taskDefinitionKeyLike,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processInstanceBusinessKey", required = false) String processInstanceBusinessKey,
			@RequestParam(value = "processInstanceBusinessKeyLike", required = false) String processInstanceBusinessKeyLike,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given id.") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given key.") @Valid @RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a key like the given value.") @Valid @RequestParam(value = "processDefinitionKeyLike", required = false) String processDefinitionKeyLike,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given name.") @Valid @RequestParam(value = "processDefinitionName", required = false) String processDefinitionName,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a name like the given value.") @Valid @RequestParam(value = "processDefinitionNameLike", required = false) String processDefinitionNameLike,
			@ApiParam(value = "Only return tasks which are part of the execution with the given id.") @Valid @RequestParam(value = "executionId", required = false) String executionId,
			@ApiParam(value = "Only return tasks which are created on the given date.") @Valid @RequestParam(value = "createdOn", required = false) String createdOn,
			@ApiParam(value = "Only return tasks which are created before the given date.") @Valid @RequestParam(value = "createdBefore", required = false) String createdBefore,
			@ApiParam(value = "Only return tasks which are created after the given date.") @Valid @RequestParam(value = "createdAfter", required = false) String createdAfter,
			@ApiParam(value = "Only return tasks which are due on the given date.") @Valid @RequestParam(value = "dueOn", required = false) String dueOn,
			@ApiParam(value = "Only return tasks which are due before the given date.") @Valid @RequestParam(value = "dueBefore", required = false) String dueBefore,
			@ApiParam(value = "Only return tasks which are due after the given date.") @Valid @RequestParam(value = "dueAfter", required = false) String dueAfter,
			@ApiParam(value = "Only return tasks which don�t have a due date. The property is ignored if the value is false.") @Valid @RequestParam(value = "withoutDueDate", required = false) Boolean withoutDueDate,
			@ApiParam(value = "Only return tasks that are not a subtask of another task.") @Valid @RequestParam(value = "excludeSubTasks", required = false) Boolean excludeSubTasks,
			@ApiParam(value = "If true, only return tasks that are not suspended (either part of a process that is not suspended or not part of a process at all). If false, only tasks that are part of suspended process instances are returned.") @Valid @RequestParam(value = "active", required = false) Boolean active,
			@ApiParam(value = "Indication to include task local variables in the result.") @Valid @RequestParam(value = "includeTaskLocalVariables", required = false) Boolean includeTaskLocalVariables,
			@ApiParam(value = "Indication to include process variables in the result.") @Valid @RequestParam(value = "includeProcessVariables", required = false) Boolean includeProcessVariables,
			@ApiParam(value = "Only return tasks with the given tenantId.") @Valid @RequestParam(value = "tenantId", required = false) String tenantId,
			@ApiParam(value = "Only return tasks with a tenantId like the given value.") @Valid @RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@ApiParam(value = "If true, only returns tasks without a tenantId set. If false, the withoutTenantId parameter is ignored.") @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@ApiParam(value = "Select tasks that has been claimed or assigned to user or waiting to claim by user (candidate user or groups).") @Valid @RequestParam(value = "candidateOrAssigned", required = false) String candidateOrAssigned,
			@ApiParam(value = "Select tasks with the given category. Note that this is the task category, not the category of the process definition (namespace within the BPMN Xml). ") @Valid @RequestParam(value = "category", required = false) String category) {
		log.info("Assignee is " + assignee);
		return appointmentQueryResourceApi.getMyAppointmentsUsingGET(active, assignee, assigneeLike, candidateGroup, candidateGroups, candidateOrAssigned, candidateUser, category, createdAfter, createdBefore, createdOn, delegationState, description, dueAfter, dueBefore, dueOn, excludeSubTasks, executionId, includeProcessVariables, includeTaskLocalVariables, involvedUser, maximumPriority, minimumPriority, name, nameLike, owner, ownerLike, maximumPriority, processDefinitionId, processDefinitionKey, processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, processInstanceBusinessKey, processInstanceBusinessKeyLike, processInstanceId, taskDefinitionKey, taskDefinitionKeyLike, tenantId, tenantIdLike, unassigned, withoutDueDate, withoutTenantId);
	}

	@GetMapping("/doctoInfo/{processInstanceId}")
	public ResponseEntity<DoctorInfo> getDoctorInfo(@PathVariable String processInstanceId) {

		return appointmentQueryResourceApi.getDoctorInfoUsingGET(processInstanceId);

	}

	@GetMapping("/slotInfo/{processInstanceId}")
	public ResponseEntity<Slot> getSlotInfo(@PathVariable String processInstanceId) {

		return appointmentQueryResourceApi.getSlotInfoUsingGET(processInstanceId);

	}

	@GetMapping("/appointmentInfo/{processInstanceId}")
	public ResponseEntity<Appointment> getAppointmentInfo(@PathVariable String processInstanceId) {
		return appointmentQueryResourceApi.getAppointmentInfoUsingGET(processInstanceId);
	}

}
