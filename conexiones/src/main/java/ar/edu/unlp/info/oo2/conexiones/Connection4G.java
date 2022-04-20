package ar.edu.unlp.info.oo2.conexiones;

public class Connection4G {
	private String symb;
	
	public String symb() {
		return this.symb;
	}

	public String transmit(String data, long crc) {
		return "Sending data through 4G....";
	}
	
	
	
}
