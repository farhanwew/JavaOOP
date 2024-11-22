package id.its.pbo.bank;

public class AkunBank {
	private String nomorAkun;
	private double saldo;
	
	public AkunBank(String nomorAkun, double saldo) {
		this.nomorAkun = nomorAkun;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getNomorAkun() {
		return nomorAkun;
	}
	
	public void tarik(double jumlah) throws SaldoTidakCukupException, BatasPenarikanException{
		if (jumlah > 100000) {
			throw new BatasPenarikanException();
		}
		
		if (jumlah > this.saldo) {
			throw new SaldoTidakCukupException();
		}
		
		saldo = saldo - jumlah;
	}
	
	
}
