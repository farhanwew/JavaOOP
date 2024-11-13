package id.its.pbo.shops;

public class TokoBarangProgram {

	public static void main(String[] args) {
		KipasAngin kipas = new KipasAngin("semsung");
		Televisi tv = new Televisi("LG");
		
		System.out.println(ElectricityProvider.supplyPower(tv));
		System.out.println(ElectricityProvider.supplyPower(kipas));
	}

}
