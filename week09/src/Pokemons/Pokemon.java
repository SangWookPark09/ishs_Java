package Pokemons;

import fly.Flyable;

import java.util.ArrayList;

public abstract class Pokemon {
    private String name;
    private int hp;
    private int attackPower;
    protected Flyable flyingtool; // has-a (Aggregation)
    Skill[] skills;

    public Pokemon(String name, int hp, int attackPower, Flyable flyingtool, Skill[] skills){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.flyingtool = flyingtool;
        this.skills = skills;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setFlyingtool(Flyable flyingtool) {
        this.flyingtool = flyingtool;
    }

    public void performFlyable() {
        this.flyingtool.fly(this);
    }

    public abstract void attack(Pokemon target);
    public void receiveDamage(int damage){
        hp = hp - damage;
        if(hp < 0) hp = 0;
    }

    public boolean isFainted(){
        return hp <= 0;
    }

    @Override
    public String toString() {
        return name + " (HP : " + hp + ", AttackPower : " + attackPower + ")";
    }
}
