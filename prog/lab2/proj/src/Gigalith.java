package ru.ifmo.se.aidzoh.battle;

/**<p>Покемон: Гигалит.
 * <br>Предок: <a href="Boldore.html">Болдор</a>
 * <br>Потомок: -
 * <br>Тип: Каменный
 * <br>Характеристики:
 * <br>&emsp;&emsp;-- Здоровье: 80
 * <br>&emsp;&emsp;-- Атака: 135
 * <br>&emsp;&emsp;-- Защита: 130
 * <br>&emsp;&emsp;-- Сп. Атака: 60
 * <br>&emsp;&emsp;-- Сп. Защита: 80
 * <br>&emsp;&emsp;-- Скорость: 25
 * <br>Способности:
 * <br>&emsp;&emsp;-- <a href="Confide.html">Секрет</a>
 * <br>&emsp;&emsp;-- <a href="Swagger.html">Щегольство</a>
 * <br>&emsp;&emsp;-- <a href="DarkPulse.html">Тёмный пульс</a>
 * <br>&emsp;&emsp;-- <a href="CrossChop.html">Удар накрест</a>
 * </p>
 */
public class Gigalith extends Boldore {

        private void init() {

                CrossChop cross_chop = new CrossChop();

                this.setStats(80, 135, 130, 60, 80, 25);

                this.addMove(cross_chop);

        }

        /**
         * Создаёт Гигалита с именем "Безымянный" и уровнем 1
         */
        public Gigalith() { super(); init(); }

        /**
         * Создаёт Гигалита с указанным именем и уровнем
         */
        public Gigalith(String name, int level) { super(name, level); init(); }

}
