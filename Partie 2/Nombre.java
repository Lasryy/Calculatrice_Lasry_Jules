public class Nombre extends Expression {
    // Attribut pour stocker la valeur du nombre
    private int valeurNombre;

    // Constructeur pour initialiser la valeur du nombre
    public Nombre(int valeurNombre) {
        this.valeurNombre = valeurNombre;
    }

    // Méthode pour retourner la valeur du nombre
    @Override
    public int valeur() {
        return valeurNombre;
    }

    // Méthode pour retourner la représentation en chaîne de la valeur du nombre
    @Override
    public String toString() {
        return Integer.toString(valeurNombre);
    }
}
