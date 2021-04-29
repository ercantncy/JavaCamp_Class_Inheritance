
public class InstructorManager extends UserManager {
	
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" added.");
	}
	
	public void giveLecture(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" gave the Lecture: "+instructor.getGivenLecture());
		
		
	}
	
	

}
