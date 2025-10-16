public abstract class Pokemon {
    private String name;
    private int hp;

    public Pokemon(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName(){
        return name;
    }

    public int getHP(){
        return hp;
    }

    public abstract void attack(Pokemon target);

}
