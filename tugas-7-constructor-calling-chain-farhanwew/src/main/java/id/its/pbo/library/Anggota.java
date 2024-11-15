package id.its.pbo.library;

public class Anggota {
	private String nama;
	private String alamat;
	private String nomorAnggota;
	
	
	public Anggota(String nama, String alamat, String nomorAnggota) {
		this.nama = nama;
		this.nomorAnggota = nomorAnggota;
		this.alamat = alamat;
	}
	
	public Anggota(String nama, String nomorAnggota) {
		this.nama = nama;
		this.nomorAnggota = nomorAnggota;
		this.alamat = "Alamat belum diisi";
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getAlamat() {
		return alamat;
	}
	
	
	public String getNomorAnggota() {
		return nomorAnggota;
	}
	
	
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	
	public void setNomorAnggota(String nomorAnggota) {
		this.nomorAnggota = nomorAnggota;
	}
	
	public String getInfoAnggota() {
		return nama + ", " + alamat + ", "+ nomorAnggota;
	}
}
