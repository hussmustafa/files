import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Animal implements Animall {
	
	// inner class
		static class Dog{
			int age ;
			String name ;
		}
		
		/*Animall one=()->{ lamda
			
		}
	*/	
		Animall a = new Animall() { //Anonymous Class
			
			@Override
			public void move() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	//Composition ************
			// it using declere object in class from a another class 
			Scanner sc = new Scanner(System.in); // an example to Composition 
			//Cat c2 = new Cat();
			
			
			

	public static void main(String[] args) {
		
		// inner class use :
		Dog d = new Dog();
		d.age=10;
		
		//Primitive & non-Primitive Types****************************
		int a =1 ; // this is Primitive type
		Cat c = new Cat() ;// this is non-Primitive type
		
		//Casting in Java *****************************

		double b = 5;
		
		int v = (a+(int)b); // cast from double to intger 
		System.out.println(v);
		
		//Operators & Operands *****************************8
		//Operators is the : + , - , * , /
		//Operands is the num using Operators like a+b the Operands is a , b , and the Operators is + ;
		int test = a+v; // example
		
		//Abbreviating Operators **************
		// its opratin in Operands like : a++ , --a , a=a+1 , a*=10 ....
		 a++ ; // example
		
		//Logical Operators*******************
		// this Operators is like (a>b) , (a!=b) , (a>b && b=0) , and , or , biger than .... 
		if(a>b) {
			// example
		}
		 
		//Operator Precedence******************************
		// this called also  Priorities 
		// the Strongest is (...)  ,any thing in parentheses  have the Priorities so it will excite  first,
		// then if we have multiply and division , this more strong than addition  and substation ,
		// if we have tow equals Precedence , then we start from left to right 
		
		// example a+b(c/b+2) ..
		
		
		
		// Arrays ****************
		int [] array = new int [13]; // array have 13 element 
		
		//Java Collections ***************************
		
		String [] one = {"cat", "dog" , "chicken "};
		List <String> tow = new ArrayList<String>();
		for(String i: one) {
			tow.add(i);
		}
		
		//Autoboxing 
		// that mean is convert primitive type to wrapper type 
		// like :
		int num = 10 ;
		Integer test1 = Integer.valueOf(num);
		
		//Unboxing is The opposite
		// that mean is convert from wrapper type to primitive type 
		// like :
		
		Integer test2 = new Integer(10);
		int num2 = test2.intValue();
		
		// Parallel Array Sort feature
		int [] array2 = {9,5,6,2,3,8};
		Arrays.parallelSort(array2);
		// array now sorted 
		for(int i :array2) {
			System.out.println(i+"");
		}
		
		
		//StringJoiner : this is good because it's mutable 
		
		String [] str = {"one", "tow", "three"};
		StringJoiner sj = new StringJoiner(",","{","}");
		sj.setEmptyValue("no data");
		for(String strs : str) {
			sj.add(strs);

		}
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		
		

		
		

	}
	
	// Polymorphism  
	 public void sound(){
	      System.out.println("This is Animal Sound !!");   
	   }

	@Override  // SafeVarags Annotator
	public void eat() {
		System.out.println("i eat meat");
	}

	@Override  // SafeVarags Annotator
	public void move() {
		System.out.println(" i move use 4 legs ");
		
	}

}
