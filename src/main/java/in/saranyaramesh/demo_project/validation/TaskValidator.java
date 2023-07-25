package in.saranyaramesh.demo_project.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import in.saranyaramesh.demo_project.exception.ValidationException;
import in.saranyaramesh.demo_project.model.Task;
import in.saranyaramesh.demo_project.util.StringUtil;

public class TaskValidator {
	public static void validate (Task task) throws ValidationException {
	if (task == null) {
        throw new ValidationException("Invalid Task Input");
    }
    StringUtil.rejectIfInvalidString(task.getName(), "Name");
    StringUtil.rejectIfInvalidString(task.getDuedate(), "DueDate");
    
    String date = task.getDuedate();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dueDate = LocalDate.parse(date, formatter);
    LocalDate currentDate = LocalDate.now();
	if(dueDate.equals(currentDate) || dueDate.isBefore(currentDate)) {
		throw new ValidationException("Due date should be in future");
	}
	
//	public static void validate (Task task) throws ValidationException {
//		if (task == null) {
//			throw new ValidationException(" Invalid user Input");
//		}
//		StringUtil.rejectIfInvalidString(task.getName(), "Name");
//		StringUtil.rejectIfInvalidString(task.getDuedate(), "duedate");
		//StringUtil.rejectIfInvalidString(task.getId(), "Id");
		
	}
}
