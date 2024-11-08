package id.its.pbo.zoo;

public class KebunBinatangProgram {
	public static void main(String[] args) {
		Kucing miawKucing = new Kucing("Hiro");
		
		System.out.println(miawKucing.getNama() + miawKucing.buatSuara());
		
		Anjing anjing1 = new Anjing("Hido");
		
		System.out.println(anjing1.getNama() + anjing1.buatSuara());
	}

}
