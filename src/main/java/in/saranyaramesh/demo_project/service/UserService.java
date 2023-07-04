package in.saranyaramesh.demo_project.service;

import in.saranyaramesh.demo_project.DAO.UserDAO;
import in.saranyaramesh.demo_project.model.User;
import in.saranyaramesh.demo_project.validation.UserValidator;

public class UserService {

	public User[] getAll() {
		UserDAO userDao = new UserDAO(); 
		User[] userList =  userDao.findAll(); 
		for (int i=0; i<userList.length; i++) {
			System.out.println(userList[i]);
		}
		return userList;
	}
	public void create(User newUser) throws Exception {
		UserValidator.validate(newUser);
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}
	public void create1(User newUser1) {
		
		UserDAO userDao1 = new UserDAO();
		userDao1.create(newUser1);
	}
//	public void update(User updateUser) {
//		
//		UserDAO userDAO2 = new UserDAO();
//		userDAO2.update(updateUser);
//	}
}






