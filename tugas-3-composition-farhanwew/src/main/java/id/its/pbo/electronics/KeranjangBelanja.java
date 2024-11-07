package id.its.pbo.electronics;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    List<ItemBelanja> daftarItemBelanja;

    public KeranjangBelanja(){
        this.daftarItemBelanja = new ArrayList<>();
    }

    public void tambahProduk(Produk produk, int jumlah){
        daftarItemBelanja.add(new ItemBelanja(produk, jumlah));
    }

    public double hitungTotalBelanja(){
        double jumlahTotal = 0;
        for (ItemBelanja item: daftarItemBelanja){
            jumlahTotal+= item.hitungTotal();
        }
        return jumlahTotal;
    }
}
