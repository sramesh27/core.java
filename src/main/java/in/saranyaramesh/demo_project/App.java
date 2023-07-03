package in.saranyaramesh.demo_project;

import in.saranyaramesh.demo_project.model.User;
import in.saranyaramesh.demo_project.service.UserService;

public class App {

	public static void main(String[] args) {
		UserService userService;
		User newUser1;
		try {
			userService = new UserService();
			
			User newUser = new User();
			newUser.setId(12);
			newUser.setEmail("Saran@gmail.com");
			newUser.setFirstName("Saranya");
			newUser.setLastName("Ramesh");
			newUser.setPassword("1234567456");
			newUser.setActive(true);
			
			newUser1 = new User();
			newUser1.setId(15);
			newUser1.setEmail("Saranya@gmail.com");
			newUser1.setFirstName("Saran");
			newUser1.setLastName("Ramesh.");
			newUser1.setPassword("9876543212");
			newUser1.setActive(true);
			
//		User updateUser = new User();
//		updateUser.setId(14);
//		updateUser.setEmail("Saranya@gmail.com");
//		updateUser.setFirstName("Saran");
//		updateUser.setLastName("Ramesh.");
//		updateUser.setPassword("9876543212");
//		updateUser.setActive(true);
			
			
			userService.create(newUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//userService.create1(newUser1);
//		userService.update(updateUser);
		//userService.getAll();	
	}
}
