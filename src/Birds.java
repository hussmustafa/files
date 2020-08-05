// abstract class
public abstract class Birds {
	
	String name ;
	String type;
	int age ;
	
	
	public Birds() {
		
	}
	
	public Birds(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}

	abstract void eat() ;
	

}
