package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.*;

/**
 * <p>Ход: Удар в ноги.
 * <br>Вид: Физическая атака
 * <br>Тип: Боевой
 * <br>Точность: 100%
 * <br>Сила: 60
 * <br>Действие: Понижает скорость цели на одну ступень
 * </p>
 */
public class LowSweep extends PhysicalMove {

        @Override
        protected String describe() {

                return "used Low Sweep";

        }

        @Override
        protected void applyOppEffects(Pokemon p) {

                p.setMod(Stat.SPEED, -1);

        }

        public LowSweep() {

                super(Type.FIGHTING, 65, 100);

        }

}
