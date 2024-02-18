package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

/**
 * <p>Ход: Отдых.
 * <br>Вид: Статусный ход
 * <br>Тип: Психо
 * <br>Действие: Покемон полностью вылечивает себя и засыпает на два хода
 * </p>
 */
public class Rest extends StatusMove {

        @Override
        protected String describe() {

                return "used Rest";

        }

        @Override
        protected void applySelfEffects(Pokemon p) {

                Effect e = new Effect();

                p.restore();

                e.sleep(p);

        }

        public Rest() {

                super(Type.PSYCHIC, 0, 0);

        }

}
