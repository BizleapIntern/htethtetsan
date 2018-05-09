package com.bizleap.training.assignment.four;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoaderImpl implements Loader {

    public List<Employee> readEmployeeFileAndAddToListLoader() {
        String employeefile = "D:\\Employee.txt";

        List<Employee> employeeList = new ArrayList<Employee> ();

        String employee, employeeID, name, title, email, phone, companyWorkFor = null;
        String age;
        String salary;
        try {
            BufferedReader br1 = new BufferedReader ( new FileReader ( employeefile ) );


            while ((employee = br1.readLine ()) != null){
                String[] splitedEmployee = employee.split ( "," );

                employeeID = splitedEmployee[0];
                name = splitedEmployee[1];
                age=splitedEmployee[2];
                title = splitedEmployee[3];
                salary = splitedEmployee[4];
                email = splitedEmployee[5];
                phone = splitedEmployee[6];
                companyWorkFor = splitedEmployee [7];
                employeeList.add ( new Employee ( employeeID, name, age, title, salary, email, phone, companyWorkFor ) );
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
         return employeeList;
    }

    public List<Company> readCompanyFileAndAddToListLoader() {
        String companyfile = "D:\\Company.txt";
        List<Company> companyList = new ArrayList<Company> ();
        String company = "", companyID = null, companyName, address, companyEmail, companyPhone, CEO;
        try {
            BufferedReader br2 = new BufferedReader ( new FileReader ( companyfile ) );
            while ((company = br2.readLine ()) != null) {
                String[] splitedCompany = company.split ( "," );

                companyID = splitedCompany[0];
                companyName = splitedCompany[1];
                address = splitedCompany[2];
                companyPhone = splitedCompany[3];
                companyEmail = splitedCompany[4];
                CEO = splitedCompany[5];
                companyList.add ( new Company ( companyID, companyName, address, companyPhone, companyEmail, CEO ) );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return  companyList;

    }
}




