package ru.ifmo.se.aidzoh.pooh;

public class Singing {

        interface Song {
               
                public void sing();

        }

        class SingSong implements Song {

                boolean currentlySinging = false;
                boolean currentlyRunning = false;
                boolean currentlyListening = false;
 
                public void sing() {

                        try {

                                if (currentlyRunning) {

                                        throw new RunningException("Певцы замолчали. Причина: они помчались");

                                }
                                if (currentlyListening) {

                                        throw new ListeningException("Певцы не могут петь. Причина: они слушают");

                                }
                                currentlySinging = true;
                                System.out.println("Певцы запели.");



                        } catch (RunningException e) {

                                System.out.println(e.getMessage());
                                currentlySinging = false;

                        } catch (ListeningException e) {

                                System.out.println(e.getMessage());
                                currentlySinging = false;

                        }

                }

                public void SingSong() {};

        }

        public void Singing() {};

}
