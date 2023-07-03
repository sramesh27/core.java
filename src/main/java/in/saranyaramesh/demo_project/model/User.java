package in.saranyaramesh.demo_project.model;

public class User {
		
	String firstName;
	String lastName;
	int id;
	String email;
	String password;
	boolean isActive = true;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", email=" + email
				+ ", password=" + password + ", isActive=" + isActive + "]";
	}

	
	public String fullName() {
		return firstName.concat(" ").concat(lastName);
	}
	
	
	
	
}
