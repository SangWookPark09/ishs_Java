package fly;

import Pokemons.Pokemon;

public class Wings implements Flyable {
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "이(가) 날개를 펼쳐 훨훨 날아가요~");
    }
}
