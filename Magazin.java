package com.company;

public class Magazin {
    int anAparitie;
    boolean calitate;
    String nume;  //nume produs

    public Magazin(int anAparitie, boolean calitate, String nume) {
        this.anAparitie = anAparitie;
        this.calitate = calitate;
        this.nume = nume;
    }

    void showMagazin() {
        System.out.println("An aparitie: " + anAparitie);
        System.out.println("Calitate: " + calitate);
        System.out.println("Nume:" + nume);
    }
}
