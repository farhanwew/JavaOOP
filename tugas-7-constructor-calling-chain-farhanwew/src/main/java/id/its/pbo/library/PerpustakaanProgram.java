package id.its.pbo.library;

import id.its.pbo.library.Anggota;
import id.its.pbo.library.Buku;
import id.its.pbo.library.Perpustakaan;

public class PerpustakaanProgram {
	public static void main(String[] args) {
		Perpustakaan perpustakaan = new Perpustakaan();
		Anggota anggota1 = new Anggota("Alice", "A001");
		Anggota anggota2 = new Anggota("Bagas", "A002");
		Anggota anggota = new Anggota("Bob", "Jl. Merdeka No. 1", "B002");
		
		System.out.println(anggota.getInfoAnggota());
		perpustakaan.tambahAnggota(anggota1);
		perpustakaan.tambahAnggota(anggota2);
		
		Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 1997);
        perpustakaan.tambahBuku(buku1);
        
        perpustakaan.pinjamBuku(anggota1, buku1);
        
        System.out.println("daftar anggota perpustakaan:");
        for (int i = 0; i < perpustakaan.getDaftarAnggota().size(); i++) {
            System.out.println(perpustakaan.getDaftarAnggota().get(i).getNama());
        }
        
        
	}

}


