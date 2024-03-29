package corejava;

public class EncapsulationInJava {
	private int accno;
	private String name;
	private double amount;
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}

	 //wrapping up of data and methos in single unit(class)
		//getter and setter
			
		/*
		1.all variables shoud be private
		2.for every variable there should be 2 methods(get&set)
		3.variables can be operated only through methods*/

	public static void main(String[] args) {
	
			EncapsulationInJava acc=new EncapsulationInJava();
			acc.setAccountNo(0);
			System.out.println(acc.getaccountno());
			
	}
	
		
		
	void setAccountNo(int accno)
	{
		
		this.accno=accno;
		
		
	}
	
	
	int getaccountno()
	{
		
		return accno;
		
		
	}
	
	

}
