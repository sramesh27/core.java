package in.saranyaramesh.demo_project.DAO;

import in.saranyaramesh.demo_project.model.User;

public class UserDAO {

	public User[] findAll(){
		User[] userList = UserList.listOfUser;
		return userList;
	}
	
	/**
	 * 
	 * @param newUser
	 */
	public void create(User newUser) {
		//UserList.listOfUser[0] = newUser;
		User[] arr = UserList.listOfUser;
		
		for(int i=0; i<arr.length; i++) {
			User user = arr[i];
			if(user == null) {
				arr[i]=newUser;
				break;
			}
		}
	}
	/**
	 * 
	 * @param newUser1
	 */
	public void create1(User newUser1) {
		User[] userList = UserList.listOfUser;
		for(int i=0; i<userList.length; i++) {
			User user = userList[i];
			if(user == null) {
				userList[i]=newUser1;
				break;
			}
		}
		
	}

	public void update(int Id, User updateUser) {
	User[] userList = UserList.listOfUser;
	
	for(int i=0; i<userList.length; i++) {
		User user = userList[i];
		if(user == null) {continue;}
		if(user.getId()==Id) {
			userList[i].setFirstName(updateUser.getFirstName());
			userList[i].setFirstName(updateUser.getLastName());
			break;
		}
	}
}
	public void delete(int userId) {
	User[] userList = UserList.listOfUser;
	for(int i=0; i<userList.length; i++) {
		User user = userList[i];
		if(user == null) {
			continue;
		}
		if(user.getId()==userId) {
			user.setActive(false);
			break;
		}
	
	}
}
	public User findById(int userId) {
		User[] userList = UserList.listOfUser;
		User usermatch = null;
		
		for(int i=0; i<userList.length; i++) {
			User user = userList[i];
			
			if(user == null) {
				continue;
			}
			if(user.getId()==userId) {
				usermatch = user;
				break;
			}
		}
		return usermatch;
		
	}
}
