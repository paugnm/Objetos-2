package ar.edu.unlp.info.oo2.conexiones;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CrcCalculator {
	private CRC32 crc;
	
	public CRC32_Calculator() {
		this.crc = new CRC32();
	}

	@Override
	public long crcFor(String data) {
		crc.update(data.getBytes());
		long result = crc.getValue();
		return result;
	}

}
