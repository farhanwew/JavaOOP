package id.its.pbo.store;
import java.util.ArrayList;
import java.util.List;

public class TokoBuku {
    List<Buku> daftarBuku;

    public TokoBuku(){
        this.daftarBuku = new ArrayList<>();
    }


	public void tambahBuku(Buku buku){
        this.daftarBuku.add(buku);
    }

    public void hapusBuku(Buku buku){
        this.daftarBuku.remove(buku);
    }

    public Buku cariBuku(String isbn){
        for (Buku buku : daftarBuku) {
            if (buku.getIsbn().equals(isbn)) {
                return buku;
            }
        }
        return null;
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}