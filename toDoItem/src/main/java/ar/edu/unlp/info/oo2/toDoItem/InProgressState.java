package ar.edu.unlp.info.oo2.toDoItem;

public class InProgressState extends State {

	@Override
	public void togglePause(ToDoItem item) {
		item.setState(new PausedState());
	}

	@Override
	public void finish(ToDoItem item) {
		item.setState(new FinishedState(item));
	}

}
