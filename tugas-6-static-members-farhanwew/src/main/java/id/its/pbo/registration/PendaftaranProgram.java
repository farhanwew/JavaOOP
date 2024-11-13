package id.its.pbo.registration;

public class PendaftaranProgram {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa("Farhan");
		Mahasiswa mhs2= new Mahasiswa("Arya");
		Mahasiswa mhs3 = new Mahasiswa("Wicaksono");
		
		System.out.println("Jumlah mahasiswa sekarang:" + Mahasiswa.getTotalRegistrant());
		System.out.println("Reset jumlah mahasiswa");
		
		Mahasiswa.resetRegistrantCounter();
		
		System.out.println("jumlah mahasiswa sekarang:" + Mahasiswa.getTotalRegistrant());
	}

}
