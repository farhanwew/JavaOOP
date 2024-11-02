package id.its.pbo;

public class Employee {
    
    // variabel instance
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // constructor
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    
    // getter first name
    public String getFirstName(){
        return firstName;
    }

    // getter last name
    public String getLastName(){
        return lastName;
    }

    // getter month salary
    public double getMonthlySalary(){
        return monthlySalary;
    }

    //  set month salary
    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary> 0 ){
            this.monthlySalary = monthlySalary;
        }
    }
    
    // get year salary
    public double getYearlySalary(){
        return (double) this.monthlySalary * 12;
    }

    // method raise salary
    public void raiseSalary(int raise){
        if (raise > 0){
            this.monthlySalary = this.monthlySalary + (this.monthlySalary * raise) / 100;
        }
    }
}
