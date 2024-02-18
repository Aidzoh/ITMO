package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


/**
 * <p>Ход: Ослепляющая вспышка.
 * <br>Вид: Специальная атака
 * <br>Тип: Волшеб
 * <br>Точность: 100%
 * <br>Сила: 80
 * <br>Действие: Наносит специальный урон
 * </p>
 */
public class DazzlingGleam extends SpecialMove {

        @Override
        protected String describe() {

                return "used Dazzling Gleam";

        } 

        public DazzlingGleam() {

                super(Type.FAIRY, 80, 100);

        }

}
