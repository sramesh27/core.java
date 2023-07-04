package in.saranyaramesh.demo_project.service;

import in.saranyaramesh.demo_project.DAO.TaskDAO;
import in.saranyaramesh.demo_project.model.Task;
import in.saranyaramesh.demo_project.validation.TaskValidator;


public class TaskService {

	public Task[] getAll() {
		
		TaskDAO taskDAO = new TaskDAO();
		Task[] taskList = taskDAO.findAll();
		for (int i=0; i<taskList.length; i++) {
			System.out.println(taskList[i]);
		}
		return taskList;
	}
	
	public void create(Task newTask) throws Exception {
		TaskValidator.validate(newTask);
		TaskDAO taskDAO = new TaskDAO();
		taskDAO.create(newTask);
	}
	
	public void update(Task newTask) throws Exception {
		TaskValidator.validate(newTask);
		TaskDAO taskDAO = new TaskDAO();
		taskDAO.update(1,newTask);
	}
	
	public void delete(Task newTask) throws Exception{
		TaskValidator.validate(newTask);
		TaskDAO taskDAO = new TaskDAO();
		taskDAO.delete(2);
	}
	
	public Task findById(int taskId) {
		TaskDAO taskDAO = new TaskDAO();
		Task task = taskDAO.findById(1);
		return task;
	}
	
	
	
	}

