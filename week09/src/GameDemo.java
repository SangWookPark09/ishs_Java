import Pokemons.*;
import fly.NoFly;
import fly.Wings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
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
        Pokemon enemyPokemon = null;
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

        System.out.println("배틀 시작!");
        System.out.println("==============");

        for (int i = 0; i < playerPokemon.skills.length; i++) {
            System.out.println((i+1) + ". " + playerPokemon.skills[i].getName() + " (" + playerPokemon.skills[i].getDamage() + ")");
        }

        System.out.print("Select skill : ");
        int skillNumber = scanner.nextInt() - 1;

        enemyPokemon.setHp(enemyPokemon.getHp() - playerPokemon.skills[skillNumber].getDamage());
        System.out.println(enemyPokemon.getName() + "의 체력은 " + enemyPokemon.getHp() + "이 남았습니다");
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
