public class GameDemo {
    public static void main(String[] args) {
        Pikachu mypikachu = new Pikachu(100, 27);
        Pikachu yourpikachu = new Pikachu(100, 28);
        Sqiurtle enemySqiurtle = new Sqiurtle(120, 21);
        System.out.println("Game Start~");
        mypikachu.attack(enemySqiurtle);
        for(int i = 0; i < 5; i++)
            enemySqiurtle.attack(mypikachu);

        System.out.println(enemySqiurtle);
        System.out.println(mypikachu);
    }
}
