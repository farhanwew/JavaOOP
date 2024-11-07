package id.its.pbo.electronics;

public class ItemBelanja {
    private Produk produk;
    private int kuantitas;

    public ItemBelanja(Produk produk, int kuantitas){
        this.kuantitas = kuantitas;
        this.produk = produk;
    }

    public double hitungTotal(){
        return produk.getHarga() * this.kuantitas;
    }
}
