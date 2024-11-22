package id.its.pbo.medical;

public class DataTidakValidException  extends Exception{
		public DataTidakValidException() {
			super("Pemeriksaan Gagal: Data yang dimasukkan tidak valid.");
		}
}
