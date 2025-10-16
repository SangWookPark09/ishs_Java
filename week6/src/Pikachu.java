public class Pikachu extends Pokemon{
    public Pikachu(int hp){
        super("피카츄", hp); // 부모클래스의 생성자 보호
        System.out.println("피카피카~");
    }

    @Override
    public void attack(Pokemon target) {
        System.out.println(getName() + " -> " + target()); //name is private
//        System.out.println(name + " -> " + target.getName() + "에게 '전기충격' 사용"); //name is protected
    }
}
