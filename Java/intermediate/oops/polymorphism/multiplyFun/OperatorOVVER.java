package oops.polymorphism.multiplyFun;

public class OperatorOVVER {
	
	void operator(String str1, String str2) {
		String s = str1 + str2;
		System.out.println("Concatenated string => " + s);
	}
	
	void operator(int a, int b) {
		int c = a + b;
		System.out.println("Sum => " + c);
	}
	
	public static void main(String args[]) {
		
		OperatorOVVER opr = new OperatorOVVER();
		opr.operator("Hello", "World");
		opr.operator(10, 20);
	}

}
