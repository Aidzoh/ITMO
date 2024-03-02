package ru.ifmo.se.aidzoh.pooh;


class Pooh {

        public static void main(String[] args) {
                
                VinnyPooh vin = new VinnyPooh();
                Piglet pig = new Piglet();
                ChristopherRobin rob = new ChristopherRobin();
                Singing sng = new Singing(); 
                Singing.SingSong song = sng.new SingSong();
                Friends[] frnds = {vin, pig, rob};

                song.sing();

                for (int i = 0; i < frnds.length; i++) { frnds[i].run(Location.EDGE, song); }

                for (int i = 0; i < frnds.length; i++) { frnds[i].run(Location.GROVE, song); }

                song.sing();

                for (int i = 0; i < 10; i++) {

                        rob.tellStory(StoryType.SAD, song, vin, pig);

                }

                System.out.println("Глаза Винни в " + vin.eyeSize + "% больше прежнего\n"
                                 + "Глаза Пятачка в " + pig.eyeSize + "% больше прежнего");


        }


}
