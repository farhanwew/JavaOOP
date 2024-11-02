public class Q16Fraction {
    
    // Class attributes (instance variables)
    private int numerator;
    private int denominator;

    // Constructor
    public Q16Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;

    }
    
    // Getter method for numerator
    public int getNumerator(){
        return numerator;
    }

    // Getter method for denominator
    public int getDenominator(){
        return denominator;
    }

    // Override of the toString method from Object class
    @Override
    public String toString(){
        return numerator + "/" +  denominator;
    }

    // Method to multiply this fraction with another fraction
    public Q16Fraction getProduct(Q16Fraction fraction2){
        int newNum = this.numerator * fraction2.numerator;
        int newDen = this.denominator * fraction2.denominator;
        return new Q16Fraction(newNum, newDen);
    }

    // Method to add this fraction with another fraction
    public Q16Fraction getSum(Q16Fraction fraction2){
        int newNum = this.numerator * fraction2.denominator + fraction2.numerator * this.denominator;
        int newDen = this.denominator * fraction2.denominator;
        return new Q16Fraction(newNum, newDen);
    }
}