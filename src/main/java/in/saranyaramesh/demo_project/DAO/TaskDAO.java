package in.saranyaramesh.demo_project.DAO;

import in.saranyaramesh.demo_project.model.Task;

public class TaskDAO {

	public Task[] findAll(){
		Task[] taskList = TaskList.listOfTask;
		return taskList;
	}
	
	public void create(Task newTask) {
		//UserList.listOfUser[0] = newUser;
		Task[] arr = TaskList.listOfTask;
		
		for(int i=0; i<arr.length; i++) {
			Task task = arr[i];
			if(task == null) {
				arr[i]=newTask;
				break;
			}
		}
	}
	public void update(int Id, Task updateTask) {
	Task[] taskList = TaskList.listOfTask;
	
	for(int i=0; i<taskList.length; i++) {
		Task task = taskList[i];
		if(task == null) {continue;}
		if(task.getId()==Id) {
			taskList[i].setName(updateTask.getName());
			
			break;
		}
	}
}
	public void delete(int taskId) {
	Task[] taskList = TaskList.listOfTask;
	for(int i=0; i<taskList.length; i++) {
		Task task = taskList[i];
		if(task == null) {
			continue;
		}
		if(task.getId()==taskId) {
			task.setActive(false);
			break;
		}
	
	}
}
	public Task findById(int taskId) {
		Task[] taskList = TaskList.listOfTask;
		Task taskmatch = null;
		
		for(int i=0; i<taskList.length; i++) {
			Task task = taskList[i];
			
			if(task == null) {
				continue;
			}
			if(task.getId()==taskId) {
				taskmatch = task;
				break;
			}
		}
		return taskmatch;
		
	}
}
