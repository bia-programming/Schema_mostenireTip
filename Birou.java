package com.company;

public class Birou extends Mobila {
    boolean areSertare;
    boolean suport;

    public Birou(int anAparitie, boolean calitate, String nume, String tip, float lungime, float latime, float inaltime, String tipModel, String brand, boolean areSertare, boolean suport) {
        super(anAparitie, calitate, nume, tip, lungime, latime, inaltime, tipModel,brand);
        this.areSertare = areSertare;
        this.suport = suport;
    }

    void showBirou(){
        System.out.println("Are/nu are sertare: "+areSertare);
        System.out.println("Are/ nu are suport: "+suport);
    }
}
