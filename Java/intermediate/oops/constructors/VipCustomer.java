package oops.constructors;

public class VipCustomer {

	private String CustomerName;
	private int CreditLimit;
	private String EmailAddress;

	public VipCustomer() {
		System.out.println("Empty constructor called.");

	}

	public VipCustomer(String CustomerName, int CreditLimit) {
		System.out.println("Two constructors are called and 1 is default.");
		this.CustomerName = CustomerName;
		this.CreditLimit = CreditLimit;

	}

	public VipCustomer(String CustomerName, int CreditLimit, String EmailAddress) {
		System.out.println("All of the constructors are called");
		this.CustomerName = CustomerName;
		this.CreditLimit = CreditLimit;
		this.EmailAddress = EmailAddress;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public long getCreditLimit() {
		return CreditLimit;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

}
