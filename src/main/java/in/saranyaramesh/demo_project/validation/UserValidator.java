package in.saranyaramesh.demo_project.validation;

import in.saranyaramesh.demo_project.exception.ValidationException;
import in.saranyaramesh.demo_project.model.User;
import in.saranyaramesh.demo_project.util.StringUtil;

public class UserValidator {
	
	public static void validate(User user) throws ValidationException {
		
		if (user == null) {
			throw new ValidationException("Invalid user Input");
		}
		StringUtil.rejectIfInvalidString(user.getEmail(),"email");
		StringUtil.rejectIfInvalidString(user.getPassword(),"password");
		StringUtil.rejectIfInvalidString(user.getFirstName(),"firstName");
		
//		if(user.getEmail() == null || "".equals(user.getEmail().trim())) {
//			throw new ValidationException("Email cannot be null or empty");
//		}
//		if(user.getPassword() == null || "".equals(user.getPassword().trim())) {
//			throw new ValidationException("Password cannot be null or empty");
//		}
//		if(user.getFirstName() == null || "".equals(user.getFirstName().trim())) {
//			throw new ValidationException("Firstname cannot be null or empty");
//		}
		
	}
}
