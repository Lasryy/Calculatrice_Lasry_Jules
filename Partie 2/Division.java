public class Division extends Operation {
    // Constructeur pour initialiser les opérandes
    public Division(Expression operande1, Expression operande2) throws IllegalArgumentException {
        super(operande1, operande2);
        if (operande2.valeur() == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
    }

    // Méthode pour effectuer la division et retourner le résultat
    @Override
    public double valeur() {
        return getOperande1().valeur() / getOperande2().valeur();
    }

    // Méthode pour retourner une représentation en chaîne de l'opération
    @Override
    public String toString() {
        return "(" + getOperande1() + " / " + getOperande2() + ")";
    }
}
