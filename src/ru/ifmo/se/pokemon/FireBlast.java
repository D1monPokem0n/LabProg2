package ru.ifmo.se.pokemon;

public class FireBlast extends SpecialMove{
    FireBlast() {
        super(Type.FIRE, 110, 85);
    }
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1  ).condition(Status.BURN);
        p.addEffect(e);
    }
    protected String describe() {
        return "use FireBlast";
    }
}