package id.its.pbo.music;

public class StudioMusikProgram {

	public static void main(String[] args) {
		  StudioMusik studio = new StudioMusik();
		  studio.tambahInstrumen(new Gitar("Gitar wew"));
		  studio.tambahInstrumen(new Piano("Piano keren"));
		  
		  System.out.println(studio.mainkanInstrumen());
	}

}
