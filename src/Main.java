import model.Circuit;
import model.Course;
import model.Participant;
import model.Voiture;

public class Main {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Audi", "A5", 100, 200);
        Voiture v2 = new Voiture("Peugeot", "207", 80, 180);
        Circuit c1 = new Circuit("Spa", 7008);
        Participant p1 = new Participant("David", v1);
        Participant p2 = new Participant("Jacques", v2);
        Course course = new Course("24h", 5, c1);
        course.addParticipant(p1);
        course.addParticipant(p2);
        course.faireLaCourse();
        for (int i = 0; i < course.getNbrTour(); i++) {
            course.afficherUnTour(i);
        }
        Participant vainqueur = course.getVainqueur();
        System.out.println("Le vainqueur est " + vainqueur.getNom());
//        String présentationAudi = v1.toString();
    }
}