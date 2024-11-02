public class Q14ComplexNumber {
    /**Implement these methods to:
     * 
     * 1. Add two complex numbers,
     * 2. Subtract two complex tumblers,
     * 3. Multiply two complex numbers,
     * 4. Convert the complex number to a String “a + bi”. (where a is the real part andb is the imaginary part).
     * 
     * 1. Additions = (a + bi) + (c + di) = (a + c) + (b + d)i
     * 2. Subtractions = (a + bi) - (c + di) = (a - c) + (b - d)i 
     * 3. Multiplications = (a + bi) * (c + di) = (a * c - b * d) + (a * d + b * c)i
     * 
     * 
     */
    // Class Atribute
    private int realNum;
    private int imanginaryNum;
    
    // Constructor
    public  Q14ComplexNumber(int realNum, int imanginaryNum){
        this.realNum = realNum;
        this.imanginaryNum = imanginaryNum;
    }
    
    // Methods

    // Addition
    public Q14ComplexNumber additions(Q14ComplexNumber fraction2){
        int real = this.realNum + fraction2.realNum;
        int imanginary = this.imanginaryNum + fraction2.imanginaryNum;
        return new Q14ComplexNumber(real, imanginary);
        }
    
    // substraction
    public Q14ComplexNumber substractions(Q14ComplexNumber fraction2){
        int real = this.realNum  - fraction2.realNum;
        int imanginary = this.imanginaryNum - fraction2.imanginaryNum;
        return new Q14ComplexNumber(real, imanginary);
        }
    
    // substraction
    public Q14ComplexNumber multiplications(Q14ComplexNumber fraction2){
        int real = this.realNum * fraction2.realNum -  this.imanginaryNum * fraction2.imanginaryNum;
        int imanginary = this.realNum * fraction2.imanginaryNum + this.imanginaryNum * fraction2.realNum;
        return new Q14ComplexNumber(real, imanginary);
        }
    
    // Override of the toString method from Object class
    // Convert the complex number to a String “a + bi”.
    @Override
    public String toString(){
        return realNum +" + "+  imanginaryNum + "i";
}
}
