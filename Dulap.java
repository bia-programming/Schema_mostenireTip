package com.company;

public class Dulap extends Mobila {
    int usi;
    boolean areOglinda;
    int raft;

    public Dulap(int anAparitie, boolean calitate, String nume, String tip, float lungime, float latime, float inaltime, String tipModel, String brand, int usi, boolean areOglinda, int raft) {
        super(anAparitie, calitate, nume, tip, lungime, latime, inaltime, tipModel, brand);
        this.usi = usi;
        this.areOglinda = areOglinda;
        this.raft = raft;
    }

    void showDulap() {
        System.out.println("Nr usi: " + usi);
        System.out.println("Are/ nu are oglinda: " + areOglinda);
        System.out.println("Nr rafturi: " + raft);
    }
}
