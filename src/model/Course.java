package model;

import java.util.ArrayList;

public class Course {
    private String nom;
    private int nbrTour;
    private Circuit circuit;
    private final ArrayList<Participant> participants;

    public Course(String nom, int nbrTour, Circuit circuit) {
        this.nom = nom;
        this.nbrTour = nbrTour;
        this.circuit = circuit;
        this.participants = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public void addParticipant(Participant participant) {
        this.participants.add(participant);
    }

    private void realiserUnTour() {
        for (Participant p : this.participants) {
            p.faireUnTour(this.circuit);
        }
    }

    public void faireLaCourse() {
        for (int i = 0; i < this.nbrTour; i++) {
            this.realiserUnTour();
        }
    }

    public Participant getVainqueur() {
        Participant gagnant = this.participants.get(0);
        for (int i = 1; i < this.participants.size(); i++) {
            if (this.participants.get(i).getTempsTotal() < gagnant.getTempsTotal()) {
                gagnant = this.participants.get(i);
            }
        }
        return gagnant;
    }

    public void afficherUnTour(int tour) {
        for (Participant p : this.participants) {
            System.out.printf("%s a réalisé le tour %s en %s \n",
                    p.getNom(), tour, p.getListeTemps().get(tour));
        }
    }
}
