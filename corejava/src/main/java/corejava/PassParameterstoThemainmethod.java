package corejava;

public class PassParameterstoThemainmethod {

	public static void main(String args[] ) {
		
		System.out.println(args.length);
		for (String value:args)
		{
			
			System.out.print(value);
		}
	
       System.out.println("testing........");
	}

}
