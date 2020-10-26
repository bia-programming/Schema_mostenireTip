package com.company;

public class Cana extends SetPahare {
    boolean areModel;
    boolean areMesaj;

    public Cana(int anAparitie, boolean calitate, String nume, double grosime, int pret, boolean areReducere, String culoare, boolean areModel, boolean areMesaj) {
        super(anAparitie, calitate, nume, grosime, pret, areReducere, culoare);
        this.areModel = areModel;
        this.areMesaj = areMesaj;
    }

    void showCana() {
        System.out.println("Are/ nu are model: " + areModel);
        System.out.println("Are/ nu are mesaj: " + areMesaj);
    }
}
