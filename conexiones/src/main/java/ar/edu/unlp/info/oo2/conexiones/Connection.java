package ar.edu.unlp.info.oo2.conexiones;

public interface Connection {
	
	public String sendData(String data, long crc);
	
	public String pict();

}
