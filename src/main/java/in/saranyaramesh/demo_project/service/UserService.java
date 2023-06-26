package in.saranyaramesh.demo_project.service;

import in.saranyaramesh.demo_project.DAO.UserDAO;
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
	
}
