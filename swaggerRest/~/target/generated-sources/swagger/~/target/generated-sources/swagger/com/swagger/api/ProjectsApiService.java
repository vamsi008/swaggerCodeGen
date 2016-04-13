package com.swagger.api;

import com.swagger.api.*;
import com.swagger.model.*;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-04-13T14:21:10.620+05:30")
public abstract class ProjectsApiService {
  
      public abstract Response projectsGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response projectsPost(Project body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response projectsProjectIDGet(String projectID,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response projectsProjectIDPut(String projectID,Project body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response projectsProjectIDDelete(String projectID,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response projectsProjectIDEmployeesGet(String projectID,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response projectsProjectIDEmployeesPost(String projectID,Body body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response projectsProjectIDEmployeesDelete(String projectID,Body1 body,SecurityContext securityContext)
      throws NotFoundException;
  
}
