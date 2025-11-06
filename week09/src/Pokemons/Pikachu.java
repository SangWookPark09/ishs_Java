package Pokemons;

import fly.NoFly;

import java.util.ArrayList;

public class Pikachu extends Pokemon{
    public Pikachu(int hp, int attackPower, NoFly noFly, ArrayList<Skill> skills){
        super("피카츄", hp, attackPower, noFly, skills); // 부모클래스의 생성자 보호
        System.out.println("피카피카~");
    }

    @Override
    public void attack(Pokemon target, int choice) {
        int damage = getAttackPower() + 52+ this.skills.get(choice).getDamage();
        System.out.println(getName() + " -> " + target.getName() + "에게 " + this.skills.get(choice).getName() + "사용! (데미지 : " + damage + ")"); //name is private
//        System.out.println(name + " -> " + target.getName() + "에게 '전기충격' 사용"); //name is protected
        //target.setHp(target.getHp()-damage);
        target.receiveDamage(damage);
        System.out.println(target.getName() + "의 남은 Hp : " + target.getHp());
    }
}
