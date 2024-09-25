public class Q16FractionTest {
    public static void main(String[] args) {
        // Test
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(3, 7) ;

        System.out.println("1/2 * 3/7 = " + f2.getProduct(f1));
        System.out.println("1/2 + 3/7 = " + f2.getSum(f1));
    }
}
