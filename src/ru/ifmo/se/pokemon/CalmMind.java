package ru.ifmo.se.pokemon;

public class CalmMind extends StatusMove{
    public CalmMind() {
        super(Type.PSYCHIC, 0, 100);
    }
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().chance(1.0).turns(-1).stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1);
        p.addEffect(e);
        System.out.println("Успокоив ум, повышает атаку и защиту");
    }
    protected String describe() {
        return "use Calm Mind";
    }
}
