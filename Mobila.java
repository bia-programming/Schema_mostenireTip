package com.company;

public class Mobila extends Lemn {
    String tipModel;
    String brand;

    public Mobila(int anAparitie, boolean calitate, String nume, String tip, float lungime, float latime, float inaltime, String tipModel, String brand) {
        super(anAparitie, calitate, nume, tip, lungime, latime, inaltime);
        this.tipModel = tipModel;
        this.brand = brand;
    }

    void showMobila() {
        System.out.println("Tip mobila: " + tipModel);
        System.out.println("Brand: " + brand);
    }
}
