package com.bizleap.training.assignment.four;

import java.util.List;

public interface Loader {
   public List<Employee> readEmployeeFileAndAddToListLoader();
   public List<Company> readCompanyFileAndAddToListLoader();

}
