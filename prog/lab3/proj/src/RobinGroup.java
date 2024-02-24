package ru.ifmo.se.aidzoh.pooh;

public abstract class RobinGroup implements canRun,canListen {

        int eyeSize = 100;
        Location location = Location.EDGE;

        public String getLocation() {
                
                String res = "";

                switch (this.location) {
                        
                        case DEFAULT:
                                res = "Локация по умолчанию";
                                break;
                        case EDGE:
                                res = "Опушка";
                                break;
                        case GROVE:
                                res = "Роща";
                                break;

                }               

                return res;

        }

}
