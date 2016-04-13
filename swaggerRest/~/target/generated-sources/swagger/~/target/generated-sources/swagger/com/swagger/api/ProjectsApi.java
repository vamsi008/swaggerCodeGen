package com.swagger.api;

import com.swagger.model.*;
import com.swagger.api.ProjectsApiService;
import com.swagger.api.factories.ProjectsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import com.swagger.model.Project;
import com.swagger.model.Employee;
import com.swagger.model.Body;
import com.swagger.model.Body1;

import java.util.List;
import com.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/projects")


@io.swagger.annotations.Api(description = "the projects API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-04-13T14:21:10.620+05:30")
public class ProjectsApi  {
   private final ProjectsApiService delegate = ProjectsApiServiceFactory.getProjectsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Fetch All the Projects", notes = "", response = Project.class, responseContainer = "List", tags={ "projects",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Fetched all Projects Successfully", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Project.class, responseContainer = "List") })

    public Response projectsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.projectsGet(securityContext);
    }
    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for adding a new project", notes = "", response = Project.class, responseContainer = "List", tags={ "projects",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Added new Project Successfully", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input data", response = Project.class, responseContainer = "List") })

    public Response projectsPost(@ApiParam(value = "Project object to be added" ,required=true) Project body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.projectsPost(body,securityContext);
    }
    @GET
    @Path("/{projectID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for fetching Project Details", notes = "", response = Project.class, responseContainer = "List", tags={ "projects",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Fetched Project Details Successfully", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Project not found", response = Project.class, responseContainer = "List") })

    public Response projectsProjectIDGet(@ApiParam(value = "Project ID",required=true) @PathParam("projectID") String projectID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.projectsProjectIDGet(projectID,securityContext);
    }
    @PUT
    @Path("/{projectID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for updating a project", notes = "", response = Project.class, responseContainer = "List", tags={ "projects",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Updated Project Successfully", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Project not found", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input data", response = Project.class, responseContainer = "List") })

    public Response projectsProjectIDPut(@ApiParam(value = "Project ID",required=true) @PathParam("projectID") String projectID,@ApiParam(value = "Project object to be updated to" ,required=true) Project body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.projectsProjectIDPut(projectID,body,securityContext);
    }
    @DELETE
    @Path("/{projectID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for deleting project details", notes = "", response = Project.class, responseContainer = "List", tags={ "projects",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Deleted Project Details Successfully", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Project.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Project not found", response = Project.class, responseContainer = "List") })

    public Response projectsProjectIDDelete(@ApiParam(value = "Project ID",required=true) @PathParam("projectID") String projectID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.projectsProjectIDDelete(projectID,securityContext);
    }
    @GET
    @Path("/{projectID}/employees")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for getting employees in a project", notes = "", response = Employee.class, responseContainer = "List", tags={ "projects",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project list constructed", response = Employee.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Employee.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Employee.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Project not found", response = Employee.class, responseContainer = "List") })

    public Response projectsProjectIDEmployeesGet(@ApiParam(value = "Project ID",required=true) @PathParam("projectID") String projectID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.projectsProjectIDEmployeesGet(projectID,securityContext);
    }
    @POST
    @Path("/{projectID}/employees")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for getting employees in a project", notes = "", response = Void.class, tags={ "projects",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Employee added to the project", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Project not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response projectsProjectIDEmployeesPost(@ApiParam(value = "Project ID",required=true) @PathParam("projectID") String projectID,@ApiParam(value = "EmployeeID to be added" ,required=true) Body body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.projectsProjectIDEmployeesPost(projectID,body,securityContext);
    }
    @DELETE
    @Path("/{projectID}/employees")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operation for getting employees in a project", notes = "", response = Void.class, tags={ "projects" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Employee deleted from the project", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "UnAuthenticated request", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unauthorized Request", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Project not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })

    public Response projectsProjectIDEmployeesDelete(@ApiParam(value = "Project ID",required=true) @PathParam("projectID") String projectID,@ApiParam(value = "EmployeeID to be deleted" ,required=true) Body1 body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.projectsProjectIDEmployeesDelete(projectID,body,securityContext);
    }
}
