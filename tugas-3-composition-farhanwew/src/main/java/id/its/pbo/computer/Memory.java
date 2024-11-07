package id.its.pbo.computer;

public class Memory {
    private int kapasitas;
    private String tipeMemory;

    public Memory(int kapasitas, String tipeMemory){
        this.kapasitas = kapasitas;
        this.tipeMemory = tipeMemory;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }
    
    public void setTipeMemory(String tipeMemory) {
        this.tipeMemory = tipeMemory;
    }

    public String getTipeMemory() {
        return tipeMemory;
    }
}
