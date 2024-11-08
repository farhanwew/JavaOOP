package id.its.pbo.art;

public class StudioSeniProgram {

	public static void main(String[] args) {
		StudioSeni studio = new StudioSeni();
        studio.tambahKaryaSeni(new Lukisan("Lukisan batu"));
        studio.tambahKaryaSeni(new Patung("patung  gajah"));
        
        System.out.println(studio.tampilkanSemuaKarya());
		
	}

}
