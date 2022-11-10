package ru.ifmo.se.pokemon;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Minccino Biba = new Minccino("Биба", 1);
        Cinccino Boba = new Cinccino("Боба", 1);
        Togepi Vupsenb = new Togepi("Вупсень", 1);
        Togetic Pupsenb = new Togetic("Пупсень", 1);
        Togekiss Pupa = new Togekiss("Пупа", 1);
        Aerodactyl Lupa = new Aerodactyl("Лупа", 1);
        b.addAlly(Biba);
        b.addAlly(Vupsenb);
        b.addAlly(Pupa);
        b.addFoe(Boba);
        b.addFoe(Pupsenb);
        b.addFoe(Lupa);
        b.go();
    }
}
