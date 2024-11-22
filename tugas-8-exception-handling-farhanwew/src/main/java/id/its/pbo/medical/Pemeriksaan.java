package id.its.pbo.medical;

public class Pemeriksaan {
	
	public void periksaData(Pasien pasien) throws Exception {
		try {
			pasien.validasiData();
		} catch (Exception e) {
			throw e;
		}
	}
}
