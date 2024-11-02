public class Q17Player {
    
    // Class atribute
    private  String  name;
    private  int  health;
    private  int  power;
    private  int  defense;
    
    // Constructor
    public Q17Player(String name, int  health, int  power, int  defense){
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }
    
    // getters

    public String getname(){
        return name;
    }

    public int gethealth(){
        return health; 
    }
    
    public int getpower(){
        return power;
    }

    public int getdefense(){
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
    public void attack(Q17Enemy enemy){
        enemy.takeDamage(this.power);
    }
    
    // method take damage from enemy
    public void takeDamage(int enemyPower){
        int damages = enemyPower - this.defense;

        
        this.health = this.health - damages;
        
        if (health < 0){
            System.out.println(this.name + "Died");
        }
    }
}