public class Sqiurtle extends Pokemon {
    public Sqiurtle(int hp, int attackPower, NoFly noFly){
        super("꼬부기", hp, attackPower, noFly); // 부모클래스의 생성자 보호
        System.out.println("꼬북꼬북~");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAttackPower() + 2;
        System.out.println(getName() + " -> " + target.getName() + "에게 '전기충격' 사용! (데미지 : " + damage + ")"); //name is private
//        System.out.println(name + " -> " + target.getName() + "에게 '물대포' 사용"); //name is protected
//        target.setHp(target.getHp()-damage);
        target.receiveDamage(damage);
        System.out.println(target.getName() + "의 남은 Hp : " + target.getHp());
    }
}
