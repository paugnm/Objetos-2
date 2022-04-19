package ar.edu.unlp.info.oo2.toDoItem;

import java.time.Duration;

public abstract class State {
	
	public abstract void start(ToDoItem item);
	
	public abstract void togglePause(ToDoItem item);
	
	public abstract void finish(ToDoItem item);

	public abstract Duration workedTime(ToDoItem item);

	public abstract void addComment(ToDoItem item, String comment);



}
