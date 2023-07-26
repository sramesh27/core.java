package in.saranyaramesh.demo_project.service;

import in.saranyaramesh.demo_project.model.*;

import java.util.*;

import in.saranyaramesh.demo_project.DAO.*;
import in.saranyaramesh.demo_project.validation.*;

public class UserService {
//	private UserDAO userDao;

//	public UserService() {
//		this.userDao = new UserDAO(); // Initialize userDao instance in the constructor
//	}

	public Set<User> getAll() {
		UserDAO userDao = new UserDAO();
		Set<User> userList = userDao.findAll();
		Iterator<User> iterator = userList.iterator();
		//int count = 0;
		while (iterator.hasNext()) {
			User user = iterator.next();
			System.out.println(user);
			//System.out.println(count++);
		}
		return userList;
	}

	
	public void create(User newUser) throws Exception {
		
		UserValidator.validate(newUser);
		
		UserDAO userDao = new UserDAO();
		
		userDao.create(newUser);
	}

	public void update(int id, User newUpdate) throws Exception {
		UserValidator.validate(newUpdate);
		
		UserDAO userDAO = new UserDAO();
		userDAO.update(1, newUpdate);
	}
//
//	public void delete(int id) {
//		UserDAO userDao = new UserDAO();
//		userDao.delete();
//	}
	
	public User findById(int id) {
		
		UserDAO userDao = new UserDAO();
		User user = userDao.findById(id);
		return user;
		
	}
	
}