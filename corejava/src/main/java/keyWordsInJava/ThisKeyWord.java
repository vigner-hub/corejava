package keyWordsInJava;

public class ThisKeyWord {
	//this keyowrd- this keyword represents clss/object
	// to represent the differance between class variable and local variables
	
	
	//instance variable or class variable
 int a;
 int b;
	public static void main(String[] args) {
		
		
		ThisKeyWord key=new ThisKeyWord(10,20);
		key.display();
		
		
	}

	ThisKeyWord(int a ,int b)//local variable
	{
		this.a=a;
		this.b=b;
		
	}
	
	void display() {
		
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
}
