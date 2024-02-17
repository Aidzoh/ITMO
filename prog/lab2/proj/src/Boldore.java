package ru.ifmo.se.aidzoh.battle;

/**<p>Покемон: Болдор.
 * <br>Предок: <a href="Roggenrola.html">Роггенрола</a>
 * <br>Потомок: <a href="Gigalith.html">Гигалит</a>
 * <br>Тип: Каменный
 * <br>Характеристики:
 * <br>&emsp;&emsp;-- Здоровье: 70
 * <br>&emsp;&emsp;-- Атака: 105
 * <br>&emsp;&emsp;-- Защита: 105
 * <br>&emsp;&emsp;-- Сп. Атака: 50
 * <br>&emsp;&emsp;-- Сп. Защита: 40
 * <br>&emsp;&emsp;-- Скорость: 20
 * <br>Способности:
 * <br>&emsp;&emsp;-- <a href="Confide.html">Секрет</a>
 * <br>&emsp;&emsp;-- <a href="Swagger.html">Щегольство</a>
 * <br>&emsp;&emsp;-- <a href="DarkPulse.html">Тёмный Пульс</a>
 * </p>
 */
public class Boldore extends Roggenrola {


        private void init() {

                DarkPulse dark_pulse = new DarkPulse();

                this.addMove(dark_pulse);

                this.setStats(70, 105, 105, 50, 40, 20);

        }
        
        /**
         * Создаёт Болдора с именем "Безымянный" и уровнем 1
         */
        public Boldore() { super(); init(); }
        
        /**
         * Создаёт Болдора с указанным именем и уровнем
         */
        public Boldore(String name, int level) { super(name, level); init(); }

}
