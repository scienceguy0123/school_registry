package school_registry;

public abstract class Person {

	private String name;
	private String gender;
	private int age;
	
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public String myType() {
		return "Person";
	}
	
	public abstract void eyeColor();
}
