package id.its.pbo.medical;

public class PemeriksaanProgram {
    public static void main(String[] args) {
        Pasien[] daftarPasien = {
            new Pasien("John Doe", 25, "Jl. Mawar No. 10"),
            new Pasien("", 30, "Jl. Melati No. 15"),
            new Pasien("Jane Doe", -5, "Jl. Anggrek No. 20"),
            new Pasien("Budi", 130, "")
        };

        Pemeriksaan pemeriksaan = new Pemeriksaan();

        for (Pasien pasien : daftarPasien) {
            try {
                pemeriksaan.periksaData(pasien);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
