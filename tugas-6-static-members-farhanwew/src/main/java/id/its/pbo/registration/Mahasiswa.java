package id.its.pbo.registration;

public class Mahasiswa {
	private static int registrantCounter = 0;
	private int nomorPendaftaran;
	private String nama;
	
	public Mahasiswa(String nama) {
		registrantCounter++;
		this.nama = nama;
		this.nomorPendaftaran = registrantCounter;
	}
	
	public int getNomorPendaftaran() {
		return nomorPendaftaran;
	}
	
	public static int getTotalRegistrant() {
		return registrantCounter;
	}
	
	public static void resetRegistrantCounter() {
		registrantCounter = 0;
	}
}
