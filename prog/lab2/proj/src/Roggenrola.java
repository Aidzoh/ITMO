package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.*;

/**<p>Покемон: Роггенрола.
 * <br>Предок: -
 * <br>Потомок: <a href="Boldore.html">Болдор</a>
 * <br>Тип: Каменный/Стальной
 * <br>Характеристики:
 * <br>&emsp;&emsp;-- Здоровье: 55
 * <br>&emsp;&emsp;-- Атака: 75
 * <br>&emsp;&emsp;-- Защита: 85
 * <br>&emsp;&emsp;-- Сп. Атака: 25
 * <br>&emsp;&emsp;-- Сп. Защита: 25
 * <br>&emsp;&emsp;-- Скорость: 15
 * <br>Способности:
 * <br>&emsp;&emsp;-- <a href="Confide.html">Секрет</a>
 * <br>&emsp;&emsp;-- <a href="Swagger.html">Щегольство</a>
 * </p>
 */
public class Roggenrola extends Pokemon{


        private void init() {

                Swagger swagger = new Swagger();
                Confide confide = new Confide();

                this.setType(Type.ROCK);             

                this.addMove(swagger);
                this.addMove(confide);

                this.setStats(55, 75, 85, 25, 25, 15);

        }

        /**
         * Создаёт Роггенролу с именем "Безымянный" и уровнем 1
         */
        public Roggenrola() { super(); init(); }

        /**
         * Создаёт Роггенролу с указанным именем и уровнем 1
         */
        public Roggenrola(String name, int level) { super(name, level); init(); }

}
