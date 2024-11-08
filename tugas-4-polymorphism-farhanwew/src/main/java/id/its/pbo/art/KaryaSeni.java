package id.its.pbo.art;

public abstract class KaryaSeni {
	
	private String nama;
	
	public KaryaSeni(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public abstract String deskripsi();
	public abstract String tampilkan();
	
	
}
