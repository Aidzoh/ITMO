package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.*;

/**
 * <p>Ход: Щегольство.
 * <br>Вид: Статусный ход
 * <br>Тип: Нормал
 * <br>Точность: 90%
 * <br>Действие: Повышает атаку цели на 2 ступени и сбивает её с толку
 * </p>
 */
public class Swagger extends StatusMove {

        @Override
        protected String describe() {

                return "used Swagger";

        }

        @Override
        protected void applyOppEffects(Pokemon p) {

                Effect e = new Effect();
                e.confuse(p);
                p.setMod(Stat.ATTACK, 2);

        }

        public Swagger() {

                super(Type.NORMAL, 0, 85);

        }

}
