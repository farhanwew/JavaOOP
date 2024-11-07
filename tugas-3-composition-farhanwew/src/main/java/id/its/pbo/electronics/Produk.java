package id.its.pbo.electronics;

public class Produk {
    private String nama;
    private double harga;

    public Produk(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
