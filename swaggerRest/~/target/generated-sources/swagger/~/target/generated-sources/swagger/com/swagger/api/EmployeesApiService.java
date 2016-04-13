package com.swagger.api;

import com.swagger.api.*;
import com.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import com.swagger.model.Employee;
import com.swagger.model.Project;

import java.util.List;
import com.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-04-13T14:21:10.620+05:30")
public abstract class EmployeesApiService {
  
      public abstract Response employeesGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response employeesPost(Employee body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response employeesEmpIDGet(String empID,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response employeesEmpIDPut(String empID,Employee body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response employeesEmpIDDelete(String empID,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response employeesEmpIDProjectsGet(String empID,SecurityContext securityContext)
      throws NotFoundException;
  
}
