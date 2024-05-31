public class Nombre extends Expression {
    // Attribut pour stocker la valeur du nombre
    private double valeurNombre;

    // Constructeur pour initialiser la valeur du nombre
    public Nombre(double valeurNombre) {
        this.valeurNombre = valeurNombre;
    }

    // Méthode pour retourner la valeur du nombre
    @Override
    public double valeur() {
        return valeurNombre;
    }

    // Méthode pour retourner la représentation en chaîne de la valeur du nombre
    @Override
    public String toString() {
        return Double.toString(valeurNombre);
    }
}
