package id.its.pbo.perusahaan;

public class Karyawan {
	private String nama;
	private String id;
	
	public Karyawan(String nama, String id) {
		this.nama = nama;
		this.id = id;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}
