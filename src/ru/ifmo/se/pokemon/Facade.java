package ru.ifmo.se.pokemon;

public class Facade extends PhysicalMove{
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if ((att.getStat(Stat.SPEED) / 512.0 > Math.random() || (att.getCondition() == Status.BURN) || (att.getCondition() == Status.POISON) || (att.getCondition() == Status.PARALYZE))) {
            System.out.println(Messages.get("critical"));
            return 2.0;
        } else {
            return 1.0;
        }
    }
    protected String describe() {
        return "use Facade";
    }
}
