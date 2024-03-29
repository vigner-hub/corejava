package corejava;

public class MethodsInJava {

	public static void main(String[] args) {
	   // method is  group fo statments which will perform certain task.
		
		//we have to call the methods though object
		/*
		 * 1.No parameters -no retrun value 
		 * 2.no parameter -retrn value 
		 * 3.takesparameter - no retrun value
		 *  4.takes paramters -retun value
		 */
		
		
		MethodsInJava obj1=new MethodsInJava();
		obj1.m1();
		
		String aarav=obj1.m2();
		System.out.println(aarav);
		
		obj1.m3("john","gaja","dabba");
		String gaj=obj1.m4("gaja");
		System.out.println(gaj);
		

		 }

	// 1.No parameter --No value
	void m1()
	{
		System.out.println("hello....");
	}
	
	
	//2.No paramter --Retrun values
	
	String m2()
	
	{
		return("hello how are you ");
		
		
	}
	
	//3.Takes paramters -- no return value
	 void m3(String aarav, String gaja,String vignesh)
	 {
		 System.out.println("hello"+aarav+gaja+vignesh);
		 
		 
	 }	
	 
	 
	 //4.takes paramters -retun value
	 
	 String  m4(String name)
	 {
		 
		 return("hello"+name);
	 }
	 
}


