package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.*;

/**
 * <p>Ход: Секрет.
 * <br>Вид: Статусный ход
 * <br>Тип: Нормал
 * <br>Действие: Снижает спец. атаку цели на 1 пункт
 * </p>
 */
public class Confide extends StatusMove {

        @Override
        protected String describe() {

                return "used Confide";

        }

        @Override
        protected void applyOppEffects(Pokemon p) {

                p.setMod(Stat.SPECIAL_ATTACK, -1);

        }

        public Confide() {

                super(Type.NORMAL, 0, 0);

        }

}
