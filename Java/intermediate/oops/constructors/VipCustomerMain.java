package oops.constructors;

public class VipCustomerMain {

	public static void main(String args[]) {

		VipCustomer shruti = new VipCustomer();
		System.out.println(shruti.getCustomerName());
		System.out.println(shruti.getCreditLimit());
		System.out.println(shruti.getEmailAddress());

		System.out.println("**********************************************************************");

		VipCustomer shailesh = new VipCustomer("Shailesh", 200000);
		System.out.println(shailesh.getCustomerName());
		System.out.println(shailesh.getCreditLimit());
		System.out.println(shailesh.getEmailAddress());

		System.out.println("**********************************************************************");

		VipCustomer sangita = new VipCustomer("Sangita", 200000, "sangita.basutkar@gmail.com");
		System.out.println(sangita.getCustomerName());
		System.out.println(sangita.getCreditLimit());
		System.out.println(sangita.getEmailAddress());
	}
}
