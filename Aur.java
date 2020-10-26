package com.company;

public class Aur extends Metal {
    int gramaj;
    boolean AurPur;

    public Aur(int anAparitie, boolean calitate, String nume, boolean esteScump, boolean esteRar, int gramaj, boolean ePur) {
        super(anAparitie, calitate, nume, esteScump, esteRar);
        this.gramaj = gramaj;
        this.AurPur = ePur;
    }

    void showAur() {
        System.out.println("Gramaj: " + gramaj);
        System.out.println("Este/nu este pur: " + AurPur);
    }
}
