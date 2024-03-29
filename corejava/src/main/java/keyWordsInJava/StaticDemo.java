package keyWordsInJava;



//static methods can access static stuff directly(without object)
//static methods can access non-static stuff through object
//non-static methods can access everything directly

public class StaticDemo {

	// static keyword can be applied for variables and methods
	// static variable
	// static method
	// non static variable
	// non static methods

	// if any data common across multiple object then only you can create a method or variable as "static"
	// these values are different from one object to another object don't use"static"
     
	static int a = 10; // static variable
	int b = 20;        // non static

	static void m1() //static methods
	
	{

		System.out.println("this is static method....");

	}

	void m2()//non static
	{

		System.out.println("this is non ststic method");
	}
	
	void m()//non static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}

	public static void main(String[] args) {

		//static methods can access static stuff directly(without object)
		m1();
		System.out.println(a);
		 
		
		StaticDemo vig=new StaticDemo();
		vig.m2();
		System.out.println(vig.b); //we have to create a object to access non static variable
		vig.m();
		
		//if we want to access non static methods or variables we neeed to create a object

		
		
	
	
	
	}
	

}
