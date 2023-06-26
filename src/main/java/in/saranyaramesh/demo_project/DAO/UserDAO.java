package in.saranyaramesh.demo_project.DAO;

import in.saranyaramesh.demo_project.model.User;

public class UserDAO {

	public User[] findAll(){
		User[] userList = UserList.listOfUser;
		return userList;
	}
	
	public void create() {
		User newUser = new User();
		newUser.setId(12);
		newUser.setEmail("Saran@gmail.com");
		newUser.setFirstName("Saranya");
		newUser.setLastName("Ramesh");
		newUser.setPassword("1234567456");
		newUser.setActive(true);
		
		UserList.listOfUser[0] = newUser;
	}
	
	
	
}
