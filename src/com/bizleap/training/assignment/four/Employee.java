package com.bizleap.training.assignment.four;
public class Employee extends AbstractEntity{
    String EMPID;
    String age;
    String salary;
    String title;
    String companyWorkFor;//foreign
public  Employee(String EMPID,String name,String age,String title,String salary,String email,String phone,String companyWorkFor){
    super (name, email, phone );
    this.EMPID=EMPID;
    this.age=age;
    this.title=title;
    this.salary=salary;
    this.companyWorkFor=companyWorkFor;
}

    public String getEMPID() {
        return EMPID;
    }

    public void setEMPID(String EMPID) {
        this.EMPID = EMPID;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyWorkFor() {
        return companyWorkFor;
    }

    public void setCompanyWorkFor(String companyWorkFor) {
        this.companyWorkFor = companyWorkFor;
    }

    public String toString(){
        return this.EMPID+" "+ this.getName ()+" "+this.age+" "+this.salary+" "+this.title+" "+this.getEmail ()+" "+this.getPhone ()+"\n";

    }
}
