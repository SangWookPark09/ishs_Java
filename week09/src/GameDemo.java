import Pokemons.*;
import fly.NoFly;
import fly.Wings;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        ArrayList<Skill> pikachuSkills = new ArrayList<>();
        pikachuSkills.add(new Skill("Nuzzle", 20));
        pikachuSkills.add(new Skill("ThunderShock", 40));
        pikachuSkills.add(new Skill("Quick Attack", 40));

        ArrayList<Skill> sqiurtleSkills = new ArrayList<>();
        sqiurtleSkills.add(new Skill("Tackle", 40));
        sqiurtleSkills.add(new Skill("Water gun", 40));
        sqiurtleSkills.add(new Skill("Rapid Spin", 50));

        ArrayList<Skill> charizardSkills = new ArrayList<>();
        charizardSkills.add(new Skill("Scratch", 40));
        charizardSkills.add(new Skill("Dragon Breath", 60));
        charizardSkills.add(new Skill("Flare Blitz", 120));

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

        charizardSkills.add(new Skill("Inferno", 100));
        while(true) {
            System.out.print("플레이어 행동 선택\n1)전투  2)도망  3)종료 : ");
            int actNumber = scanner.nextInt();
            if(actNumber == 1) {
                for (int i = 0; i < playerPokemon.skills.size(); i++) {
                    System.out.println((i + 1) + ". " + playerPokemon.skills.get(i).getName() + " (" + playerPokemon.skills.get(i).getDamage() + ")");
                }

                System.out.print("Select skill : ");
                int skillNumber = scanner.nextInt() - 1;

                playerPokemon.attack(enemyPokemon, skillNumber);
                enemyPokemon.attack(playerPokemon, (int) (Math.random() * 3));

                if (enemyPokemon.isFainted() || playerPokemon.isFainted())
                    break;
            }
            else if(actNumber == 2) {
                playerPokemon.performFlyable();
                break;
            }
            else if(actNumber == 3) {
                break;
            }
            else {
                System.out.println("선택 메뉴에서 골라주세요!");
            }
        }
        System.out.println("배틀 종료");
    }
}
