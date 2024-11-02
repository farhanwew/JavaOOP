public class Q15Weight {
    
    // class adtribute
    private double p;
    
    // constructor
    public Q15Weight(double p) {
        this.p = p;
    }
    
    //  method to convert Pounds to kilogrm
    public double getKilograms(){
        double resultToKilo = this.p * 0.45359237;
        return resultToKilo;
    }

    // method to return value of pounds
    public double getPounds(){
        return this.p;
    }
}
