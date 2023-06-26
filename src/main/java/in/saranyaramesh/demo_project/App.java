package in.saranyaramesh.demo_project;

import in.saranyaramesh.demo_project.service.UserService;

public class App {

	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.create();
		userService.getAll();	
	}
}
