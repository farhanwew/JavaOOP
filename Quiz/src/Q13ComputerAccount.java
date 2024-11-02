public class Q13ComputerAccount {
    
    // Create class atribute
    private String realName;
    private String userName;
    private String password;

    //  Constructor
    public Q13ComputerAccount(String realName, String userName, String password){
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }

    //  methods
    
    public void printRealName(){
        System.out.println(realName);
    }

    public void printUserName(){
        System.out.println(userName);
    }

    public void printPassword(){
        System.out.println(password);
    }

    public void changePassword(String newPass){
        this.password = newPass;

    }
}
