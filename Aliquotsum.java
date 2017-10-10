package Sum;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as Sum

public class Aliquotsum {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		int number = 25;  
		// here i have take an integer type of variable to check weather it is perfect number or not 
		 long aliquotsum = findAliquotsum(number);   
		 //here declaring a long data type which is of 8bytes and inserting argument in the method
		
		System.out.println("Aliquot Sum of " + aliquotsum + " is " + aliquotsum + ".");
		//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is output.
		if(aliquotsum == number){          
			//if aliquotSum equals to number then it prints if condition otherwise it prints else statement
			System.out.println(number + " is a perfect number.");//systemm is used to return code
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			//hence it prints the is a perfect number text
		}else{
			System.out.println(number + " is not a perfect number.");
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			//hence it prints the is a perfect number text
		}
		
        
		System.out.println("Perfect Numbers between 1 to 150 are: ");   
		   //here we are initializing the number between 1 to 150
		for(int i=1; i<=150; i++){
			number = i; 
			//taking number equal to i
			if(findAliquotsum(i) == number){    
				//  it checks the perfect numbers from 1 to 150
				System.out.print(number + " ");
			}
		}
	
	}
	public static long findAliquotsum(int n) {
		int show = 0; 
		// here we have taken integer data type of variable show 

		for (byte i = 1; i <= (n / 2); i++) {  
			//here it checks the condition of a number and adds the sum of divisors   
			if (n % i == 0) {
				//i equal to zero declaring in if loop
				show += i;
				//show plus equal to i
			}
		}
		return show;
		//returning 
	}





	}
