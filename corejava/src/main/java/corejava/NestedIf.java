package corejava;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //ex1
		if (false) {
			if (true) {
				System.out.println("abc");
			} else {
				System.out.println("bcd");
			}
		} else {
			System.out.println("123");
		}
		

//ex2 switch ase
		int num=5;
		switch(num) {
			case 1: System.out.println("sunday");	break;
			case 2: System.out.println("sunday");	break;
			case 3: System.out.println("sunday");	break;
			case 4: System.out.println("sunday");	break;
			case 5: System.out.println("hgwshjghjfdghjdghdjgv");	break;
			case 6: System.out.println("sunday");	break;
			case 7: System.out.println("sunday");	break;
			default:System.out.println("invaild weekday");
		 
		
		}
		
		
		
	}

}
