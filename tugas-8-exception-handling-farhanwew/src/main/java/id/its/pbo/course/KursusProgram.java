package id.its.pbo.course;

public class KursusProgram {
    public static void main(String[] args) throws Exception{
        KursusOnline kursus = new KursusOnline();

        Peserta peserta1 = new Peserta("Alice", 20, "Sarjana");
        Peserta peserta2 = new Peserta("Bob", 17, "SMA");
        Peserta peserta3 = new Peserta("Charlie", 25, "Magister");
        Peserta peserta4 = new Peserta("Diana", 22, "Diploma");

        Peserta[] pesertaList = {peserta1, peserta2, peserta3, peserta4};

        for (Peserta peserta : pesertaList) {
            try {
                kursus.daftarPeserta(peserta);
                System.out.println(peserta.getNama() + " berhasil mendaftar.");
            } catch (UsiaTidakMemenuhiSyaratException | PendidikanTidakMemenuhiSyaratException e) {
                System.out.println("Pendaftaran gagal untuk " + peserta.getNama() + ". Alasan: " + e.getMessage());
            } finally {
                System.out.println("Proses pendaftaran selesai.");
            }
        }

        System.out.println("\nDaftar peserta yang berhasil mendaftar:");
        for (Peserta p : kursus.getDaftarPeserta()) {
            System.out.println(p.getNama());
        }
    }
}
