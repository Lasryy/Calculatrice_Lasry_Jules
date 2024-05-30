abstract class Operation {
    // Attributs pour stocker les opérandes de type Nombre
    private Nombre operande1;
    private Nombre operande2;

    // Constructeur pour initialiser les opérandes
    public Operation(Nombre operande1, Nombre operande2) {
        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    // Méthode abstraite pour retourner la valeur de l'opération
    public abstract int valeur();

    // Méthode pour obtenir le premier opérande
    public Nombre getOperande1() {
        return operande1;
    }

    // Méthode pour obtenir le deuxième opérande
    public Nombre getOperande2() {
        return operande2;
    }
}
