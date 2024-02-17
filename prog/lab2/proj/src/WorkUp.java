package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.*;

/**
 * <p>Ход: Ободрение.
 * <br>Вид: Статусный ход
 * <br>Тип: Нормал
 * <br>Действие: Повышает собственную физическую и статусную атаку на одну ступень</p>
 */
public class WorkUp extends StatusMove {

        @Override
        protected String describe() {

                return "used Work Up";

        }

        @Override
        protected void applySelfEffects(Pokemon p) {

                p.setMod(Stat.SPECIAL_ATTACK, 1);
                p.setMod(Stat.ATTACK, 1);

        }
        
        public WorkUp() {

                super(Type.NORMAL, 0, 0);

        }

}
