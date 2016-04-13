/*
 *  Any use of the Material is governed by the terms of the actual license
 *  agreement between LeanTaaS Inc. and the user.
 *  Copyright 2010 LeanTaaS Inc., Sunnyvale CA USA.
 *  All rights reserved. Any rights not expressly granted herein are
 *  reserved.
 */

package app;

import com.swagger.api.EmployeesApi;
import com.swagger.api.EmployeesApiService;
import com.swagger.api.NotFoundException;
import com.swagger.api.factories.EmployeesApiServiceFactory;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.lang.Override;

/**
 * 
 * @author <a href="vamsee.chava@gmail.com">vamsi</a>
 * @version $Revision: 1.0 $, $Date: 13-Apr-2016
 */
class EmployeeResources extends EmployeesApi {
    private final EmployeesApiService delegate = EmployeesApiServiceFactory.getEmployeesApi();

    @Override
    public Response employeesGet(@Context SecurityContext securityContext) throws NotFoundException {
        //TODO:: Change what ever u want here . We can also change the delegate assigned.
        return this.delegate.employeesGet(securityContext);
    }


}
