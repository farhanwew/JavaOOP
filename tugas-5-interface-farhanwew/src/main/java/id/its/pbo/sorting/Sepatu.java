package id.its.pbo.sorting;

public class Sepatu extends Item implements Sortable{
	
	private int ukuran;
	public Sepatu(String nama, int ukuran) {
		super(nama);
		this.ukuran = ukuran;

	}
	
	public int getUkuran() {
		return ukuran;
	}
	
	@Override
	public int compare(Sortable other) {
	  
	    if (other instanceof Sepatu) {
	        Sepatu otherSepatu = (Sepatu) other;  
	        
	        if (this.ukuran < otherSepatu.getUkuran()) {
	            return -1;  
	        } else if (this.ukuran > otherSepatu.getUkuran()) {
	            return 1;   
	        } else {
	            return 0;  
	        }
	    }
	    return 0;}
}
