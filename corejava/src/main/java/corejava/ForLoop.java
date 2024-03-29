package corejava;

public class ForLoop {

	public static void main(String[] args) {

		// for For loop we write  intit and condtion and incrementation in  single line and 
		//it will reduce the code
		//for(intilization;condition;inc/dec){
		//statment
		//}
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		for (int j=2;j<=10;j=j+2) {
			System.out.println(j);
		}
		
		for (int m=1;m<=10;m++)
			if(m%2==0) {
				System.out.println(m+ "even");
				break;
			}
			else
			{
				System.out.println(m+"odd");
				break;
			}
	}

}
