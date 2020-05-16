package oops.polymorphism.runtimePoly;

public class TestPoly {
		public static void main(String[] args) 
		{ 

			Parent a; 

			a = new subclass1(); 
			a.Print(); 

			a = new subclass2(); 
			a.Print(); 
		} 
	} 

