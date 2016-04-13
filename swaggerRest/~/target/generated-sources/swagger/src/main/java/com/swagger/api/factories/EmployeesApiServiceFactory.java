package com.swagger.api.factories;

import com.swagger.api.EmployeesApiService;
import com.swagger.api.impl.EmployeesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-04-13T14:21:10.620+05:30")
public class EmployeesApiServiceFactory {

   private final static EmployeesApiService service = new EmployeesApiServiceImpl();

   public static EmployeesApiService getEmployeesApi()
   {
      return service;
   }
}
