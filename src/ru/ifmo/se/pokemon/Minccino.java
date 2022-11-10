package ru.ifmo.se.pokemon;
public class Minccino extends Pokemon {
    public Minccino(String name, int lvl) {
       super(name,lvl);
       addType(Type.NORMAL);
       setStats(55, 50, 40, 40, 40, 75);
       setMove(new Tickle(), new Facade(), new CalmMind());
    }
}