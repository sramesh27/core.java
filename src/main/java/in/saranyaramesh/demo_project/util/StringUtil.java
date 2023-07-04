package in.saranyaramesh.demo_project.util;

import in.saranyaramesh.demo_project.exception.ValidationException;

public class StringUtil {
	
	public static void rejectIfInvalidString(String input, String inputName) throws ValidationException {
		
		if(input == null || "".equals(input.trim())) {
			throw new ValidationException(inputName.concat(" Invalid input"));
		}
	}
	
	public static boolean isValid(String input) {
		if(input == null || "".equals(input)) {
			return false;
		}else {
			return true;
		}
	}
	public static boolean isInValid(String input) {
		if(input == null || "".equals(input)) {
			return false;
		}else {
			return true;
		}
	}
	
}
