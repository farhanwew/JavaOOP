package id.its.pbo.shops;

public class ElectricityProvider {
	public static String supplyPower(Electrifiable barang) {
		return barang.powerOn();
	}
}
