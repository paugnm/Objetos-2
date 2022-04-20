package ar.edu.unlp.info.oo2.conexiones;

public class WifiConn implements Connection {
	
	private String pict;

	@Override
	public String sendData(String data, long crc) {
		return "Sending data through WiFi...";
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
