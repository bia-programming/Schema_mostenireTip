package com.company;

public class Main {

    public static void main(String[] args) {
        Furnizor furnizor = new Furnizor(2019, true, "Furnizor SRL", 2, true, 20);
        furnizor.showFurnizor();

        Mobila mobila = new Mobila(2010, true, "Mobila de lemn", "stejar", 2.10f, 1.20f, 2.15f, "De bucatarie", "Mobexpert");
        mobila.showMobila();

        Masa masa = new Masa(2019, true, "Masa de lemn", "stejar", 2.30f, 1.30f, 2.10f, "De bucatarie", "Mobexpert", true, false);
        masa.showMasa();

        Birou birou = new Birou(2016, true, "Birou de lemn", "stejar", 1.10f, 1.10f, 1.10f, "de birou", "Mobexpert", true, true);
        birou.showBirou();

        Dulap dulap = new Dulap(2005, true, "Dulap de lemn", "stejar", 2.15f, 1.90f, 2.20f, "dormitor", "Mobexpert", 2, true, 2);
        dulap.showDulap();

        Sticla sticla = new Sticla(2008, true, "Sticla de potasiu", 0.3f, 200);
        sticla.showSticla();

        SetPahare setPahare = new SetPahare(2015, true, "Sticla de potasiu", 0.2f, 150, true, "alb");
        setPahare.showSet();

        Cana cana = new Cana(2013, true, "Cana de sticla", 0.2f, 20, true, "rosu", true, true);
        cana.showCana();

        Jucarii jucarii = new Jucarii(2020, true, "Jucarii de plastic", "galben", "SLA", true, true);
        jucarii.showJucarii();

        PistaMasini pistaMasini = new PistaMasini(2020, true, "Pista masini de plastic", "rosu", "PLA", true, true, 0.5f, true);
        pistaMasini.show();

        Masinuta masinuta = new Masinuta(2018, true, "Masinuta de plastic", "albastru", "PLA", true, true, 0.15f, true, "BMW", 4);
        masinuta.showMasinuta();

        Surub surub = new Surub(2019, true, "Surub de fier", false, false, true, 200, true, false);
        surub.showSurub();

        Accesorii accesorii = new Accesorii(2020, true, "Accesorii de aur", true, true, 2, true, true, "Bratara");
        accesorii.showAccesorii();
    }
}
