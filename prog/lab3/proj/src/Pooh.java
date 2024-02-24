package ru.ifmo.se.aidzoh.pooh;

public class Pooh {

        public static void main(String[] args) {

                VinnyPooh vin = new VinnyPooh();
                Piglet pig = new Piglet();
                ChristopherRobin rob = new ChristopherRobin();

                vin.run(Location.EDGE);
                pig.run(Location.EDGE);
                rob.run(Location.EDGE);

                vin.run(Location.GROVE);
                pig.run(Location.GROVE);
                rob.run(Location.GROVE);

                for(int i = 0; i < 10; i++) {
                        
                        rob.tellStory(StoryType.SAD, pig);
                        rob.tellStory(StoryType.SAD, vin);

                }

                System.out.println("Глаза Винни в " + vin.eyeSize + "% больше прежнего");
                System.out.println("Глаза Пятачка в " + pig.eyeSize + "% больше прежнего");

        }

}
