package ru.ifmo.se.pokemon;

public class AirSlash extends SpecialMove{
    public AirSlash() {
        super(Type.FLYING,75,95);
    }
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.3);
       // p.addEffect(e);
        if (e.success()) {
            Effect.flinch(p);
          // System.out.println("flinch!");
        }
    }
    protected String describe() {
        return "use Air Slash";
    }
}
