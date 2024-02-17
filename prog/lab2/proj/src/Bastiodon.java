package ru.ifmo.se.aidzoh.battle;

/**<p>Покемон: Бастиодон.
 * <br>Предок: <a href="Shieldon.html">Шилдон</a>
 * <br>Потомок: -
 * <br>Тип: Каменный/Стальной
 * <br>Характеристики:
 * <br>&emsp;&emsp;-- Здоровье: 60
 * <br>&emsp;&emsp;-- Атака: 52
 * <br>&emsp;&emsp;-- Защита: 168
 * <br>&emsp;&emsp;-- Сп. Атака: 47
 * <br>&emsp;&emsp;-- Сп. Защита: 138
 * <br>&emsp;&emsp;-- Скорость: 30
 * <br>Способности:
 * <br>&emsp;&emsp;-- <a href="Rest.html">Отдых</a>
 * <br>&emsp;&emsp;-- <a href="WorkUp.html">Ободрение</a>
 * <br>&emsp;&emsp;-- <a href="Swagger.html">Щегольство</a>
 * <br>&emsp;&emsp;-- <a href="LowSweep.html">Удар в ноги</a>
 * </p>
 */
public class Bastiodon extends Shieldon {

        private void init() {

                LowSweep low_sweep = new LowSweep();

                this.setStats(60, 52, 168, 47, 138, 30);

                this.addMove(low_sweep);

        }

        /**
         * Создаёт Бастиодона с именем "Безымянный" и уровнем 1
         */
        public Bastiodon() { super(); init(); }
       
        /**
         * Создаёт Бастиодона с указанным именем и уровнем
         */
        public Bastiodon(String name, int level) { super(name, level); init(); }

}
