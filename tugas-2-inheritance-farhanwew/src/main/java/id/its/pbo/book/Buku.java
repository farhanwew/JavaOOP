package id.its.pbo.book;

public class Buku {
	
	private String judul;
	private String pengarang;
	
	public Buku(String judul, String pengarang) {
		this.judul = judul;
		this.pengarang = pengarang;
	}
	
	public void setJudul(String judul) {
		this.judul = judul;
	}
	
	public String getJudul() {
		return judul;
	}
	
	public void setPengarang(String pengarang) {
		this.pengarang = pengarang;
	}
	
	public String getPengarang() {
		return pengarang;
	}
}
