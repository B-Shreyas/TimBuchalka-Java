package oops.constructors;

public class BankManager {
	
	
	//String Shreyas;

	public static void main(String args[]) {
		
		
		BankAccount shri = new BankAccount(); //10002152, 1000.0, "Shri Basutkar", "Shri.bas02@gmail.com",  901178300);
		System.out.println(shri.getAccountNumber());
		System.out.println(shri.getAccountBalance());
		
		shri.depositFunds(1000);
		shri.depositFunds(2000.0);
		shri.withdrawFunds(1000.0 + 500.0);
		
		BankAccount shreyas = new BankAccount("Shreyas", "abc@gmail.com", 92165165);
		System.out.println(shreyas.getAccountNumber() + " name " + shreyas.getCustomerName());
		
		
//		shreyas.setAccountBalance(12000.10);
//		System.out.println("The account balance of user ---->> " + shreyas.getAccountBalance());
//		
//		shreyas.depositFunds(12000.10);
//		System.out.println("After incrementing the account balance of user ---->> " + shreyas.getAccountBalance());
//		
//		shri.setAccountBalance(1000);
//		System.out.println("The account balance of user ---->> " + shri.getAccountBalance());
//		
		
		//System.out.println("After withdrawal acc. bal. of user ---->> " + shri.getAccountBalance());
		
		
		
}
}