import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLearn {
    public static void main(String[] args) {
        Scanner s_in = new Scanner(System.in);
        // System.out.println("Enter some fruit names. Enter #stop# to finish");
        // String line = s_in.nextLine();
        // while (!line.equals("#Stop#")){
        //     System.out.println("You just typed " + line);
        //     line = s_in.nextLine();
        // }

        System.out.println("Enter some cars names. Enter 'Stop' to finish");
        ArrayList<String> cars  = new ArrayList<String>();
        String line2 = s_in.nextLine();
        while(!line2.equals("Stop")){
            System.out.println("You just typed " + line2 + " Adding to list");
            cars.add(line2);
            line2 = s_in.nextLine();
        }

        System.out.println("You entered " + cars.size() +
        " cars. Can't you do better?");
        // get 
        cars.get(0);
        // set
        cars.set(0, "Test");
        // Remove
        // cars.remove(0)

        if (cars.contains("BMW")) {
            System.out.println("Yes to BMW");
            }
        
        for (int j = 0; j < cars.size(); j++) {
        System.out.println(cars.get(j));
        }
    }    
}
