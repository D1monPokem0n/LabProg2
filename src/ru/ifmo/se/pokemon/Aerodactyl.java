package ru.ifmo.se.pokemon;

public class Aerodactyl extends Pokemon{
    public Aerodactyl(String name, int lvl) {
        super(name,lvl);
        setType(Type.ROCK, Type.FLYING);
        setStats(80,105,65, 60, 75, 130);
        setMove(new Roost(), new AncientPower(), new FireFang(), new BrutalSwing());
    }
}
