package id.its.pbo;

public class EmployeeProgram {
    public static void main(String[] args) {
        
        // membuat dua objek employee
        Employee employee1 = new Employee("Ahmad", "Bima",10000000);
        Employee employee2 = new Employee("Farhan", "Budi",12000000);

        // gaji tahunan 
        System.out.println(employee1.getFirstName()+"sebelum naik gaji" + employee1.getMonthlySalary());
        System.out.println(employee2.getFirstName()+"sebelum naik gaji" +employee2.getMonthlySalary());

        // peningkatan gaji 10%
        employee1.raiseSalary(10);
        employee2.raiseSalary(10);

        // gaji setelah naik
        System.out.println(employee1.getFirstName() +"setelah naik gaji" + employee1.getMonthlySalary());
        System.out.println(employee2.getFirstName() +"setelah naik gaji" + employee2.getMonthlySalary());
    }
}
