public class Sqiurtle extends Pokemon {
    public Sqiurtle(int hp){
        super("꼬부기", hp); // 부모클래스의 생성자 보호
        System.out.println("꼬북꼬북~");
    }

    @Override
    public void attack(Pokemon target) {
//        System.out.println(getName() + " -> " + target()); //name is private
        System.out.println(name + " -> " + target.getName() + "에게 '물대포' 사용"); //name is protected
    }
}
