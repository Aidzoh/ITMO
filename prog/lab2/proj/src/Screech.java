package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.*;

/**
 * <p>Ход: Визг.
 * <br>Вид: Статусный ход
 * <br>Тип: Волшеб
 * <br>Точность: 85%
 * <br>Действие: Снижает защиту цели на 2 ступени
 * </p>
 */
public class Screech extends StatusMove {

        @Override
        protected String describe() {

                return "used Screech";

        }

        @Override
        protected void applyOppEffects(Pokemon p) {

                p.setMod(Stat.DEFENSE, -2);

        }

        public Screech() {

                super(Type.FAIRY, 0, 85);

        }

}
