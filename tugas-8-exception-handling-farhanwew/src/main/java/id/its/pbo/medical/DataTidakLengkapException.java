package id.its.pbo.medical;

public class DataTidakLengkapException extends Exception{
	 public DataTidakLengkapException() {
		super("Pemeriksaan Gagal: Data pasien tidak lengkap.");
	}

}
