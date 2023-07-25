package in.saranyaramesh.demo_project.DAO;

import in.saranyaramesh.demo_project.model.*;
import in.saranyaramesh.demo_project.interfacefiles.TaskInterface;
import java.time.LocalDate;
import java.util.Set;

public class TaskDAO {

	// FIND ALL METHOD

		public Set<Task> findAll() {	
			Set<Task> taskList = TaskList.listOfTasks;
			
			return taskList;
		}
		
		//   CREATE TASK
		
		
		public void create(Task newTask) {
					
			Set<Task> taskList = TaskList.listOfTasks;

			taskList.add((Task)newTask);
		}
		
		// UPDATE TASK
		
//		public void update(int id, Task updateTask) {
//			
//			Set<Task> taskList = TaskList.listOfTasks;
//			
//			for(int i=0; i<taskList.length; i++) {
//				
//				Task task = taskList[i];
//				
//				if(task==null) {
//					continue;
//				}
//				if(task.getId()==id) {
//				
//					task.setTaskName(updateTask.getTaskName());
//					task.setDueDate(updateTask.getDueDate());
//					break;
//					
//				}
//				
//			}
//			
//		}
	//	
//		//  DELETE TASK
	//	
//		public void delete(int id) {
//			
//			Task taskList = TaskList.listOfTasks;
//			
//			for(int i=0; i<taskList.length; i++) {
//				
//				Task task = taskList[i];
//				
//				if(task==null) {
//					continue;
//				}
//				
//				if(task.getId()==id) {
//					task.setActive(false);
//					break;
//				}
//			}
//		} 
	//	
//		//  FIND BY ID
	//	
//		public Task findById(int id) {
//			Task taskList = TaskList.listOfTasks;
//			Task taskMatch = null;
	//	
//			for (int i = 0; i < taskList.length; i++) {
//				Task task = taskList[i];
//				if (task.getId() == id) {
//					taskMatch = task;
//					break;
//				}
//			}
//			return taskMatch;
//		}
}
