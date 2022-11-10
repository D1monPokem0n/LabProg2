package ru.ifmo.se.pokemon;

public class Togekiss extends Togetic{
    public Togekiss(String name, int lvl) {
        super(name,lvl);
        addMove(new AirSlash());
    }
}