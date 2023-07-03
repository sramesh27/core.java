package in.saranyaramesh.demo_project.validation;

import in.saranyaramesh.demo_project.model.User;

public class UserValidator {
	
	public static void validate(User user) throws Exception {
		
		if (user == null) {
			throw new Exception("Invalid user Input");
		}
		if(user.getEmail() == null || "".equals(user.getEmail().trim())) {
			throw new Exception("Email cannot be null or empty");
		}
		if(user.getPassword() == null || "".equals(user.getPassword().trim())) {
			throw new Exception("Password cannot be null or empty");
		}
		if(user.getFirstName() == null || "".equals(user.getFirstName().trim())) {
			throw new Exception("Firstname cannot be null or empty");
		}
	}
}
