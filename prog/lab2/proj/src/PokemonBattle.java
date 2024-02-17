package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.Battle;

/**
 * Главный класс, реализующий сражение.
 */
public class PokemonBattle {

   public static void main(String[] args) {

      Battle b = new Battle();
      Kartana p1 = new Kartana("Karta", 1);
      Boldore p2 = new Boldore("Baldur", 1);
      Gigalith p3 = new Gigalith("Gigas", 1);
      Shieldon p4 = new Shieldon("Shieldo", 1);
      Bastiodon p5 = new Bastiodon("Bastini", 1);
      Roggenrola p6 = new Roggenrola("Roggsimus", 1);
      b.addAlly(p1);
      b.addFoe(p2);
      b.addFoe(p3);
      b.addAlly(p4);
      b.addAlly(p5);
      b.addFoe(p6);
      b.go();

   }

}
