package ar.edu.unlp.info.oo2.toDoItem;

import java.time.Duration;

public class FinishedState extends State {

	@Override
	public void start(ToDoItem item) {
		// TODO Auto-generated method stub

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
		return item.calcularDuracion();
	}
	
	@Override
	public void addComment(ToDoItem item, String comment) {
	}

}
