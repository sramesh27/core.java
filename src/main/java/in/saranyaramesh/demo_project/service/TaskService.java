package in.saranyaramesh.demo_project.service;

import in.saranyaramesh.demo_project.DAO.TaskDAO;
import in.saranyaramesh.demo_project.model.Task;
import in.saranyaramesh.demo_project.validation.TaskValidator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
public class TaskService {

	public void create(Task newTask) throws Exception {
		TaskValidator.validate(newTask);

		TaskDAO taskObj = new TaskDAO();
		taskObj.create(newTask);
	}
	
	public LocalDate convertDate(String dueDate) {
		
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				LocalDate currDate = LocalDate.parse(dueDate , formatter);
				return currDate;
		} catch (Exception e) {
			e.printStackTrace();
		}
			return null;
	}
	
	public Set<Task> getAll() {
		TaskDAO taskObj = new TaskDAO();
		Set<Task> taskArray = taskObj.findAll();
		return taskArray;
	}
}

