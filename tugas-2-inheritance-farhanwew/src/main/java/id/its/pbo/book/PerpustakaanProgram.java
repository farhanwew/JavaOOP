package id.its.pbo.book;

public class PerpustakaanProgram {
    public static void main(String[] args) {
        BukuPelajaran buku1 = new BukuPelajaran("Pemrograman Java", "Budi Santoso", "Teknologi Informasi");
        BukuFiksi buku2 = new BukuFiksi("Harry Potter", "J.K. Rowling", "Fantasi");

        System.out.println("Informasi Buku Pelajaran:");
        System.out.println("Judul: " + buku1.getJudul());
        System.out.println("Pengarang: " + buku1.getPengarang());
        System.out.println("Subjek: " + buku1.getSubjek());

        System.out.println("\nInformasi Buku Fiksi:");
        System.out.println("Judul: " + buku2.getJudul());
        System.out.println("Pengarang: " + buku2.getPengarang());
        System.out.println("Genre: " + buku2.getGenre());
    }
}
