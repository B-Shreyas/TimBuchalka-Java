package oops.encapsulation.printer;

public class PrinterManager {

	public static void main(String[] args) {
		
		Printer printer = new Printer(50, true);
		System.out.println("Initial page count " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(5);
		System.out.println("pages printed was " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println("pages printed was " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
	}
	

}
