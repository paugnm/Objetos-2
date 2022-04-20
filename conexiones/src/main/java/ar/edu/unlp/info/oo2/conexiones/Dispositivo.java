package ar.edu.unlp.info.oo2.conexiones;

public class Dispositivo {
	private Ringer ringer;
	private Display display;
	private Connection connection;
	private CrcCalculator crcCalculator;
	
	
	
	public Dispositivo() {
		this.ringer = new Ringer();
		this.display = new Display();
		this.connection = new WifiConn();
		this.crcCalculator = new CRC16_Calculator();
	}

	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public void configurarCRC(CrcCalculator crc) {
		this.crcCalculator = crc;
	}
	
	public void conectarCon(Connection conector) {
		this.connection = conector;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
	}
}
