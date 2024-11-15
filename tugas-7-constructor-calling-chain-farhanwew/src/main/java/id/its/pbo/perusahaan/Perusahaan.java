package id.its.pbo.perusahaan;

public class Perusahaan {

	public static void main(String[] args) {
		Direktur direktur = new Direktur("arya", "A1", "Teknologi", 20000000.0);
		System.out.println("gaji " + direktur.getNama() + " " + direktur.getGaji());
		
		Manager manager = new Manager("Bimo", "A1", "Teknologi");
		System.out.println("Nama manager: " + manager.getNama());
	}

}
