package ar.edu.unlp.info.oo2.toDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class PendingState extends State {

	@Override
	public void start(ToDoItem item) {
		item.setState(new InProgressState());
		item.setInicio(LocalDateTime.now());
	}

	@Override
	public void togglePause(ToDoItem item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void finish(ToDoItem item) {
		// TODO Auto-generated method stub

	}

	@Override
	public Duration workedTime(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no ha iniciado la tarea todavía");
	}

	@Override
	public void addComment(ToDoItem item, String comment) {
		item.setComment(comment);		
	}

}
