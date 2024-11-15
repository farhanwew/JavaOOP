package id.its.pbo.library;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
	private List<Buku> daftarBuku;
	private List<Anggota> daftarAnggota;
	
	public Perpustakaan() {
		this.daftarAnggota = new ArrayList<Anggota>();
		this.daftarBuku = new ArrayList<Buku>();
	}
	
	public void tambahBuku(Buku buku) {
		daftarBuku.add(buku);
	}
	
	public void tambahAnggota(Anggota anggota) {
		daftarAnggota.add(anggota);
	}
	
	public void pinjamBuku(Anggota anggota, Buku buku) {
		buku.tambahPeminjam(anggota);
	}
	
	public List<Anggota> getDaftarAnggota() {
		return daftarAnggota;
	}
	
	public List<Buku> getDaftarBuku() {
		return daftarBuku;
	}
}
