public class Q11Fraction {
    /**
     * e1 = numerator for the first fraction
     * d1 = denominator for the first fraction
     * first fraction = e1 / d1
     * 
     * e2 = numerator for the second fraction
     * d2 = denominator for the second fraction
     * 
     * e1 and e2 are integer
     * d1 and d2 are postive interger
     * 
     * The questions =
     * 1.sum of two fraction = (e1 / d1) + (e2 /d2)
     * solution  = ((e1 * d2) + (e2 * d1 )) / (e1 * e2)
     * 
     * 2.product of two fraction = (e1 / d1) * (e2 /d2)
     * solution  = (e1 * e2) / (d1 *d2)
     */
    
    //  function for sum of two fraction
     static double  sumTwoFractions(double  e1, double  d1, double  e2, double  d2){
        double enumration = (e1 * d2) + (e2 * d1);
        double denomination = d1 * d2;
        double result = enumration / denomination;
        return result;
     }

    //  function for product to fraction
     static double  productTwoFractions(double  e1, double  d1, double  e2, double  d2){
        double enumration = e1 * e2;
        double denomination = d1 * d2;
        double result = enumration / denomination;
        return result;
     }

    public static void main(String[] args) {
        
        // Test 1
        // (1/2) + (1/3)
        double q1_sum  = sumTwoFractions(1, 2, 1, 3);
        System.out.println("Sum for 1/2 + 1/3 = " + q1_sum);
        
        // Test 2
        // (1/3) + (3/4)
        double q2_sum  = sumTwoFractions(1, 3, 3, 4);
        System.out.println("Sum for 1/3 + 3/4 = " + q2_sum);

        // Test 3
        // (1/2) * (2/3)
        double q3_product = productTwoFractions(1, 2, 2, 3);
        System.out.println("product of 1/2 and 2/3 " + q3_product);
        
        //test 4
        //  (1/4) * (2/3)
        double q4_product = productTwoFractions(1, 4, 2, 3);
        System.out.println("product of 1/4 and 2/3 " + q4_product);


    }
}
