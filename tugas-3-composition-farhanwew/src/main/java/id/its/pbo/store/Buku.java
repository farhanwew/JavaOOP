package id.its.pbo.store;

public class Buku {
    private String isbn;
    private String judul;
    private double harga;
    
    public Buku(String isbn, String judul, double harga){
        this.isbn = isbn;
        this.judul = judul;
        this.harga = harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }
}
