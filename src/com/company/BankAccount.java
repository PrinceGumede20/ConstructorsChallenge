package com.company;

public class BankAccount {

    private String accountNumber;
    private Double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56456",1000,"default","default","default");
        System.out.println("Constructor Empty as fuck");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email,String phoneNumber){
        System.out.println("Account constructor with parameters called" );
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;


    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999",100,  customerName, email,  phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }



    public Double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void DepositFunds(double funds){
        Double newBalance = balance + funds;
        this.balance=newBalance;
       System.out.println("Amount deposited : R"+ funds + "processed . New balance is :R"+newBalance);
    }

    public  void withdrawFunds(double withdrawalSum){
        if(balance < withdrawalSum){
            System.out.println("Insufficient Balance");
        }else{
            Double newBalance = balance - withdrawalSum;
            this.balance=newBalance;
            System.out.println("Withdrawal of R" + withdrawalSum + " processed. Remaining balance is :R"+newBalance);
        }
    }
}
