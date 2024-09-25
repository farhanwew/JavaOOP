public class Q13ComputerAccountTest {
    
    public static void main(String[] args) {
        

        //Make acoount object
        Q13ComputerAccount account = new Q13ComputerAccount("Farhan Arya", "FarhanA", "Hello123");       

        System.out.print("Password:");
        account.printPassword();

         // print realname of FarhanA acoount, ouput = Farhan Arya
         System.out.print("realname:");
        account.printRealName();
        
        // print username of FarhanA acoount, ouput = hello123
        System.out.print("username:");
        account.printUserName();

        System.out.println("farhan accounts");
        // print password of FarhanA acoount, ouput = hello123
        
        
        // change farhanA password to --> iChangeMaPass
        System.out.println("Change Password:");
        account.changePassword("iChangeMaPass");

        // check password of FarhanA acoount after changing 
        System.out.print("New Password:");
        account.printPassword();
    }
}
