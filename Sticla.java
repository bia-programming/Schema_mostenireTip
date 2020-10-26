package com.company;

public class Sticla extends Magazin {
    double grosime;
    int pret;

    public Sticla(int anAparitie, boolean calitate, String nume, double grosime, int pret) {
        super(anAparitie, calitate, nume);
        this.grosime = grosime;
        this.pret = pret;
    }

    void showSticla() {
        System.out.println("Grosime: " + grosime);
        System.out.println("Lungime: " + pret);
    }
}
