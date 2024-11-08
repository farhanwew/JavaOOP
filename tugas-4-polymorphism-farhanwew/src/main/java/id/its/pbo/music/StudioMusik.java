package id.its.pbo.music;

import java.util.ArrayList;
import java.util.List;

public class StudioMusik {
	
	List<Instrumen> instrumen;
	
	public StudioMusik() {
		this.instrumen = new ArrayList<Instrumen>();  
	}
	
	public void tambahInstrumen(Instrumen instrumen) {
		this.instrumen.add(instrumen);
	}
	
	public String mainkanInstrumen() {
		String suaraSuara = "";
		for (Instrumen instrumen: this.instrumen) {
			suaraSuara = suaraSuara + instrumen.suara() + " ";
		}
		return suaraSuara.trim();
	}
}
