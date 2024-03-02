package ru.ifmo.se.aidzoh.pooh;

abstract class Friends implements canRun,canListen {

        int eyeSize = 100;

        Location location = Location.EDGE;

        protected String getLocation() {
                
                return this.location.getValue();

        }

}
