package ru.ifmo.se.aidzoh.battle;

import ru.ifmo.se.pokemon.*;

/**<p>Покемон: Картана.
 * <br>Предок: -
 * <br>Потомок: -
 * <br>Тип: Травяной/Стальной
 * <br>Характеристики:
 * <br>&emsp;&emsp;-- Здоровье: 59
 * <br>&emsp;&emsp;-- Атака: 181
 * <br>&emsp;&emsp;-- Защита: 131
 * <br>&emsp;&emsp;-- Сп. Атака: 59
 * <br>&emsp;&emsp;-- Сп. Защита: 31
 * <br>&emsp;&emsp;-- Скорость: 109
 * <br>Способности:
 * <br>&emsp;&emsp;-- <a href="Screech.html">Визг</a>
 * <br>&emsp;&emsp;-- <a href="DarkPulse.html">Тёмный пульс</a>
 * <br>&emsp;&emsp;-- <a href="DazzlingGleam.html">Ослепляющая вспышка</a>
 * <br>&emsp;&emsp;-- <a href="ShadowSneak.html">Теневой удар</a>
 * </p>
 */
public class Kartana extends Pokemon {

        private void init() {

                Screech screech = new Screech();
                DarkPulse dark_pulse = new DarkPulse();
                DazzlingGleam dazzling_gleam = new DazzlingGleam();
                ShadowSneak shadow_sneak = new ShadowSneak();

                this.setType(Type.GRASS, Type.STEEL);             
                this.setStats(59, 181, 131, 59, 31, 109);
                
                this.addMove(screech);
                this.addMove(dark_pulse);
                this.addMove(dazzling_gleam);
                this.addMove(shadow_sneak);

        }

        /**
         * Создаёт Картану с именем "Безымянный" и уровнем 1
         */
        public Kartana() { super(); init(); }

        /**
         * Создаёт Картану с указанным именем и уровнем 1
         */
        public Kartana(String name, int level) { super(name, level); init(); }

}
