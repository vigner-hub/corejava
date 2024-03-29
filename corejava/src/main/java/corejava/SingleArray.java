package corejava;

public class SingleArray {

	public static void main(String[] args) {
		/*
		 Array is collection of elements of same data types(homegenious)
		 we can store multiple values into a single variable
		 */
		/*
		 * 1.declare an arrray 
		 * 2.add values into array 
		 * 3.find size of an array
		 * 4.read single value from an array 
		 * 5.read multiple values from an
		 * array
		 */
		/*
		 //approach 1
		int a[]=new int[10];
		a[0]=200;
		a[1]=300;
		a[2]=400;
		System.out.println(a[0]);
	*/
		
		//approach 2
		int a[]= {100,200,300,400,500,600,700};
		System.out.println(a[2]);
		
		//find length of an array
        System.out.println("length of an array is :"+a.length);
        
        //ready data from an array
        System.out.println(a[4]); // here 4 is in dex
        for(int i=0; i<a.length-1; i++) // combinations/i<=4  i<5  i<a.length-1 i<a.lenght
       System.out.println(a[i]);
        {
        	
        	//2. enchanched for loop .....for each loop
        	
        	int b[]= {100,200,300,400,500,600,700};
        	for(int x:b)
        	{
        		System.out.println(x);
        		
        	}
        	
        	
        	
        	
        	
        	
        	
        }
        
        
        
}
	}
