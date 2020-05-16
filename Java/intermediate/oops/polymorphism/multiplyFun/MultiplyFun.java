package oops.polymorphism.multiplyFun;

//Java program for Method overloading 

public class MultiplyFun {

	// Method with 2 parameter

	static int Multiply(int a, int b) {
		return a * b;
	}

	// Method with the same name but 2 double parameter

	static double Multiply(double a, double b) {
		return a * b;
	}

	public static void main(String args[]) { // No objects are created because methods are static. When methods are static we dont need to create object.
		System.out.println(MultiplyFun.Multiply(4, 5));
		System.out.println(MultiplyFun.Multiply(10.23, 32.10));

	}

}
