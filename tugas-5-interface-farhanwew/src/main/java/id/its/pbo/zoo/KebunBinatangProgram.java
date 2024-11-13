package id.its.pbo.zoo;

public class KebunBinatangProgram {

	public static void main(String[] args) {
        KebunBinatang kebunBinatang = new KebunBinatang();

     
        kebunBinatang.tambahHewan(new Singa("Singa"));
        kebunBinatang.tambahHewan(new Kuda("Kuda"));
        kebunBinatang.tambahHewan(new Ular("Monyet"));

      
        kebunBinatang.tampilkanHewanBersuara();
   
	}

}
