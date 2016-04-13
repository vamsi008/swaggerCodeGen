package com.swagger.api;

import com.swagger.model.*;
import com.swagger.api.EmployeesApiService;
import com.swagger.api.factories.EmployeesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import com.swagger.model.Employee;
import com.swagger.model.Project;

import java.util.List;
import com.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/employees")


@io.swagger.annotations.Api(description = "the employees API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-04-13T14:21:10.620+05:30")
public class EmployeesApi  {
   private final EmployeesApiService delegate = EmployeesApiServiceFactory.getEmployeesApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for fetching all employees", notes = "", response = Employee.class, responseContainer = "List", tags={ "employees",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Employee list", response = Employee.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Employee.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Employee.class, responseContainer = "List") })

    public Response employeesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.employeesGet(securityContext);
    }
    @POST
    
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for adding a new employee", notes = "", response = Employee.class, tags={ "employees",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Employee added successfully", response = Employee.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Employee.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Employee.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Employee.class) })

    public Response employeesPost(@ApiParam(value = "Employee object that needs to be added" ,required=true) Employee body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.employeesPost(body,securityContext);
    }
    @GET
    @Path("/{empID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for getting an employee Details", notes = "", response = Employee.class, tags={ "employees",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Fetched Employee Details Successfully", response = Employee.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Employee.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Employee.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Employee not found", response = Employee.class) })

    public Response employeesEmpIDGet(@ApiParam(value = "ID of the employee",required=true) @PathParam("empID") String empID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.employeesEmpIDGet(empID,securityContext);
    }
    @PUT
    @Path("/{empID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for updating an employee details", notes = "", response = Employee.class, tags={ "employees",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Employee details Updated successfully", response = Employee.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Employee.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Employee.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Employee not found", response = Employee.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Employee.class) })

    public Response employeesEmpIDPut(@ApiParam(value = "Id of the employee to be updated",required=true) @PathParam("empID") String empID,@ApiParam(value = "Employee object to be updated to" ,required=true) Employee body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.employeesEmpIDPut(empID,body,securityContext);
    }
    @DELETE
    @Path("/{empID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for deleting an Employee", notes = "", response = Void.class, tags={ "employees",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Employee deleted successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Employee not found", response = Void.class) })

    public Response employeesEmpIDDelete(@ApiParam(value = "ID of the Employee",required=true) @PathParam("empID") String empID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.employeesEmpIDDelete(empID,securityContext);
    }
    @GET
    @Path("/{empID}/projects")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for getting project details of an employee", notes = "", response = Project.class, responseContainer = "List", tags={ "employees" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project details of an employee", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Employee not found", response = Project.class, responseContainer = "List") })

    public Response employeesEmpIDProjectsGet(@ApiParam(value = "ID of the Employee",required=true) @PathParam("empID") String empID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.employeesEmpIDProjectsGet(empID,securityContext);
    }
}
