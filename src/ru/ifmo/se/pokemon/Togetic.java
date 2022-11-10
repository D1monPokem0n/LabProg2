package ru.ifmo.se.pokemon;

public class Togetic extends Togepi{
    public Togetic(String name, int lvl) {
        super(name,lvl);
        addMove(new AncientPower());
    }
}
