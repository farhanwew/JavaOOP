package id.its.pbo.medical;

import java.lang.reflect.UndeclaredThrowableException;

public class Pasien {
	private String nama;
	private int umur;
	private String alamat;
	
	public Pasien(String nama, int umur, String alamat) {
		this.nama = nama;
		this.alamat = alamat;
		this.umur = umur;
	}
	

	public void validasiData() throws Exception {
		if (nama.isBlank()) {
			throw new DataTidakLengkapException();
		}
		
		if (alamat.isBlank()) {
			throw new DataTidakLengkapException();
		}
		
		if (this.umur > 120 || this.umur < 0) {
			throw new DataTidakValidException();
		}
	}
}
