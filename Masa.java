package com.company;

public class Masa extends Mobila {
    boolean moderna;
    boolean vintage;

    public Masa(int anAparitie, boolean calitate, String nume, String tip, float lungime, float latime, float inaltime, String tipModel, String brand, boolean moderna, boolean vintage) {
        super(anAparitie, calitate, nume, tip, lungime, latime, inaltime, tipModel, brand);
        this.moderna = moderna;
        this.vintage = vintage;
    }

    void showMasa() {
        System.out.println("E moderna/nu e moderna: " + moderna);
        System.out.println("E vintage/ nu e vintage: " + vintage);
    }
}
