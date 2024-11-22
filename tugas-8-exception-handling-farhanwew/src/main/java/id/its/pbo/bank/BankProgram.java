package id.its.pbo.bank;


public class BankProgram {

	public static void main(String[] args) throws AkunTidakDitemukanException {
        Bank bank = new Bank();
        AkunBank akun = new AkunBank("12345", 5000);
        bank.tambahAkun(akun);
        
        try {
            bank.cariAkun("123456");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
