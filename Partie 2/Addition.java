public class Addition extends Operation {
    // Constructeur pour initialiser les opérandes
    public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    // Méthode pour effectuer l'addition et retourner le résultat
    @Override
    public double valeur() {
        return getOperande1().valeur() + getOperande2().valeur();
    }

    // Méthode pour retourner une représentation en chaîne de l'opération
    @Override
    public String toString() {
        return "(" + getOperande1() + " + " + getOperande2() + ")";
    }
}
