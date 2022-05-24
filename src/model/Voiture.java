package model;

import java.util.Random;

public class Voiture {
    private String marque;
    private String modele;
    private int vitMin;
    private int vitMax;

    private Random rand;

    public Voiture(String marque, String modele, int vitMin, int vitMax) {
        this.marque = marque;
        this.modele = modele;
        this.vitMin = vitMin;
        this.vitMax = vitMax;
        this.rand = new Random();
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getVitMin() {
        return vitMin;
    }

    public void setVitMin(int vitMin) {
        this.vitMin = vitMin;
    }

    public int getVitMax() {
        return vitMax;
    }

    public void setVitMax(int vitMax) {
        this.vitMax = vitMax;
    }

    public int obtenirVitesse() {
        return rand.nextInt(this.vitMin, this.vitMax);
    }

    @Override
    public String toString() {
        return String.format("%s | %s", this.marque, this.modele);
    }
}
