package corejava;

public class ConditionalStatement {

	public static void main(String[] args) {
	     
		
		//conditional statement
		//ex1
		int person_age=50;
		
		
		  if (person_age<=30) {
		  
		  System.out.println("elegible");
		  
		  } else { System.out.println("not elegible"); }
		 
		
		
	   if (person_age>=50)
		System.out.println("gaja");
	   else
		System.out.println("aarav");
	   
	   
	   
	   //ex-2
	   
	    int num =20;
	    
	    if(num%2==0)
	    	
	    	System.out.println("number is even number");
	   
	    	else
	    	
	    		System.out.println("this number is odd number");
	    
	    
	    int number=30;
	    
	    if (number%2==1)
	    	System.out.println("this is odd");
	    else
	    	System.out.println("not odd");
	    		
	    
	   // ex-3
	    
	    int negative=20;
	    if (negative>0)
	    
	    {
	    	System.out.println("negative number");
	    }
	    
	    else if(negative>=30) {
	    	System.out.println("positive");
	    	
	    }
	    
	    else {
	    	System.out.println("Not a number");
	  	    		
	    }
	    
	    
	    //ex-4
	    
	    int a=10, b=20, c=30;
	    
	    
	   /* 
	    * a>b and a>c === a is the lagest number
	   b>a and b>c === b is the lagest  number
	    C>a and c>b ==== c is the lagest number*/
	    
	    
	    if (a>b&&a>c)
	    {
	    	System.out.println(" a is the lagest number");
	    }
	    
	    else if(b>a&&b>c)
	    {
	    	System.out.println("b is the largest number");
	    }
	    
	    else
	    {
	    	System.out.println("c is the largest number:"+c);
	    }
	    
	    
	    if (false)
	    {
	    	System.out.println(1);
	    }
	    else {
	    	System.out.println("gaja");
	    }
	    
	}
}

