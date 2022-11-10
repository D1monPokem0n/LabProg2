package ru.ifmo.se.pokemon;

import java.util.Arrays;

import static ru.ifmo.se.pokemon.Stat.HP;

public class Roost extends StatusMove{
    public Roost() {
        super(Type.FLYING, 0, 100);
    }
    protected String describe() {
        return "use Roost";
    }
    protected void applySelfEffects(Pokemon p) {
        int addHP = (int) (p.getStat(HP)/2);
            p.setMod(HP, (int) -(addHP));
        //    System.out.println("getType: " + Arrays.toString(p.getTypes()));
     //       p.setType(Type.NONE);
       //     System.out.println("getType: " + Arrays.toString(p.getTypes()));
    }
}
