package corejava;

import java.util.Arrays;

class First{ 
	static  int gaja=100;

	static  void firstmethod( ) {


		String Spliting="gaja@gmail.com";
		String a[] =Spliting.split("@");
		System.out.println(a[0]); //gaja
		System.out.println(a[1]); //@gmail.com
		System.out.println(Arrays.toString(a)); //[gaja, gmail.com]
		
		
		
		String vig= "Quote: Aarav is a good boy";
		String arr[]=vig.split(":");
		System.out.println(arr[1]); 
		System.out.println(	arr[1].substring(0, 6));
		System.out.println(Arrays.toString(arr));
	}
}

public class Dummy{

	public static void main(String[] args) {

		First.firstmethod();	
	}



}







