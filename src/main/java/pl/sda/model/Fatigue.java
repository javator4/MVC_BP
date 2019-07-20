package pl.sda.model;

public enum Fatigue {

    TIRED("tired"),
    NOTIRED("not tired");


    private String title;

    Fatigue(String title) {
        this.title = title;
    }
}
