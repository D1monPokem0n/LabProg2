package ru.ifmo.se.pokemon;

public class Togepi extends Pokemon{
    public Togepi(String name, int lvl) {
        super(name,lvl);
        addType(Type.FAIRY);
        setStats(35, 20, 65, 40, 65, 20);
        setMove(new Psychic(), new FireBlast());
    }
}
