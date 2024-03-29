package corejava;

public class StringInJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// String  is immutable
		String s="welcome";
		s.concat("to java");
		System.out.println(s);
		
		
		
		// StringBuffer is mutable
		
		StringBuffer s1 = new StringBuffer("welcome");
		s1.append("to chennai");
		System.out.println(s1);
		
		
		// String builder  is mutable
		
		StringBuilder s2=new StringBuilder("wecome");
		s2.append("to chennai");
		System.out.println(s2);

     
		
		
	}

}
