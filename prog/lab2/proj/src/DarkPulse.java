package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.*;

/**
 * <p>Ход: Тёмный пульс.
 * <br>Вид: Специальная атака
 * <br>Тип: Тёмный
 * <br>Точность: 100%
 * <br>Сила: 80
 * <br>Действие: Наносит специальный урон и имеет 20% вероятность заставить цель дрогнуть
 * </p>
 */
public class DarkPulse extends SpecialMove {

        @Override
        protected String describe() {

                return "used Dark Pulse";

        }

        @Override
        protected void applyOppEffects(Pokemon p) {

                Effect e = new Effect().chance(0.2);
                e.flinch(p);

        }

        public DarkPulse() {

                super(Type.DARK, 80, 100);

        }

}
