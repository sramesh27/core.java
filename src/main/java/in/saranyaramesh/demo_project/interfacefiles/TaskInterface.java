package in.saranyaramesh.demo_project.interfacefiles;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import in.saranyaramesh.demo_project.model.Task;

public interface TaskInterface extends Base<Task> {

	public static Set<Task> listOfTasks = new HashSet<Task>();
}
