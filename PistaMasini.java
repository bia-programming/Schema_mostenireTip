package com.company;

public class PistaMasini extends Jucarii {
    float dimensiune;
    boolean esteInTrend;

    public PistaMasini(int anAparitie, boolean calitate, String nume, String culoare, String tipMaterial, boolean copiiSubCinciAni, boolean instructiuniAsamblare, float dimensiune, boolean esteInTrend) {
        super(anAparitie, calitate, nume, culoare, tipMaterial, copiiSubCinciAni, instructiuniAsamblare);
        this.dimensiune = dimensiune;
        this.esteInTrend = esteInTrend;
    }

    void show() {
        System.out.println("Dimensiune pista: " + dimensiune);
        System.out.println("Este in trend: " + esteInTrend);
    }
}
