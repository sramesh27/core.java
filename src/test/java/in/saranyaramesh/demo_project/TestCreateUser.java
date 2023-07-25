package in.saranyaramesh.demo_project;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.saranyaramesh.demo_project.exception.ValidationException;
import in.saranyaramesh.demo_project.model.User;
import in.saranyaramesh.demo_project.service.UserService;

public class TestCreateUser {
	
	@Test
	public void testCreateUserWithValidInput() {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(12);
		newUser.setEmail("Saran@gmail.com");
		newUser.setFirstname("Saranya");
		newUser.setFirstname("Ramesh");
		newUser.setPassword("1234567456");
		newUser.setActive(true);
		
		assertDoesNotThrow(() ->{
			userService.create(newUser);
		});
		
	}
	
	@Test
	public void testCreateUserWithInvalidInput() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class, () ->{
			userService.create(null);
		});
		String expectedMessage = "Invalid input";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	
		@Test
		public void testCreateUserWithEmailNull() {
			
			UserService userService = new UserService();
			
			User newUser = new User();
			newUser.setId(12);
			newUser.setEmail(null);
			newUser.setFirstname("Saranya");
			newUser.setFirstname("Ramesh");
			newUser.setPassword("1234567456");
			newUser.setActive(true);
			newUser.toString();
			
		
				Exception exception = assertThrows(ValidationException.class, () ->{
			userService.create(newUser);
		});
		String expectedMessage = "email Invalid input";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithEmailEmpty() {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(12);
		newUser.setEmail("");
		newUser.setFirstname("Saranya");
		newUser.setFirstname("Ramesh");
		newUser.setPassword("1234567456");
		newUser.setActive(true);
		newUser.toString();
		
			Exception exception = assertThrows(ValidationException.class, () ->{
				userService.create(newUser);
	});
	String expectedMessage = "email Invalid input";
	String actualMessage = exception.getMessage();
	assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithPasswordEmpty() {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(12);
		newUser.setEmail("saranya@gmail.com");
		newUser.setFirstname("Saranya");
		newUser.setFirstname("Ramesh");
		newUser.setPassword("");
		newUser.setActive(true);
		newUser.toString();
		
		Exception exception = assertThrows(ValidationException.class, () ->{
			userService.create(newUser);
	});
	String expectedMessage = "password Invalid input";
	String actualMessage = exception.getMessage();
	assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test	
	public void testCreateUserWithPasswordNull() {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(12);
		newUser.setEmail("saranya@gmail.com");
		newUser.setFirstname("Saranya");
		newUser.setFirstname("Ramesh");
		newUser.setPassword(null);
		newUser.setActive(true);
		newUser.toString();
		
		Exception exception = assertThrows(ValidationException.class, () ->{
			userService.create(newUser);
	});
	String expectedMessage = "password Invalid input";
	String actualMessage = exception.getMessage();
	assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test	
	public void testCreateUserWithFirstNameNull() {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(12);
		newUser.setEmail("saranya@gmail.com");
		newUser.setFirstname(null);
		newUser.setFirstname("Ramesh");
		newUser.setPassword("123456757");
		newUser.setActive(true);
		newUser.toString();
		
		Exception exception = assertThrows(ValidationException.class, () ->{
			userService.create(newUser);
	});
	String expectedMessage = "FirstName Invalid input";
	String actualMessage = exception.getMessage();
	assertTrue(expectedMessage.equals(actualMessage));
	}
	
	@Test	
	public void testCreateUserWithFirstNameEmpty() {
		
		UserService userService = new UserService();
		
		User newUser = new User();
		newUser.setId(12);
		newUser.setEmail("saranya@gmail.com");
		newUser.setFirstname("");
		newUser.setLastname("Ramesh");
		newUser.setPassword("123456757");
		newUser.setActive(true);
		newUser.toString();
		
		Exception exception = assertThrows(ValidationException.class, () ->{
			userService.create(newUser);
	});
	String expectedMessage = "FirstName Invalid input";
	String actualMessage = exception.getMessage();
	assertTrue(expectedMessage.equals(actualMessage));
	}
	 
}
	

