package ru.ifmo.se.pokemon;

public class BrutalSwing extends PhysicalMove{
    BrutalSwing() {
        super(Type.DARK,60,100);
    }
    protected String describe() {
        return "use Brutal Swing";
    }
}
