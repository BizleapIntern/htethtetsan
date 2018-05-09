package com.bizleap.training.assignment.four;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DataManager {
    public void createAssociationMapLoader(){
       for (Employee employee:(List<Employee>)new LoaderImpl ().readEmployeeFileAndAddToListLoader ()) {
           Map<String,List<Employee>> employeeMap= new AssociationMapperImpl ().addCompanyToEmployee ( employee );//
           print ( employeeMap );
       }
    }

   public void print (Map employeeMap) {
       Iterator iterator = employeeMap.entrySet ().iterator ();
       while (iterator.hasNext ()) {
           Entry<String, List<Employee>> entry = (Entry<String, List<Employee>>) iterator.next ();

           for (Company company : (List<Company>) new LoaderImpl ().readCompanyFileAndAddToListLoader ()) {
               if (entry.getKey ().equals ( company.COMPID )) {
                   System.out.print (entry.getValue ()+"  work for -> " );
                   System.out.println (company.getName () +"\n");
                   }
               }
           }
       }

    public static void main(String[] args) {
        new DataManager ().createAssociationMapLoader ();
    }

}
