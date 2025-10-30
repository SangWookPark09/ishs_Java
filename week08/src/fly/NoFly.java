package fly;

import Pokemons.Pokemon;

public class NoFly implements Flyable {
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "이(가) 하늘을 날 수가 없습니다ㅠㅠ");
    }
}
