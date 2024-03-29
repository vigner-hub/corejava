package corejava;

public class DataTypes {

	public static void main(String[] args) {
		
		//int a; //declaration
		//a=100; // assignment
	final int a=100; //declaration+assignment
	final int b=200;
	System.out.println("the value of a and b is :"+(a+b));
	System.out.println("the value of a is :"+a);
	System.out.println("the value of a is :"+b);	
	byte m=125;
	System.out.println(m);
	short n=3535;
	System.out.println(n);
	long l=525725727l;
	System.out.println(l);
	float f=87286836.626F;
	System.out.println(f);
	double d=67368346.38;
	System.out.println(d);
	String name ="vignesh";
	boolean gaja=true;
	
	   //1]arthematic operators + - * / %
		int t=10,c=20;
		
		System.out.println("sum of a  and b is:"+(t+c));
		System.out.println("diff of a  and b is:"+(t-c));
		System.out.println("mul of a  and b is:"+(t*c));
		System.out.println("div of a  and b is:"+(t/c));
		System.out.println("coshent of a  and b is:"+(t%c));
		System.out.println("sum of a  and b is:"+(t+c));
		
		//2]Relational /comparision operators > >= < <= != ==
		
		System.out.println(t>c);
		System.out.println(t<c);
		System.out.println(t>=c);
		System.out.println(t<=c);
		System.out.println(t>c);
		System.out.println(t!=c);
		System.out.println(t==c);
		boolean res =a>b;
		System.out.println(res);

		//3] Logical operators && || !
		// returns boolean value - true/false
		// works between 2 boolean values
		
		boolean x=true;
		boolean y=true;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		boolean b1 =10>10;
		System.out.println(b1);
		boolean b2 =20>10;
		System.out.println(b2);
		System.out.println(b1&&b2);
		System.out.println(b1||b2);
		System.out.println(x&&y);
		// combination of relational and logical operators
		System.out.println(10<20|| 34>20);
		System.out.println(10<20 && 34>20);
		
		//4] increment & Decrement operators ++ --
		//case1
		int g=10;
		System.out.println(g);
		
		g++;//g=g+1;
		System.out.println(a);
		
		//case 2 post increment
		int q=10;
		int gaj=q++;
		int gaj=q--;
		System.out.println(res);
		System.out.println(q);
		
		//case 2 post increment
				int q=10;
				int gaj=++q;
				int gaj=--q;
				System.out.println(res);
				System.out.println(q);
	
				
		//5]assignment operators = += -= *= /= %=
				//ex-1
				int w=10;
				w=w+5;
				w=w-5;
				w+=10;
				w-=20;
				
				System.out.println(w);
				
				//ex-2

				w*=19;
				w=w*19;
				
				//ex-3
				
				w/=19;
				w=w/19;
				
				
				//6]conditional and ternary operators ? :
				//ex1:
				int e=100, r=200;
				int z=(e>r)? e:r;
				System.out.println(x);
				//ex2
				int e=100, r=200;
				int z=(e==r)? e:r;
				System.out.println(x);
				
				//ex3
				int e=100, r=200;
				int z=(e==r)? eligible:notelebible;
				System.out.println(x);
				
				
				
				
				
				
				
		
	}

}
