package id.its.pbo.gadget;
import id.its.pbo.electronics.Smartphone;
public class GadgetProgram {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", 2024, "Android");
        System.out.println(phone.infoSmartphone());
    }
}
