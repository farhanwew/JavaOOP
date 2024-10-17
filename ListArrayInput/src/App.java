public class App {
    public static void main(String[] args) throws Exception {
        String [] fruitArray = new String[5];
        fruitArray[0] = "Srikaya";
        System.out.println(fruitArray[0]);
        // if we change
        fruitArray[0] = "Grape";
        System.out.println(fruitArray[0]);
        // output = Grape
        fruitArray[1] = "Durain";
        fruitArray[2] = "Apple";
        fruitArray[3] = "Manggo";
        fruitArray[4] = "Orange";
        
        // fruitArray[5] = "Cherry"; Out of index
        

        for (int fruitIndex = 0; fruitIndex < 5 ; fruitIndex++){
            System.out.println("Fruit index "+ fruitIndex + " is " + fruitArray[fruitIndex]);
        }

        // if we dont know how big array is
        for (int fruitIndex = 0; fruitIndex < fruitArray.length; fruitIndex++){
        System.out.println("Fruit index "+ fruitIndex + " is " + fruitArray[fruitIndex]);
        }
        
        // implicit
        String[] secondFruitArray = {"duren", "Apel", "Monggo"};
    }   
}
