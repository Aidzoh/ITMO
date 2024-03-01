package ru.ifmo.se.aidzoh.pooh;

public class ChristopherRobin extends RobinGroup {

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
                return "ChristopherRobin{"
                        + "eyeSize=" + this.eyeSize
                        + ", location" + this.getLocation()
                        + '}';
        }


        public void listen(StoryType t) {

                System.out.print("*Глаза Кристофера Робина становятся ");

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

        public void run(Location where) {

                System.out.print("*Кристофер Робин мчится*");

                this.location = where;

                System.out.println("Текущяя локация Робина - " + this.getLocation());

        }



        public void tellStory(StoryType storyType, RobinGroup r) {

                System.out.println("*Кристофер Робин рассказывает историю*");

                r.listen(storyType);

        }

        public void sayPhrase() {}

        public ChristopherRobin() {}

}
