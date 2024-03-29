package corejava;

public class OopsPolymorphism {
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		// one thing can have many forms
		// shape--circle,square,triangle
		// we can achive polymorphism using overloading...
		// method overloading ..we can create multiple method with same name

		/*
		 * 4 rules are applicable 1) Method names should be same 2) number of
		 * parameters should be different 3) Data type of parameters should be
		 * different\ 4) Order of parameters should be different
		 */

		OopsPolymorphism adder = new OopsPolymorphism();
		adder.sum(20, 30);
		adder.sum(60, 5.99);
		adder.sum();
	}

	public void sum() // 1
	{
		System.out.println(a + b);

	}

	void sum(int a, int b) {
		System.out.println(a + b);

	}
	void sum(int a, double b) // 3
	{
		System.out.println(a - b);

	}
	void sum(int a, int b, double c) // 4
	{
		System.out.println("a+b+c");

	}

}
