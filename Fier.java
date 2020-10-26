package com.company;

public class Fier extends Metal {
    boolean prelucrat;
    int cantitate;

    public Fier(int anAparitie, boolean calitate, String nume, boolean esteScump, boolean esteRar, boolean prelucrat, int cantitate) {
        super(anAparitie, calitate, nume, esteScump, esteRar);
        this.prelucrat = prelucrat;
        this.cantitate = cantitate;
    }

    void showFier() {
        System.out.println("Este/nu este prelucrat: " + prelucrat);
        System.out.println("Cantitate: " + cantitate);
    }
}
