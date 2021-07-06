package com.company;

public class Main {

    public static void main(String[] args) {

        //For testing the if the empty constructor executes
         BankAccount bankAccount= new BankAccount();//("123456",1000,"Prince","holyshit@yeahboy.com","078 123 mycrush");


        bankAccount.setBalance(5000.0);
        bankAccount.withdrawFunds(500);
        bankAccount.DepositFunds(5000);
        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getEmail());

        //For testing if the third constructor is working
        BankAccount newOne =new BankAccount("Mandla","Prince@udemy.com","08256456545");
        System.out.println("Name: "+ newOne.getCustomerName() +"Email Address: " +newOne.getEmail() + "Phone number :" +newOne.getPhoneNumber() );

        //Testing the empty constructor
        VipCustomer myVip = new VipCustomer();
        System.out.println("Name is " + myVip.getName()+ " the other one :" + myVip.getEmailAddress() + " Credit limit is : "+ myVip.getCreditLimit());
        //Testing the Contrustor with one default value
        VipCustomer myVip2 =new VipCustomer(1000,"Prince@test.com");
        System.out.println("Test the double initialized Construtor :" +myVip2.getName() + " the credit limit " + myVip2.getCreditLimit() + " Email Address : "+ myVip2.getEmailAddress());

        //Testing the constructor with all intialized values
        VipCustomer myVip3 = new VipCustomer("Prince",1000,"Prince@3rdConstructor");
        System.out.println("Test the Third Constructor : " +myVip3.getName() + " the credit limit " + myVip3.getCreditLimit() + " Email Address : "+ myVip3.getEmailAddress());
    }
}
