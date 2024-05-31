abstract class Operation extends Expression {
    // Attributs pour stocker les opérandes de type Expression
    private Expression operande1;
    private Expression operande2;

    // Constructeur pour initialiser les opérandes
    public Operation(Expression operande1, Expression operande2) {
        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    // Méthodes pour obtenir les opérandes
    public Expression getOperande1() {
        return operande1;
    }

    public Expression getOperande2() {
        return operande2;
    }
}
