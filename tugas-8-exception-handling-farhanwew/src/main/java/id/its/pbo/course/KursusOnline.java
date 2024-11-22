package id.its.pbo.course;

import java.util.ArrayList;
import java.util.List;

public class KursusOnline {
	private List<Peserta> daftarPeserta;
	
	public KursusOnline() {
		this.daftarPeserta = new ArrayList<Peserta>();
	}
	
	public void daftarPeserta(Peserta peserta) throws Exception {
		peserta.cekKelayakan();
		
		daftarPeserta.add(peserta);
	}
	
	public List<Peserta> getDaftarPeserta() {
		return daftarPeserta;
	}
	
	
}
