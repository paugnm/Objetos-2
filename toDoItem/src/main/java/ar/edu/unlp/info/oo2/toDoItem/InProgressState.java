package ar.edu.unlp.info.oo2.toDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgressState extends State {

	@Override
	public void start(ToDoItem item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void togglePause(ToDoItem item) {
		item.setState(new PausedState());
	}

	@Override
	public void finish(ToDoItem item) {
		item.setState(new FinishedState());
		item.setFin(LocalDateTime.now());
	}

	@Override
	public Duration workedTime(ToDoItem item) {
		return item.calcularDuracion();		
	}
	
	@Override
	public void addComment(ToDoItem item, String comment) {
		item.setComment(comment);		
	}


}
