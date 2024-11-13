package id.its.pbo.transaction;


public class Transaksi {
	private static int counter = 0;
	private int transaksiID;
	private double jumlah;
	
	public Transaksi(Double jumlah) {
		counter++;
		this.jumlah = jumlah;
		this.transaksiID = counter;
	}
	
	public int getTransaksiID() {
		return transaksiID;
	}
	
	public static int getTotalTransaksi() {
		return counter;
	}
	
	public static void resetCounter() {
		counter = 0;
	}
}
