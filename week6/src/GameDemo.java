public class GameDemo {
    public static void main(String[] args) {
        Pikachu mypikachu = new Pikachu(100);
        Pikachu yourpikachu = new Pikachu(100);
        Sqiurtle enemySqiurtle = new Sqiurtle(120);
        System.out.println("Game Start~");
        mypikachu.attack(yourpikachu);
        mypikachu.attack(enemySqiurtle);
        enemySqiurtle.attack(mypikachu);
    }
}
