package id.its.pbo.vehicle;

import id.its.pbo.transport.Mobil;

public class KendaraanProgram {
        public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2023, "SUV");
        System.out.println(mobil.infoMobil());
        

        mobil.setJenis("Sedan");
        System.out.println(mobil.infoMobil());
}
}
