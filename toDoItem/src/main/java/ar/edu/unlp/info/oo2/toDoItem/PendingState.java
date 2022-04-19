package ar.edu.unlp.info.oo2.toDoItem;

import java.time.LocalDateTime;

public class PendingState extends State {

	@Override
	public void start(ToDoItem item) {
		item.setState(new InProgressState());
		item.setInicio(LocalDateTime.now());
	}

}
