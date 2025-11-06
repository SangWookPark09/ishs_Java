package fly;

import Pokemons.Pokemon;

public class Balloon implements Flyable {
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "이(가) 풍선을 타고 날아갑니다~~");
    }
}
