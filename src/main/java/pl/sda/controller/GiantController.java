package pl.sda.controller;

import pl.sda.model.*;
import pl.sda.view.GiantView;

public class GiantController {

    private GiantModel giantModel;
    private GiantView giantView;

    public GiantController(GiantModel giantModel, GiantView giantView) {
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public Health getHealth() {
        return giantModel.getHealth();
    }

    public void setHealth(Health health) {
        giantModel.setHealth(health);
    }

    public Fatigue getFatigue() {
        return giantModel.getFatigue();
    }

    public void setFatigue(Fatigue fatigue) {
        giantModel.setFatigue(fatigue);
    }

    public Nourishment getNourishment() {
        return giantModel.getNourishment();
    }

    public void setNourishment(Nourishment nourishment) {
        giantModel.setNourishment(nourishment);
    }

    public void updateView() {

    }
}
