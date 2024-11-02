package id.its.pbo;

public class DateProgram {
    public static void main(String[] args) {
        Date date1 = new Date(2, 29, 2023);
        System.out.println("Tanggal pertama: " + date1.displayDate());

        date1.setMonth(12);
        date1.setDay(25);
        date1.setYear(2024);

        System.out.println("Setelah diubah:");
        System.out.println("Bulan: " + date1.getMonth());
        System.out.println("Hari: " + date1.getDay());
        System.out.println("Tahun: " + date1.getYear());
        System.out.println("Tanggal setelah perubahan: " + date1.displayDate());

        Date date2 = new Date(13, 40, -5);
        System.out.println("Tanggal kedua (nilai tidak valid): " + date2.displayDate());

        Date date = new Date(12, 25, 2020);

        System.out.println(date.getDay());
    }
}
