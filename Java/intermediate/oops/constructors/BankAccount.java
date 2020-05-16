package oops.constructors;

public class BankAccount {

	private long accountNumber;
	private double accountBalance;
	private String customerName;
	private String email;
	private long phoneNo;
	
	public BankAccount() {                                              // its a default constructor
		this(12344, 12450.1, "default name", "default address", 512165); // this is calling 1 constructor to another
		System.out.println("Empty constructor called");
		
	}
	
	

	public BankAccount(long accountNumber, double accountBalance, String customerName, String email, long phoneNo) {
		System.out.println("BankAccount constructors with parameters are called");
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNo = phoneNo;
		
	}
	
	public BankAccount(String customerName, String email, long phoneNo) {
		this(12345, 2000.0, customerName, email, phoneNo);
//		this.customerName = customerName;
//		this.email = email;
//		this.phoneNo = phoneNo;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public double getAccountBalance() {
		 return this.accountBalance; 
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public long getPhoneNo() {
		return this.phoneNo;
	}
	
	public void depositFunds(double depositAmount) {
		this.accountBalance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is  " + this.accountBalance);
	}
	
	public void withdrawFunds(double withdrawalAmount) {
		if(this.accountBalance - withdrawalAmount <= 0) {
			System.out.println("Sorry you have only " + this.accountBalance + " avilable. Withdrawal not proceed");
		} else {
		    this.accountBalance -= withdrawalAmount;
		    System.out.println("Withdrawal of " + withdrawalAmount + " proceed.  Remaining balance = " + this.accountBalance);
		}
	}
}
