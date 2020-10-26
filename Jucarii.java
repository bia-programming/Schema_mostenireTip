package com.company;

public class Jucarii extends Plastic {
    boolean copiiSubCinciAni;
    boolean instructiuniAsamblare;

    public Jucarii(int anAparitie, boolean calitate, String nume, String culoare, String tipMaterial, boolean copiiSubCinciAni, boolean instructiuniAsamblare) {
        super(anAparitie, calitate, nume, culoare, tipMaterial);
        this.copiiSubCinciAni = copiiSubCinciAni;
        this.instructiuniAsamblare = instructiuniAsamblare;
    }

    void showJucarii() {
        System.out.println("Este/ nu este pentru copii sub 5 ani: " + copiiSubCinciAni);
        System.out.println("Are/nu are instructiuni de asamblare: " + instructiuniAsamblare);
    }
}
