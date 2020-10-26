package com.company;

public class Surub extends Fier {
    boolean set; //face parte dintr-un set
    boolean areRugina;

    public Surub(int anAparitie, boolean calitate, String nume, boolean esteScump, boolean esteRar, boolean prelucrat, int cantitate, boolean set, boolean areRugina) {
        super(anAparitie, calitate, nume, esteScump, esteRar, prelucrat, cantitate);
        this.set = set;
        this.areRugina = areRugina;
    }

    void showSurub() {
        System.out.println("Este/nu este intr-un set: " + set);
        System.out.println("Este/nu este ruginit: " + areRugina);
    }
}
