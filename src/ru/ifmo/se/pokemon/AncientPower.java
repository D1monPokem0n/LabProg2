package ru.ifmo.se.pokemon;

public class AncientPower extends SpecialMove{
    public AncientPower() {
        super(Type.ROCK,60,100);
    }
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1).stat(Stat.HP, +1).stat(Stat.ATTACK, +1).stat(Stat.SPECIAL_ATTACK, +1).stat(Stat.SPECIAL_DEFENSE, +1).stat(Stat.DEFENSE, +1).stat(Stat.SPEED, +1);
        p.addEffect(e);
    }
    protected String describe() {
        return "use Ancient Power";
    }
}
