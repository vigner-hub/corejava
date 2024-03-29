package corejava;

public class Stringcomparision {

	public static void main(String[] args) {
		//== :comapre the objects
		//equals :  compare values of objects
		
		String s1="welcome";
		String s2="welcome";
		 //case1
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		//case 2
		String a1= new String ("wecome");
		String a2=new String("wecome");
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1==a2); //false to compare the objects
		System.out.println(a1.equals(a2));//true to compare values of objects
		
		//case 3
		String b1="abc";
		String b2=new String("abc");
		
		System.out.println(b1==b2); //false
		System.out.println(b1.equals(b2)); //true 
		
		vignesh:
		
		//case 4
		String c1="abc";
		String c2= new String("abc");
		String c3=c2;
		
		System.out.println(c1==c2);  //false
		System.out.println(c1.equals(c2));//true
		
		
		
		System.out.println(c2==c3);//true//same object assigned
		System.out.println(c2.equals(c3));//true
		
		
		System.out.println(c1==c3);//false
		System.out.println(c1.equals(c3));//true
		
	
	}
	
	

}
