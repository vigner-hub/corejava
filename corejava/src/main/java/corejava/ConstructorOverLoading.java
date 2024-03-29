package corejava;

public class ConstructorOverLoading {

	
	double width,height,length;
	
	public static void main(String[] args) {
		//cons is used to store data 
		//default construct means no peramaters
		//user defined constructors means paramterized constructor
		//constructor overloading
		
		ConstructorOverLoading vol=new ConstructorOverLoading();
		double a=vol.volume();
         System.out.println(a);
		ConstructorOverLoading volu=new ConstructorOverLoading(10.5,20.4,30.5);
		System.out.println(volu.volume());
		ConstructorOverLoading gaj=new ConstructorOverLoading(10.5);
		gaj.volume();
		System.out.println(gaj.volume());
		
	}
	ConstructorOverLoading(){
		
		width=height=length=0;
		
	}
	
	
ConstructorOverLoading( double w,double h, double l){
	
		
		width=w;
		height=h;
		length=l;
		
		
	}

ConstructorOverLoading(double len){
	
	width=height=length=len;
	
}


double volume()
{
	return(width*height*length);
	
	
	
}

}
