package id.its.pbo.computer;

public class Processor {
    private String brand;
    private double kecepatan;

    public Processor(String brand, double kecepatan){
        this.brand = brand;
        this.kecepatan = kecepatan;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getKecepatan() {
        return kecepatan;
    }
}
