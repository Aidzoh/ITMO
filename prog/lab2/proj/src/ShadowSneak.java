package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.*;

/**
 * <p>Ход: Теневой удар.
 * <br>Вид: Физическая атака
 * <br>Тип: Призр
 * <br>Точность: 100%
 * <br>Сила: 40
 * <br>Действие: Наносит физический урон с повышенным приоритетом
 */
public class ShadowSneak extends PhysicalMove {

        @Override
        protected String describe() {

                return "used Shadow Sneak";

        }

        public ShadowSneak() {

                super(Type.GHOST, 40, 100, 1, 1);

        }

}
