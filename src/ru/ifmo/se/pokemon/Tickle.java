package ru.ifmo.se.pokemon;

import org.w3c.dom.ls.LSOutput;

public class Tickle extends StatusMove{
    public Tickle() {
        super(Type.NORMAL, 0, 100);
    }
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(1.0).turns(-1).stat(Stat.ATTACK, -1).stat(Stat.DEFENSE, -1);
        p.addEffect(e);
        System.out.println("Щекотка снижает атаку и защиту противника");
        }
    protected String describe() {
        return "use Tickle";
    }
}
