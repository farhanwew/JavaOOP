package id.its.pbo.course;

public class Peserta {
	private String nama;
	private int usia;
	private String tingkatPendidikan;
	
	public Peserta(String nama, int usia, String tingkatPendidikan) {
		this.nama = nama;
		this.usia = usia;
		this.tingkatPendidikan = tingkatPendidikan;
	}
	
	public int getUsia() {
		return usia;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void cekKelayakan() throws UsiaTidakMemenuhiSyaratException, PendidikanTidakMemenuhiSyaratException{
		if (this.usia < 18) {
			throw new UsiaTidakMemenuhiSyaratException();
		}
		
		if (this.tingkatPendidikan != "Sarjana" && this.tingkatPendidikan != "Magister") {
			throw new PendidikanTidakMemenuhiSyaratException();
		}
	}
}

