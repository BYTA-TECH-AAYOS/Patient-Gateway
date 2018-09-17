/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.patientapigateway.client.appointment.api;

import com.bytatech.ayoos.patientapigateway.client.appointment.model.AppointmentDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-17T16:20:18.161+05:30[Asia/Kolkata]")

@Api(value = "AppointmentResource", description = "the AppointmentResource API")
public interface AppointmentResourceApi {

    @ApiOperation(value = "createAppointment", nickname = "createAppointmentUsingPOST1", notes = "", response = AppointmentDTO.class, tags={ "appointment-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AppointmentDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/appointments",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<AppointmentDTO> createAppointmentUsingPOST1(@ApiParam(value = "appointmentDTO" ,required=true )  @Valid @RequestBody AppointmentDTO appointmentDTO);


    @ApiOperation(value = "deleteAppointment", nickname = "deleteAppointmentUsingDELETE1", notes = "", tags={ "appointment-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/appointments/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAppointmentUsingDELETE1(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllAppointments", nickname = "getAllAppointmentsUsingGET1", notes = "", response = AppointmentDTO.class, responseContainer = "List", tags={ "appointment-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AppointmentDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/appointments",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<AppointmentDTO>> getAllAppointmentsUsingGET1(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getAppointment", nickname = "getAppointmentUsingGET1", notes = "", response = AppointmentDTO.class, tags={ "appointment-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AppointmentDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/appointments/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<AppointmentDTO> getAppointmentUsingGET1(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchAppointments", nickname = "searchAppointmentsUsingGET1", notes = "", response = AppointmentDTO.class, responseContainer = "List", tags={ "appointment-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AppointmentDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/appointments",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<AppointmentDTO>> searchAppointmentsUsingGET1(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "updateAppointment", nickname = "updateAppointmentUsingPUT1", notes = "", response = AppointmentDTO.class, tags={ "appointment-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AppointmentDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/appointments",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<AppointmentDTO> updateAppointmentUsingPUT1(@ApiParam(value = "appointmentDTO" ,required=true )  @Valid @RequestBody AppointmentDTO appointmentDTO);

}
