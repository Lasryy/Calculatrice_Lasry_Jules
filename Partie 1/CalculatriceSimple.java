public class CalculatriceSimple {
    public static void main(String[] args) {
        try {
            // Création des instances de Nombre
            Nombre six = new Nombre(6);
            Nombre dix = new Nombre(10);
            Nombre zero = new Nombre(0);

            // Test de la soustraction
            Operation s = new Soustraction(dix, six);
            System.out.println(s + " = " + s.valeur()); // doit afficher : (10 - 6) = 4

            // Test de l'addition
            Operation a = new Addition(dix, six);
            System.out.println(a + " = " + a.valeur()); // doit afficher : (10 + 6) = 16

            // Test de la multiplication
            Operation m = new Multiplication(dix, six);
            System.out.println(m + " = " + m.valeur()); // doit afficher : (10 * 6) = 60

            // Test de la division
            Operation d = new Division(dix, six);
            System.out.println(d + " = " + d.valeur()); // doit afficher : (10 / 6) = 1

            // Test de la division par zéro - cela va lancer une IllegalArgumentException
            Operation dz = new Division(dix, zero);
            System.out.println(dz + " = " + dz.valeur());

        } catch (IllegalArgumentException e) {
            // Gestion de l'exception pour la division par zéro
            System.err.println("Erreur: " + e.getMessage());
        }
    }
}
