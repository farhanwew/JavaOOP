package id.its.pbo.sorting;

public class Buku extends Item implements Sortable {
	private int jumlahHalaman;
	
	public Buku(String nama, int jumlahHalaman) {
		super(nama);
		this.jumlahHalaman = jumlahHalaman;
	}
	
	public int getJumlahHalaman() {
		return jumlahHalaman;
	}
	
	@Override
	public int compare(Sortable other) {
	    if (other instanceof Buku) {
	        Buku otherBuku = (Buku) other;
	        
	        if (this.jumlahHalaman < otherBuku.getJumlahHalaman()) {
	            return -1;
	        } else if (this.jumlahHalaman > otherBuku.getJumlahHalaman()) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }
	    return 0;
	}
}
