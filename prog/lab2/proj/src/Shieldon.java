package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.*;


/**<p>Покемон: Шилдон.
 * <br>Предок: -
 * <br>Потомок: <a href="Boldore.html">Болдор</a>
 * <br>Тип: Каменный/Стальной
 * <br>Характеристики:
 * <br>&emsp;&emsp;-- Здоровье: 30
 * <br>&emsp;&emsp;-- Атака: 42
 * <br>&emsp;&emsp;-- Защита: 118
 * <br>&emsp;&emsp;-- Сп. Атака: 42
 * <br>&emsp;&emsp;-- Сп. Защита: 88
 * <br>&emsp;&emsp;-- Скорость: 30
 * <br>Способности:
 * <br>&emsp;&emsp;-- <a href="Rest.html">Отдых</a>
 * <br>&emsp;&emsp;-- <a href="WorkUp.html">Ободрение</a>
 * <br>&emsp;&emsp;-- <a href="Swagger.html">Щегольство</a>
 * </p>
 */
public class Shieldon extends Pokemon {

        private void init() {

                Rest rest = new Rest();
                WorkUp work_up = new WorkUp();
                Swagger swagger = new Swagger();

                this.setType(Type.ROCK, Type.STEEL);

                this.addMove(rest);
                this.addMove(work_up);
                this.addMove(swagger);

                this.setStats(30, 42, 118, 42, 88, 30);

        }

        /**
         * Создаёт Шилдона с именем "Безымянный" и уровнем 1
         */
        public Shieldon() { super(); init(); }

        /**
         * Создаёт Шилдона с указанным именем и уровнем 1
         */
        public Shieldon(String name, int level) { super(name, level); init(); }

}
