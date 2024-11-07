package id.its.pbo.store;

public class TokoBukuProgram {

	public static void main(String[] args) {
		TokoBuku toko1 = new TokoBuku();
		Buku buku1 = new Buku("111111", "The Maze runner", 900000);
		toko1.tambahBuku(buku1);
		System.out.println(toko1.getDaftarBuku());
	}

}
