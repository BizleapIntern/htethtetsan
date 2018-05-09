package com.bizleap.training.assignment.four;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssociationMapperImpl implements AssociationMapper {

    public Map addCompanyToEmployee(Employee employee) {
        Map<String,List<Employee>> employeeMap=new HashMap<String,List<Employee>>() ;
           List<Employee> employeeList=(List<Employee>) employeeMap.get ( employee.companyWorkFor );
           if (employeeList!=null){
               employeeList.add ( employee );

           }else {
               employeeList=new ArrayList<Employee> (  );
               employeeList.add ( employee );
               employeeMap.put ( employee.companyWorkFor,employeeList );
           }
return employeeMap;
    }
}
