package ru.ifmo.se.aidzoh.pooh;

enum Location {

        DEFAULT("Локация по умолчанию"),
        EDGE("Опушка"),
        GROVE("Роща");

        private String value;

        private Location(String value) {
                this.value = value;
        }

        protected String getValue() {
                return value;
        }

}
