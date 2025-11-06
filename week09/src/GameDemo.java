import Pokemons.*;
import fly.NoFly;
import fly.Wings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
//        int randomNumber = (int)(Math.random() * 3); //0 ~ 2
//        System.out.println(randomNumber);
        Skill[] pikachuSkills = {
                new Skill("Nuzzle", 20),
                new Skill("ThunderShock", 40),
                new Skill("Quick Attack", 40)
        };

        Skill[] sqiurtleSkills = {
                new Skill("Tackle", 40),
                new Skill("Water gun", 40),
                new Skill("Rapid Spin", 50)
        };

        Skill[] charizardSkills = {
                new Skill("Scratch", 40),
                new Skill("Dragon Breath", 60),
                new Skill("Flare Blitz", 120)
        };

        Pokemon playerPokemon = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("플레이어 포켓몬스터 선택\n1) 피카츄 2) 꼬부기 3) 리자몽 : ");
                int number = scanner.nextInt();
                if (number == 1) {
                    playerPokemon = new Pikachu(100, 27, new NoFly(), pikachuSkills);
                    break;
                } else if (number == 2) {
                    playerPokemon = new Sqiurtle(120, 21, new NoFly(), sqiurtleSkills);
                    break;
                } else if (number == 3) {
                    playerPokemon = new Charizard(200, 40, new Wings(), charizardSkills);
                    break;
                } else {
                    System.out.println("메뉴에서 골라주세요");
                }
            }catch (InputMismatchException err){
                System.out.println("숫자로 입력하세요. 메뉴에서 고르세요.");
//                System.out.println(err.getMessage());
                scanner.nextLine(); // 버퍼에 남아있는 값(여기선 문자열) 제거
            }
        }

        int randomNumber = (int)(Math.random() * 3); //0 ~ 2
        Pokemon enemyPokemon;
        System.out.println("야생의 포켓몬이 나타났습니다!");
        if(randomNumber == 0) {
            enemyPokemon = new Pikachu(100, 27, new NoFly(), pikachuSkills);
        }
        else if (randomNumber == 1) {
            enemyPokemon = new Sqiurtle(120, 21, new NoFly(), sqiurtleSkills);
        }
        else if (randomNumber == 2) {
            enemyPokemon = new Charizard(200, 40, new Wings(), charizardSkills);
        }

//        Pokemons.Pokemon playerPokemon = new Pokemons.Pikachu(100, 27, new fly.NoFly());
//        Pokemons.Pokemon playerPokemon = new Pokemons.Charizard(200, 40, new fly.Wings());
//        Pokemons.Pokemon playerPokemon = new Pokemons.Sqiurtle(120, 21, new fly.NoFly());

        //        fly.Jetpack jetpack = new fly.Jetpack();
//
//
//        Pokemons.Pikachu p1 = new Pokemons.Pikachu(100, 27, new fly.NoFly());
////        p1.setFlyingtool(new fly.NoFly());
//        p1.performFlyable();
//        p1.setFlyingtool(jetpack);
//        p1.performFlyable();
////        Pokemons.Pikachu p2 = new Pokemons.Pikachu(100, 28);
////        Pokemons.Sqiurtle s1 = new Pokemons.Sqiurtle(120, 21);
//        Pokemons.Charizard c1 = new Pokemons.Charizard(200, 40, new fly.Wings());
////        c1.setFlyingtool(new fly.Wings());
//        c1.performFlyable();
//
//        System.out.println("배틀 시작!");
//        System.out.println(p1);
//        System.out.println(c1);
//        System.out.println("==============");
//
//        int turn = 1;
//
//        while(!p1.isFainted() && !c1.isFainted()){
//            System.out.println("턴 " + turn + "시작.");
//            p1.attack(c1);
//            if(c1.isFainted()){
//                System.out.println(c1.getName() + "이(가) 기절했습니다! " + p1.getName() + " 승리!");
//                break;
//            }
//            c1.attack(p1);
//            if(p1.isFainted()){
//                System.out.println(p1.getName() + "이(가) 기절했습니다! " + c1.getName() + " 승리!");
//                break;
//            }
//            System.out.println("==============");
//            turn++;
//        }
//        System.out.println("배틀 종료");

//        Pokemons.Pikachu mypikachu = new Pokemons.Pikachu(100, 27);
//        Pokemons.Pikachu yourpikachu = new Pokemons.Pikachu(100, 28);
//        Pokemons.Sqiurtle enemySqiurtle = new Pokemons.Sqiurtle(120, 21);
//        System.out.println("Game Start~");
//        mypikachu.attack(enemySqiurtle);
//        for(int i = 0; i < 5; i++)
//            enemySqiurtle.attack(mypikachu);
//
//        System.out.println(enemySqiurtle);
//        System.out.println(mypikachu);
    }
}
