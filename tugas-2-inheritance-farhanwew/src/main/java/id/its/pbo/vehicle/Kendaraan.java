package id.its.pbo.vehicle;

public class Kendaraan {
    protected String merk;
    protected int tahunProduksi;

    public  Kendaraan(String merk, int tahunProduksi){
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    protected String infoKendaraan(){
        return "Merk: " + merk + ", Tahun: " + tahunProduksi;
    }
}
