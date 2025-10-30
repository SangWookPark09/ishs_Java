public class Jetpack implements Flyable{
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "이(가) 제트팩 추진기로 기동성있게 날아갑니다! 쓩~");
    }
}
