package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

import java.util.Random;

/**
 * <p>Ход: Удар накрест.
 * <br>Вид: Физическая атака
 * <br>Тип: Боевой
 * <br>Точность: 80%
 * <br>Сила: 100
 * <br>Действие: Наносит физический урон с повышенным шансом критической атаки
 * </p>
 */
public class CrossChop extends PhysicalMove {

        @Override
        protected String describe() {

                return "used Cross Chop";

        }

        @Override
        protected double calcCriticalHit(Pokemon att, Pokemon def) {
                
                boolean val = new Random().nextInt(512)
                                           <= (att.getStat(Stat.SPEED)
                                              -def.getStat(Stat.SPEED))*3;


                return 1 + (val ? 1 : 0);

        }

        public CrossChop() {

                super(Type.FIGHTING, 100, 80);

        }

}
