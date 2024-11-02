public class Q17EnemyPlayerTest {
    public static void main(String[] args) {
        
    
    Q17Enemy enemy1 = new Q17Enemy("Zombie", 100, 20, 10);
    Q17Player player1 = new Q17Player("Farhan", 150, 30, 15);
    
    System.out.println(enemy1.getname() + " Attcak! " + player1.getname());
    enemy1.attack(player1);
    System.out.println(player1.getname() + " Health after attack by " + enemy1.getname() + ":" + player1.gethealth());
}
}