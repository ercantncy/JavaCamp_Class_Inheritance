

public class UserManager {

	

	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" added.");
	}
	
	public void addMultiple(User[] user)
	{
		for (User user2 : user) {
			
			add(user2);
		}
		
		
	}
	
	
	
	
}
