public class Q17Enemy {
    // class Atributres
    private  String  name;
    private  int  health;
    private  int  power;
    private  int  defense;
    
    // Constructor
    public Q17Enemy(String name, int  health, int  power, int  defense){
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }
    
    // getters

    public String getname(){
        return name;
    }

    public int  gethealth(){
        return health; 
    }
    
    public int  getpower(){
        return power;
    }

    public int  getdefense(){
        return  defense;
    }

    // setters
    
    public void setname(String newname){
        this.name = newname;
    }

    public void sethealth(int newhealth){
        this.health = newhealth;
    }

    public void setpower(int newpower){
        this.power = newpower;
    }
    
    // method attack player
    public void attack(Q17Player player){
        player.takeDamage(this.power);
    }
    
    // method take damage from player
    public void takeDamage(int playerPower){
        int damages = playerPower - this.defense;
        
        if (damages < 0 ){
            damages = 0;
        }

        this.health = this.health - damages;
   

        if (health < 0){
            System.out.println(this.name + "Died");
        }
    }

}   


