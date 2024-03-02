package ru.ifmo.se.aidzoh.pooh;

class Piglet extends Friends {

        @Override
        public int hashCode() {

               int result = this.eyeSize; 
               return result;

        }

        @Override
        public boolean equals(Object o) {

                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Friends that = (Friends) o;

                return this.location == that.location;

        }


        @Override
        public String toString() {
                return "Piglet{"
                                + "eyeSize=" + this.eyeSize
                                + ", location=" + this.getLocation()
                                + '}';
        }
      
        public void run(Location where, Singing.SingSong s) {
                
                s.currentlyRunning = true;

                this.location = where;

                System.out.println("*Пятачок мчится*\n"
                                + "Текущяя локация Пятачка - " + this.getLocation());

        }

        public void listen(StoryType t, Singing.SingSong s) {

                s.currentlyListening = true;

                System.out.print("*Глаза Пятачка становятся ");

                this.eyeSize += t.getValue();

                System.out.println( t.getValue() >= 0 ? "больше*" : "меньше*" );

        }

        public void stopRunning(Singing.SingSong s) {

                s.currentlyRunning = false;

        }

        public void stopListening(Singing.SingSong s) {

                s.currentlyListening = false;

        }
        public Piglet() {}

}
