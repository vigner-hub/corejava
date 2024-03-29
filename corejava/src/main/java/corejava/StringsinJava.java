package corejava;

import java.util.Arrays;

public class StringsinJava {

	public static void main(String[] args) {
		
		//String s="welcome"
		//String s = new String("Vignesh");
		//Sysout(s);
		
		//1.length()- returns length of a string(number of characters)

		
		String s ="wecome";
		s.length();
		System.out.println(s.length());
		System.out.println("welcome".length());
		
		//2.concat() -joining strings
		// we cant concate same variable because it is Immutable
		String s1="wecome";
		String s2="to java";
		String s3="automation";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2)); //concat method only  joins 2 strings
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2)+s3);
		System.out.println(s1.concat(s2+s3));
		System.out.println("welcome".concat("to my youtube channel"));
		 
		//3.trim()// remove space right and left
		
		
		String t ="   welcome    ";
		System.out.println(t);
		System.out.println(t.length());
		System.out.println(t.trim().length());
		
		//4.charAt()- returns a character from a string based on index
		
		s="welcome";
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(5));
		 
		//5.contains()-return a boolean value(true or false)// we should maintain sequence like wel,come ,me	
		System.out.println(s.contains("wel")); //true
		System.out.println(s.contains("Wel")); //false
		System.out.println(s.contains("come")); //true
		System.out.println(s.contains("welme")); //false
		
		
		//5.equals() ,equalsIgnoreCase()---compoare Strings
		String e1="welcome";
		String e2="welcome";
		System.out.println(e1==e2);//true
		System.out.println(e1.equals(e2));//true
		System.out.println(e1.equalsIgnoreCase("Welcome")); //true
		
		
		//6.replace()  replace single /multiple of char
		
		
		s="Selenium with Java Full Crash Course Series Selenium";
		System.out.println(s.replace('e', 'X'));
		System.out.println(s.replace("selenium", "Gaja"));
		
		
		//7.substring(); extract substring from the mainstring
		//starting index-0
		//ending index-1
		String sub= "welcome";
		System.out.println(sub.substring(0, 4));
		
		
		//8.toUpperCase() toLowerCase()
		
		String migrate="wecome";
		System.out.println(migrate.toUpperCase());
		System.out.println(migrate.toLowerCase());
		
		
		//9.split();
		//return array
		 String Spliting="gaja@gmail.com";
		 String a[] =Spliting.split("@");
		 System.out.println(a[0]); //gaja
		 System.out.println(a[1]); //@gmail.com
		 System.out.println(Arrays.toString(a)); //[gaja, gmail.com]
		 
		 
		 //ex1
		 String amount="$15,20,44,76";
		 
		 System.out.println(amount.replace("$", ""));
		 System.out.println(amount.replace("$", "").replace("," ,""));
		 
		 //ex2
		 String cash="abc,123,@xyz";
		 String arr[]=cash.split(",");	
		 System.out.println(Arrays.toString(arr));
		 
		 String arr1[]=cash.split("@");	
		 System.out.println(Arrays.toString(arr1));
		 
		 
		 //ex3
		 String vig= "abc 123";
		 String arr4[]=vig.split(" ");
		 System.out.println(Arrays.toString(arr4));//[abc,123]
		 
		 //* % ^ & ( )--you cant use as delimeter
		 
		 //ex4
		 String aarav="John kenedy";
		 
		 System.out.println(aarav.toLowerCase().contains("john"));
		 
		 

		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
