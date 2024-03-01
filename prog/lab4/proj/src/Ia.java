package ru.ifmo.se.aidzoh.pooh;

public class Ia extends RobinGroup {

        Location location = Location.GROVE;

        @Override
        public int hashCode() {

               int result = this.eyeSize; 
               return result;

        }

        @Override
        public boolean equals(Object o) {

                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                RobinGroup that = (RobinGroup) o;

                return this.location == that.location;

        }


        @Override
        public String toString() {
                return "Piglet{"
                                + "eyeSize=" + this.eyeSize
                                + ", location" + this.getLocation()
                                + '}';
        }
      
        public void run(Location where) {
                
                System.out.println("*Иа мчится*");

                this.location = where;

                System.out.println("Текущяя локация Иа - " + this.getLocation());

        }

        public void listen(StoryType t) {

                System.out.print("*Глаза Иа становятся ");

                switch (t) {

                        case SAD:
                                this.eyeSize += 10;
                                System.out.println("больше*");
                                break;

                        case INTERESTING:
                                this.eyeSize += 5;
                                System.out.println("больше*");
                                break;

                        case BORING:
                                if (this.eyeSize >= 5) {
                                        this.eyeSize -= 5;
                                        System.out.println("меньше*");
                                }
                                break;

                        case FUNNY:
                                if (this.eyeSize >= 10) {
                                        this.eyeSize -= 10;
                                        System.out.println("меньше*");
                                }
                                break;

                }

        }

        public void sayPhrase() {
                
                System.out.println("- Как раз тут");

        }

        public Ia() {}

}
