package ru.ifmo.se.pokemon;

public class Cinccino extends Minccino{
    public Cinccino(String name, int lvl) {
        super(name, lvl);
        addMove(new FocusBlast());
    }
}
