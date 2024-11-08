package id.its.pbo.art;

import java.util.ArrayList;
import java.util.List;

public class StudioSeni {
	List<KaryaSeni> daftarKaryaSeni;
	
	public StudioSeni() {
		this.daftarKaryaSeni = new ArrayList<KaryaSeni>();
	}
	
	public void tambahKaryaSeni(KaryaSeni karyaSeni) {
		this.daftarKaryaSeni.add(karyaSeni);
	}
	
	public List<String> tampilkanSemuaKarya() {
		List<String> tampilanKaryaList = new ArrayList<String>();
		
		 for (KaryaSeni karyaSeni: this.daftarKaryaSeni) {
			 tampilanKaryaList.add(karyaSeni.tampilkan());
		 }
		 return tampilanKaryaList;
	}
}
