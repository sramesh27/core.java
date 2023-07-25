package in.saranyaramesh.demo_project.interfacefiles;
import in.saranyaramesh.demo_project.model.*;

public interface UserInterface extends Base<User> {

	public abstract User findByEmail(String email);
	public abstract int count();
	
}
