package com.company;

public class Plastic extends Magazin {
    String culoare;
    String tipMaterial; //exemplu: material PLA, sunt mai multe exemple

    public Plastic(int anAparitie, boolean calitate, String nume, String culoare, String tipMaterial) {
        super(anAparitie, calitate, nume);
        this.culoare = culoare;
        this.tipMaterial = tipMaterial;
    }

    void showPlastic() {
        System.out.println("Culoare: " + culoare);
        System.out.println("Tip material: " + tipMaterial);
    }
}
