import java.util.Scanner;

class Pokemon{
    // concrete class (can produce object)
    int hp;
}

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
//        Pokemon squirtle = new Pokemon();
        Scanner scanner = new Scanner(System.in);
        System.out.print("체력을 입력하세요 : ");
        pikachu.hp = scanner.nextInt();
//        squirtle.hp = 110;
//        System.out.println(squirtle.hp);
//        System.out.println(pikachu.hp);

        if(pikachu.hp > 99){
            System.out.println("피카츄의 체력("+ pikachu.hp + ")이 여유~");
        }
        else{
            System.out.println("피카츄의 체력("+ pikachu.hp + ")이 부족!");
        }
    }
}
