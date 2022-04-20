package src.lessonSix;

public enum Characteristics {

    NAME_CAR_ONE("Audi"),
    COLOR_CAR_ONE("Black"),
    NAME_CAR_TWO("Ford"),
    COLOR_CAR_TWO("Blue"),
    ;

    public final String condition;

    Characteristics(String condition) {
        this.condition = condition;
    }
}
