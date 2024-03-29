package corejava;

public class VariablesInJava {

	public static void main(String[] args) {
		//variables
		
		/*
		 * VariablesInJava student=new VariablesInJava(); student.sid=10;
		 * student.Sname="vignesh"; student.grad='a';
		 * student.printStudentData();
		 * 
		 * 
		 * student.setStudentData(20, "aarav", 'c'); student.printStudentData();
		 */
		
		
		/*
		 * Method: 
		 * 1) Method name can be anything
		 *  2) Method may or may not return a value 
		 *  3) If method is not returnign any value then specify void 
		 *  4) Method can take parameters/arguments
		 *   5) We have to invoke/call methods explicitely through object 6) used for specifyinglogic 
		 * Constructor 
		 *1) Constructor name should be same as class name.
		 * 2) Constructor will never return a value (not even void) 
		 * 3) We dont  specify the void 
		 * 4) Constructor can take parameters/arguments 
		 * 5) Constructor automatically invoked at the time of object creation. 
		 * 6)used for initilizing the values of the variables.
		 */

		VariablesInJava student=new VariablesInJava(10,"gajalakshmi",'c');
		student.printStudentData();
	}
	
	
	int sid;
	String Sname;
	char grad;

	//ex-1 directly assign by using object reference variable
	void printStudentData() {
		
		
		System.out.println(sid+"  "+Sname+"   "+grad+"    ");
	}
	
	//ex-2 using method local variable to class variable
	
	void setStudentData(int id,String name,char grade)
	
	{
		
		sid=id;
		Sname=name;
		grad=grade;
		
		
			
		}
	
	//ex-3 using constructor // we  cant write any logic and no return
	//we can only initilize the value
			VariablesInJava(int id,String name,char grade){
				sid=id;
				Sname=name;
				grad=grade;
			}
			
	//Contructor
	/*
	 * 1.default constructor 
	 * 2.paramterized construtor
	 */
	}

	
	
	