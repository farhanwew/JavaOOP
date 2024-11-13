package id.its.pbo.zoo;

import java.util.ArrayList;
import java.util.List;

public class KebunBinatang {
	private List<Hewan> daftarHewan;
	
	public KebunBinatang() {
		this.daftarHewan = new ArrayList<Hewan>();
	}
	
	public void tambahHewan(Hewan hewan) {
		daftarHewan.add(hewan);
	}
	
    public void tampilkanHewanBersuara() {
        for (Hewan hewan : daftarHewan) {
            if (hewan instanceof BisaBersuara) {
                BisaBersuara hewanBersuara = (BisaBersuara) hewan;
                System.out.println(hewan.getNama() + ": " + hewanBersuara.suara());
            }
        }
	}
}
