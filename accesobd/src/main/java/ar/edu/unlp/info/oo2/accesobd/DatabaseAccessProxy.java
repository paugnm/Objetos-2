package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess {
	private String password;
	private DatabaseRealAccess database;
	private boolean conected;
	
	
	public DatabaseAccessProxy(DatabaseRealAccess database, String password) {
		this.password = password;
		this.database = database;
		this.conected = false;
	}
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (conected) { 
			return this.database.getSearchResults(queryString);
		}		
		throw new RuntimeException("accesso denegado");
	}
	@Override
	public int insertNewRow(List<String> rowData) {
		if (conected) { 
			return this.database.insertNewRow(rowData);
		}		
		throw new RuntimeException("accesso denegado");
	}
	
	
	public boolean login(String password) {
		if (this.password.equals(password)) {
			conected = true;
		} 
		return conected;
	}
	
}
