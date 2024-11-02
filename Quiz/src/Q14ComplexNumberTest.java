public class Q14ComplexNumberTest {
    public static void main(String[] args) {
        
        // Test case 1
        // z1 = 3+4i & z2 = 1+2i
        
        Q14ComplexNumber z1 = new Q14ComplexNumber(3, 4);
        Q14ComplexNumber z2 = new Q14ComplexNumber(1, 2);

        System.out.println("z1 = 3+4i");
        System.out.println("z2 = 1+2i\n");
        
        //1.Additions for z1 + z2 = 4+6i
        System.out.println("z1 + z2 = " + z1.additions(z2));

        //2.Substractions for z1 - z2 = 2+2i
        System.out.println("z1 + z2 = " + z1.substractions(z2));

        //3.Multiplications for z1 - z2 = 2+2i
        System.out.println("z1 + z2 = " + z1.multiplications(z2));
    }
}
