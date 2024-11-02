import java.util.*;

public class Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println("Enter some numbers!");
        int currentVal;
        while (true) {
        try {
        currentVal = s.nextInt();
        if (currentVal == 99) {
        break;
        }
        System.out.println("Adding " + currentVal);
        intList.add(currentVal);
        } catch (InputMismatchException ime) {
        System.out.println(ime + ": please enter only numbers.");
        s = new Scanner(System.in);
        }
        }
    }
}
