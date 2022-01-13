package school_registry;

public class Test {
	
	public static void main(String[] args) {
		

		
		Teacher teacher = new Teacher();
		
		teacher.setName("Audrey");
		teacher.setAge(22);
		teacher.setGender("Female");
		teacher.setSalary(1000);
		
		System.out.println(teacher.getName() + " " + teacher.getAge() +
				" " + teacher.getGender() + " " + teacher.getSalary()
				+ " " + teacher.myType());
		
		Student student = new Student();
		
		student.setName("Andy");
		student.setAge(22);
		student.setGender("Male");
		student.setGrade(5);
		
		System.out.println(student.getName() + " " + student.getAge() +
				" " + student.getGender() + " " + student.getGrade() + " "
				+ student.myType());
		 
		
		teacher.eyeColor();
		student.eyeColor();
		teacher.pantsColor();
	}
}
