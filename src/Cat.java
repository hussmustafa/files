
public class Cat extends Animal // this is inheritance 
{
	
	// this is class , i made it to help me to solve problem quicker  
	String colorCat;
	// Encapsulation
	// its mean that there a private things not any one can see it
	//just from seters and getters 
	private String name ;
	private int Age ;
	
	public Cat() {
		
	}


	// this is constructor 
	public Cat(String colorCat) {
		super();
		this.colorCat = colorCat;
	}
	
	
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getColorCat() {
		return colorCat;
	}
	
    

	public void setColorCat(String colorCat) {
		this.colorCat = colorCat;
	}
	
	
	//Polymorphism 
	@Override
	 public void sound(){
	      System.out.println("Meow");   
	   }
	

}
