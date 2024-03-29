package corejava;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//intit,condition,statment ,increment
		
		
		//Whileloop
		//-------------
		//Intilization;
		//while(condition);
		//{statments;
		//inc/dec;
		//}
		
		
		//conditions verifys and statement will exexcute
		
		//ex-1
		
		int i =10; //intitilation
		while(i>=1) {
			
			System.out.println(i);
			i--;
		}
		//ex-2

		int m=1; //intitilation
		while(m>=1) {
			
			System.out.println(m);
			m++;
		}
		
		
		//ex-3
		
		int j=1;
		while(j<=10) {
			
			if(j%2==0) {
				System.out.println("this is even number:"+j);
				
			}
			else {
				System.out.println("this is odd number:"+j);
			}
			j++;
		}
	}

}
