package ru.ifmo.se.aidzoh.pooh;

enum StoryType {

        FUNNY(-10),
        BORING(-5),
        INTERESTING(5),
        SAD(10);

        private int value;

        private StoryType(int value) {
                this.value = value;
        }

        protected int getValue() {
                return value;
        }

}
