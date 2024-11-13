package id.its.pbo.transaction;

public class TransaksiProgram {

	public static void main(String[] args) {
		Transaksi trans1 = new Transaksi(12.3);
		Transaksi trans2 = new Transaksi(13.4);
		
		System.out.println(Transaksi.getTotalTransaksi());
		System.out.println(trans1.getTransaksiID());
		System.out.println(trans2.getTransaksiID());
	}

}
