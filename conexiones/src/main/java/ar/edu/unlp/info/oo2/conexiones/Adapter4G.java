package ar.edu.unlp.info.oo2.conexiones;

public class Adapter4G implements Connection {
	
	private Connection4G adaptee;

	@Override
	public String sendData(String data, long crc) {
		return adaptee.transmit(data,crc);
	}

	@Override
	public String pict() {
		return adaptee.symb();
	}

}
