class Soustraction extends Operation {
    // Constructeur pour initialiser les opérandes
    public Soustraction(Nombre operande1, Nombre operande2) {
        super(operande1, operande2);
    }

    // Méthode pour effectuer la soustraction et retourner le résultat
    @Override
    public int valeur() {
        return getOperande1().valeur() - getOperande2().valeur();
    }

    // Méthode pour retourner une représentation en chaîne de l'opération
    @Override
    public String toString() {
        return "(" + getOperande1() + " - " + getOperande2() + ")";
    }
}
