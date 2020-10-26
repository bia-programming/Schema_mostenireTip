package com.company;

public class Furnizor extends Magazin {
    int nrZilePeComanda;
    boolean livrare;
    int comenzi;

    public Furnizor(int anAparitie, boolean calitate, String nume, int nrZilePeComanda, boolean livrare, int comenzi) {
        super(anAparitie, calitate, nume);
        this.nrZilePeComanda = nrZilePeComanda;
        this.livrare = livrare;
        this.comenzi = comenzi;
    }

    void showFurnizor() {
        System.out.println("Nr zile/ comanda:" + nrZilePeComanda);
        System.out.println("Are/nu are livrare:" + livrare);
    }
}
