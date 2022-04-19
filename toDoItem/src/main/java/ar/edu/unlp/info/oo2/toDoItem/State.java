package ar.edu.unlp.info.oo2.toDoItem;

public abstract class State {
	
	public void start(ToDoItem item) {};
	
	public void togglePause(ToDoItem item) {};
	
	public void finish(ToDoItem item) {};

}
