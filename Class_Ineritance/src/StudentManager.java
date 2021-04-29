

public class StudentManager  extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" added.");
	}
	
	public void addLecture(Student student) {
		
		System.out.println(student.getFirstName()+" "+student.getLastName()+" took the Lecture: "+ student.getTakenLecture());
		
		
	}
	
	
	
}
