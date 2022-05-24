package model;

import java.util.ArrayList;

public class Participant {
    private String nom;
    private Voiture voiture;
    private final ArrayList<Double> listeTemps; // en secondes

    public Participant(String nom, Voiture voiture) {
        this.nom = nom;
        this.voiture = voiture;
        this.listeTemps = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public ArrayList<Double> getListeTemps() {
        return listeTemps;
    }

    private void addTemps(double temps) {
        this.listeTemps.add(temps);
    }

    public double getTempsTotal() {
        double total = 0;
        for (double t : this.listeTemps) {
            total += t;
        }
        return total;
    }

    public void faireUnTour(Circuit circuit) {
        double vitesse = this.voiture.obtenirVitesse() / 3.6;
        int distance = circuit.getDistance();

        double temps = distance / vitesse;
        this.addTemps(temps);
    }

    @Override
    public String toString() {
        return "Participant " + this.getNom();
    }
}
