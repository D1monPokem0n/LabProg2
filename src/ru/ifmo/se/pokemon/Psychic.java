package ru.ifmo.se.pokemon;

public class Psychic extends SpecialMove{
    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(1.0).turns(1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }
}
