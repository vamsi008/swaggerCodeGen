package com.swagger.api.factories;

import com.swagger.api.ProjectsApiService;
import com.swagger.api.impl.ProjectsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-04-13T14:24:37.200+05:30")
public class ProjectsApiServiceFactory {

   private final static ProjectsApiService service = new ProjectsApiServiceImpl();

   public static ProjectsApiService getProjectsApi()
   {
      return service;
   }
}
