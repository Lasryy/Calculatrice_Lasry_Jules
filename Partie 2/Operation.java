abstract class Operation {
    // Attributs pour stocker les opérandes de type Nombre
    private Expression operande1;
    private Expression operande2;
    
    // Constructeur pour initialiser les opérandes
    public Operation(Expression operande1, Expression operande2) {
        this.operande1 = operande1;
        this.operande2 = operande2;
    }
    
    // Méthode pour obtenir le premier opérande
    public Expression getOperande1() {
        return operande1;
    }
    
    // Méthode pour obtenir le deuxième opérande
    public Expression getOperande2() {
        return operande2;
    }
}
                                            
