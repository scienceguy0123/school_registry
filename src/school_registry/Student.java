package school_registry;

public class Student extends Person {
	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String myType() {
		return "Student";
	}

	@Override
	public void eyeColor() {
		// TODO Auto-generated method stub
		System.out.println("Student eye is brown");
	}
	
}
