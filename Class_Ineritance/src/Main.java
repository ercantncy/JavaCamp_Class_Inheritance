
public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Ercan");
		student.setLastName("Tuncay");
		student.setTakenLecture("Java & React BootCamp");
		
		Instructor instructor=new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setGivenLecture("Java - React BootCamp");
		
		
		User[] users= {student,instructor};
		
		UserManager userManager=new UserManager();
		userManager.addMultiple(users);
		System.out.println();
		
		StudentManager studentManager=new StudentManager();
		studentManager.addLecture(student);
		
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.giveLecture(instructor);

	}

}
