package id.its.pbo.computer;

public class Komputer {
    private Processor Processor;
    private Memory Memory;

    public Komputer(Processor processor, Memory memory){
        this.Processor = processor;
        this.Memory = memory;
    }

    public void setMemory(Memory Memory) {
        this.Memory = Memory;
    }

    public Memory getMemory() {
        return Memory;
    }

    public void setProcessor(Processor processor) {
        Processor = processor;
    }

    public Processor getProcessor() {
        return Processor;
    }

    public String infoKomputer(){
        return "Processor Brand: " + this.Processor.getBrand() + ", Kecepatan: " + this.Processor.getKecepatan()+ " GHz" + ", Memory Kapasitas: " + this.Memory.getKapasitas() + " GB" + ", Tipe: " + this.Memory.getTipeMemory();
    }

}
