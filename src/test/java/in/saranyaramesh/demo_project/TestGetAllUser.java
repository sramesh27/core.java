package in.saranyaramesh.demo_project;

import in.saranyaramesh.demo_project.model.User;
import in.saranyaramesh.demo_project.service.UserService;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class TestGetAllUser {
@Test
	public void getAllUser() {
		
		UserService userList = new UserService();
		Set<User> arr = userList.getAll();
		System.out.println(arr);
	}
}