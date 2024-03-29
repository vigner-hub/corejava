package corejava;

public class Constructor {
	
	
	int x,y;
	
	Constructor(){
		
		x=100;
		y=100;
	}
	
	Constructor(int a, int b)
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	
	

	public static void main(String[] args) {
		
		Constructor cons=new Constructor(); //deafult constructor
		Constructor con=new Constructor(200,200);//parameterrized constructor
		con.sum();
		cons.sum();
		
	}

}
