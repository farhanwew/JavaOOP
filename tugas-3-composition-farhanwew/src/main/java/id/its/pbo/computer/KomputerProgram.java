package id.its.pbo.computer;

public class KomputerProgram {

	public static void main(String[] args) {
		Processor processor = new Processor("AMD", 4.0);
        Memory memory = new Memory(32, "DDR5");
        Komputer komputer = new Komputer(processor, memory);

		System.out.println(komputer.infoKomputer());

	}

}
