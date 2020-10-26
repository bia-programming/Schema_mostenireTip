package com.company;

public class Metal extends Magazin {
    boolean esteScump;
    boolean esteRar;

    public Metal(int anAparitie, boolean calitate, String nume, boolean esteScump, boolean esteRar) {
        super(anAparitie, calitate, nume);
        this.esteScump = esteScump;
        this.esteRar = esteRar;
    }

    void showMetal() {
        System.out.println("Este/ nu este scump: " + esteScump);
        System.out.println("Este/nu este rar: " + esteRar);
    }
}
