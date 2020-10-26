package com.company;

public class Accesorii extends Aur {
    boolean modelNou;
    String tipAccesoriu;

    public Accesorii(int anAparitie, boolean calitate, String nume, boolean esteScump, boolean esteRar, int gramaj, boolean ePur, boolean modelNou, String tipAccesoriu) {
        super(anAparitie, calitate, nume, esteScump, esteRar, gramaj, ePur);
        this.modelNou = modelNou;
        this.tipAccesoriu = tipAccesoriu;
    }

    void showAccesorii() {
        System.out.println("Este/nu este model nou: " + modelNou);
        System.out.println("Tip accesoriu: " + tipAccesoriu);
    }
}
