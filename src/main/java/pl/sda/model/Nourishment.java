package pl.sda.model;

public enum Nourishment {

    NOURISHED("nourished"),
    HUNGRY("hungry");


    private String title;

    Nourishment(String title) {
        this.title = title;
    }
}
