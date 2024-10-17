import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alineOftext = sc.nextLine();
        System.out.println(alineOftext);   

        System.out.println("Pick an integer: ");
        int value = sc.nextInt();      
        System.out.println("You picked " + value + ".The square of that is " +  (value * value) + ".");         
    }
}           
