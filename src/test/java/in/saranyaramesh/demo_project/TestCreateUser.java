package in.saranyaramesh.demo_project;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.saranyaramesh.demo_project.model.User;
import in.saranyaramesh.demo_project.service.UserService;

public class TestCreateUser {
	
	@Test
	public void testCreateUserWithValidInput() {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(12);
		newUser.setEmail("Saran@gmail.com");
		newUser.setFirstName("Saranya");
		newUser.setLastName("Ramesh");
		newUser.setPassword("1234567456");
		newUser.setActive(true);
		
		assertDoesNotThrow(() ->{
			userService.create(newUser);
		});
		
	}
	
	@Test
	public void testCreateUserWithInvalidInput() {
		UserService userService = new UserService();
		Exception exception = assertThrows(Exception.class, () ->{
			userService.create(null);
		});
		String expectedMessage = "Invalid user Input";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	
		@Test
		public void testCreateUserWithEmailNull() {
			
			UserService userService = new UserService();
			
			User newUser = new User();
			newUser.setId(12);
			newUser.setEmail("");
			newUser.setFirstName("Saranya");
			newUser.setLastName("Ramesh");
			newUser.setPassword("1234567456");
			newUser.setActive(true);
			newUser.toString();
			
		
				Exception exception = assertThrows(Exception.class, () ->{
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	
	
}
