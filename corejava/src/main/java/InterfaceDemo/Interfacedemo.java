package InterfaceDemo;

interface shape{
	
	int length=10; //final & static
	int len=20;    //final and static
	
	default void square(int a ,int b)     //default method
	{
		
		System.out.println(a+"This is default method"+b);
	}
	
	void circle();                         //abstract method
	
	static void rectangle()                // static method
	{
		
		System.out.println("This is static method");
	}

}

public class Interfacedemo implements shape {
	
	
	int name=10;
	
	/*
	 * interface
	 *  1) An interface is a blue print of class. 
	 *  2) Interface contains final & Static variables. 
	 *  3) Interface contains abstract methods.( also allowed default methods & Static methods from java8 onwards) 
	 *  4) Anbstract method is a method contains signature but not body(Un-implemented method). 
	 *  5) Methods in interface are public. 
	 *  6) Interface supports the functionality of multiple inheritance.
	 *   7) We can define interface with interface keyword. 
	 *   8) A class extends another class, an interface extends another interface but a class implements an interface. 
	 *   9) We can create Object reference for Interface but we cannot instantiate interface.
	 */
	public  void circle()  // we have to set public here
    {
    	System.out.println("this is crcle abstract methos");
    }
	
	
	void triangle() {
		
		System.out.println("vignesh");
	}
	
	
	public static void main(String[] args) {
		
		//scanrio-1 object and variable also same type of interface
		Interfacedemo inter=new Interfacedemo();
		inter.circle();        //abstract
		inter.square(10, 20);  //deafult
		shape.rectangle();   //static method can directly access from interface
		inter.triangle();
		System.out.println(inter.name);
		
		
		//scenario-2 here object created for interface and variable created for class
		shape cls=new Interfacedemo();
		cls.circle();        //abstract
		cls.square(10, 20);  //deafult
		shape.rectangle();   //static method can directly access from interface
		
		//inter.triangle(); we cannot access
		
		System.out.println(shape.len*shape.len);//accessing static variables directly
		
		//System.out.println(cls.name); //we cant access because this variable belongs to interface
		
		
		
	
		
		
		
		
		
		
}

}
