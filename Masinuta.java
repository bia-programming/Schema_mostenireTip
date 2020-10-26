package com.company;

public class Masinuta extends PistaMasini {
    String brandMasina;
    int nrUsi;

    public Masinuta(int anAparitie, boolean calitate, String nume, String culoare, String tipMaterial, boolean copiiSubCinciAni, boolean instructiuniAsamblare, float dimensiune, boolean esteInTrend, String brandMasina, int nrUsi) {
        super(anAparitie, calitate, nume, culoare, tipMaterial, copiiSubCinciAni, instructiuniAsamblare, dimensiune, esteInTrend);
        this.brandMasina = brandMasina;
        this.nrUsi = nrUsi;
    }

    void showMasinuta() {
        System.out.println("Brand masinuta: " + brandMasina);
        System.out.println("Numar usi: " + nrUsi);
    }
}
