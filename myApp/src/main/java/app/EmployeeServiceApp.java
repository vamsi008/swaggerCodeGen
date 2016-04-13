package app;

import javax.ws.rs.core.Application;
import java.lang.Override;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
//import com.employee.app.EmployeeResources;

/*
 *  Any use of the Material is governed by the terms of the actual license
 *  agreement between LeanTaaS Inc. and the user.
 *  Copyright 2010 LeanTaaS Inc., Sunnyvale CA USA.
 *  All rights reserved. Any rights not expressly granted herein are
 *  reserved.
 */

/**
 * 
 * @author <a href="vamsee.chava@gmail.com">vamsi</a>
 * @version $Revision: 1.0 $, $Date: 13-Apr-2016
 */
public class EmployeeServiceApp extends Application{

    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(EmployeeResources.class);
        return classes;
        //return Collections.emptySet();
    }


}
