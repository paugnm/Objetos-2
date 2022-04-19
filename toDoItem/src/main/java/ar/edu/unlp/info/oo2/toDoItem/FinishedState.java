package ar.edu.unlp.info.oo2.toDoItem;

import java.time.LocalDateTime;

public class FinishedState extends State {

	public FinishedState(ToDoItem item) {
		item.setFin(LocalDateTime.now());
	}


}
