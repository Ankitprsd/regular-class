package com.Techment.day5.oops;

class Customer
{
int custId;
String name;
Account account;

    public Customer(int custId, String name, Account account) {
	super();
	this.custId = custId;
	this.name = name;
	this.account = account;
}



void details()
{
	System.out.println("custid :"+ custId);
	System.out.println("name :"+ name);
	System.out.println("door no :"+ account.accountNo);
	System.out.println("streetname :"+ account.balance);
	System.out.println("city :"+ account.ifsc);
	System.out.println("pincode :"+ account.branch);


}
}

class Account
{
int accountNo;
String accountType;
int balance;
String ifsc;
String branch;



public Account(int accountNo, String accountType, int balance, String ifsc, String branch) {
	super();
	this.accountNo = accountNo;
	this.accountType = accountType;
	this.balance = balance;
	this.ifsc = ifsc;
	this.branch = branch;
}
}



public class HasARelationBank {


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Account account = new Account(3000005, "Savings", 25000, "SBIN0002409", "Nehru Nagar");
		Customer customer = new Customer(2409, "Ankit", account);
		customer.details();

	}

}


