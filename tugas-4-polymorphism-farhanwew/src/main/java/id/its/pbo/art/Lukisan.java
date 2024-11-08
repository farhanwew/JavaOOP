package id.its.pbo.art;

public class Lukisan extends KaryaSeni {

	public Lukisan(String nama) {
		super(nama);
	}

	@Override
	public String deskripsi() {
		return "Sebuah gambar yang dilukis di atas kanvas";
	}

	@Override
	public String tampilkan() {
		return "Digantung di dinding";
	}

}
