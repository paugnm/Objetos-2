package ar.edu.unlp.info.oo2.toDoItem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private State state;
	private List<String> comments;
	private LocalDateTime inicio;
	private LocalDateTime fin;

	/**
	 * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	 */
	public ToDoItem(String name) {
		this.name = name;
		this.inicio = null;
		this.fin = null;
		this.comments = new ArrayList<String>();
		this.state = new PendingState();
	}

	/**
	 * Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
	 * pending, si se encuentra en otro estado, no hace nada)
	 */
	public void start() {
		state.start(this);
	}

	/**
	 * Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
	 * estado es paused. Caso contrario (pending o finished) genera un error
	 * informando la causa específica del mismo
	 */
	public void togglePause() {
		state.togglePause(this);
	}

	/**
	 * Pasa el ToDoItem a finished (siempre y cuando su estado actual sea
	 * in-progress o pausada, si se encuentra en otro estado, no hace nada)
	 */
	public void finish() {
		state.finish(this);
	}

	/**
	 * Retorna el tiempo que transcurrió desde que se inició la tarea (start) hasta
	 * que se finalizó. En caso de que no esté finalizada, el tiempo que haya
	 * transcurrido hasta el momento actual. Si la tarea no se inició, genera un
	 * error informando la causa específica del mismo.
	 */
	public Duration workedTime() {
		if (this.inicio == null) {
			throw new RuntimeException("El objeto ToDoItem no ha iniciado la tarea todavía");
		}
		
		if (this.fin != null) {
			return Duration.between(inicio, fin);
		}		
		return Duration.between(inicio, LocalDateTime.now());
	}

	/**
	 * Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
	 * contrario no hace nada."
	 */
	public void addComment(String comment) {
		if (this.fin == null) this.comments.add(comment);
	}	
	
	public void setState (State state) {
		this.state = state;
	}
	
	public void setInicio (LocalDateTime inicio) {
		this.inicio = inicio;
	}
	

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	
}
