package in.saranyaramesh.demo_project.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class TaskEntity implements Comparable<TaskEntity>{

	int id;
	String task_name;
	String dueDate;
	boolean is_active;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTaskName() {
		return task_name;
	}
	
	public void setTaskName(String taskName) {
		this.task_name = taskName;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public boolean isActive() {
		return is_active;
	}
	
	public void setActive(boolean isActive) {
		this.is_active = isActive;
	}
	
	@Override
	public int compareTo(TaskEntity t) {
		
		if(this.id==t.getId()) {
			return 0;
		}
		else {
			if (this.id>getId()) {
				return 1;
			} else {
				return -1;
			}
			
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Task [id = " + id + ", task_name = " + task_name + ", dueDate = " + dueDate + ", is_active = " + is_active + "]";
	}

}