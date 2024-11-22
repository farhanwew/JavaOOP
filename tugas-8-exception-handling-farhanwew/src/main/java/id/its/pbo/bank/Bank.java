package id.its.pbo.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<AkunBank> daftarAkun;
	
	public Bank() {
		this.daftarAkun = new ArrayList<AkunBank>();
	}
	
	public void tambahAkun(AkunBank akun) {
		this.daftarAkun.add(akun);
	}
	
	public AkunBank cariAkun(String nomorAkun) throws AkunTidakDitemukanException {
		for (AkunBank akun: daftarAkun) {
			if (akun.getNomorAkun().equals(nomorAkun)) {
				return akun;
			}
		}
		throw new AkunTidakDitemukanException();
	}
}
