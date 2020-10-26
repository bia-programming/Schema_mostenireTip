package com.company;

public class SetPahare extends Sticla {
    boolean areReducere;
    String culoare;

    public SetPahare(int anAparitie, boolean calitate, String nume, double grosime, int pret, boolean areReducere, String culoare) {
        super(anAparitie, calitate, nume, grosime, pret);
        this.areReducere = areReducere;
        this.culoare = culoare;
    }

    void showSet() {
        System.out.println("Are/nu are reducere: " + areReducere);
        System.out.println("Culoare: " + culoare);
    }
}
