public class TestOperation {
    public static void main(String[] args) {
        try {
            // Création des instances de Nombre
            Expression deux = new Nombre(2);
            Expression trois = new Nombre(3);
            Expression dixSept = new Nombre(17);

            // Création des opérations
            Expression s = new Soustraction(dixSept, deux);
            Expression a = new Addition(deux, trois);
            Expression d = new Division(s, a);

            // Affichage du résultat
            System.out.println(d + " = " + d.valeur()); // doit afficher : ((17.0 - 2.0) / (2.0 + 3.0)) = 3.0

        } catch (IllegalArgumentException e) {
            // Gestion de l'exception pour la division par zéro
            System.err.println("Erreur: " + e.getMessage());
        }   
    }
    
       /* 
        public static Expression fabriqueExpression(String e) {

            Pas réussi

        }*/ 
}
