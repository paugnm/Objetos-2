package ar.edu.unlp.info.oo2.toDoItem;

public class PausedState extends State {


	@Override
	public void togglePause(ToDoItem item) {
		item.setState(new InProgressState());
	}

	@Override
	public void finish(ToDoItem item) {
		item.setState(new FinishedState(item));
	}
	

}
