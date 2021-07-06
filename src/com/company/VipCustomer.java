package com.company;

public class VipCustomer {
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer(){
        this("Default",1000,"Default@Default.com");
    }

    public VipCustomer(double creditLimit,String emailAddress){
        this("Default value",creditLimit,emailAddress);
    }
    public VipCustomer(String name, double creditLimit,String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;

    }


}
