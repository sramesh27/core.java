package in.saranyaramesh.demo_project;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.*;
import org.junit.jupiter.api.Test;

import in.saranyaramesh.demo_project.exception.ValidationException;
import in.saranyaramesh.demo_project.model.User;
import in.saranyaramesh.demo_project.service.*;

public class TestGetAllUser {
	
	@Test
	public void getAllUsers() {
		UserService userService = new UserService();
		Set<User> userList = userService.getAll();
		System.out.println(userList);
	}

	@Test
	public void getById() {
		UserService userService = new UserService();
		User userList = userService.findById(1);
		System.out.println(userList);
	}
	
	@Test
	public void testUpdateUser() throws Exception {
	
		UserService userService = new UserService();
		
		User updateUser = new User();
		
		updateUser.setFirstname("");
		updateUser.setLastname("Boopathi Kannan");
		
	//	userService.update(1, updateUser);
		
		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.update(1, updateUser);
		});
		String expectedMessage = "FirstName cannot be null or empty";
		String actualMessage = exception.getMessage();
	
		assertTrue(expectedMessage.equals(actualMessage));		
	}
}