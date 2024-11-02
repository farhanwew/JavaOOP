public class Q15WeightTest {
    
    public static void main(String[] args) {
        
        // Create an instance of Q15Weight with an initial weight of 10 pounds
        Q15Weight test1 = new Q15Weight(10);
        
        // Print the weight in pounds
        System.out.println("Mass given in pounds: " + test1.getPounds());
        
        // Convert the weight to kilograms and print the result
        System.out.println("10 Pounds to kilograms: " + test1.getKilograms());
    }
}
