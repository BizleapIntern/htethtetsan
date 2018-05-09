package com.bizleap.training.assignment.four;

public class Company extends AbstractEntity {
    String COMPID;
    String CEO;
    String address;
    public Company(String COMPID,String name,String address,String phone,String email,String CEO){
        super (name, email, phone );
        this.COMPID=COMPID;
        this.address=address;
        this.CEO=CEO;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        return this.getName ()+" "+this.getAddress ()+" "+this.getEmail ()+" "+this.getPhone ()+" "+this.CEO;

    }
}

