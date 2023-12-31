package in.saranyaramesh.demo_project.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

import in.saranyaramesh.demo_project.exception.ValidationException;
import in.saranyaramesh.demo_project.model.Task;
import in.saranyaramesh.demo_project.util.StringUtil;

public class TaskValidator {

		public static void validate(Task task) throws ValidationException {

			if (task == null) {
				throw new ValidationException("Invalid task input");
			}


			StringUtil.rejectIfInvalidString(task.getTaskName(), "TaskName");


			StringUtil.rejectIfInvalidString(task.getDueDate(), "DueDate");
			
			////////  validate date   /////////
			
			String date = task.getDueDate();
			
			DateTimeFormatter formatpat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			
			LocalDate formatedDate = LocalDate.parse(date, formatpat);
			
			LocalDate.parse(date,
                    DateTimeFormatter.ofPattern("dd.MM.uuuu").withResolverStyle(ResolverStyle.STRICT)
            );
			
			
	
			LocalDate todayDate = LocalDate.now();
			
			if(todayDate.equals(date) || formatedDate.isBefore(todayDate)) {
				
				throw new ValidationException("Invalid date or invalid date format(dd.mm.yyyy)");
				
			}
			
			
		}

	}
