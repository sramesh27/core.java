package in.saranyaramesh.demo_project.service;

import in.saranyaramesh.demo_project.DAO.UserDAO;
//import in.saranyaramesh.demo_project.DAO.UserList;
import in.saranyaramesh.demo_project.model.User;

public class UserService {

	public User[] getAll() {
		UserDAO userDao = new UserDAO(); 
		User[] userList =  userDao.findAll(); 
		for (int i=0; i<userList.length; i++) {
			System.out.println(userList[i]);
		}
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
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}
	
}






