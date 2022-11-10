package ru.ifmo.se.pokemon;

public class FireFang extends PhysicalMove{
    public FireFang() {
        super(Type.FIRE,65,95);
    }
    protected String describe() {
        return "use Fire Fang";
    }
    protected void applyOppEffects(Pokemon p) {
        Effect e1 = new Effect().chance(0.1).condition(Status.BURN);
        Effect e2 = new Effect().chance(0.1);
        p.addEffect(e1);
        if (e2.success()) { Effect.flinch(p); }
    }
}
