package com.company;

public class Lemn extends Magazin {
    String tip;//tipLemn
    float lungime;
    float latime;
    float inaltime;

    public Lemn(int anAparitie, boolean calitate, String nume, String tip, float lungime, float latime, float inaltime) {
        super(anAparitie, calitate, nume);
        this.tip = tip;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    void showLemn() {
        System.out.println("Tip lemn:" + tip);
        System.out.println("Lungime:" + lungime);
        System.out.println("Latime:" + latime);
        System.out.println("Inaltime:" + inaltime);
    }
}
