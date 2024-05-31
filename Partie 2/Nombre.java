public class Nombre {
    // Attribut pour stocker le nombre
    private int valeurNombre;

    // Initialise la valeur nombre
    public Nombre(int valeurNombre) {
        this.valeurNombre = valeurNombre;
    }

    // Methode pour retourner la valeur du nombre
    public int valeur() {
        return this.valeurNombre;
    }

    // Retourne la chaine de caractère représentant le nombre
    @Override
    public String toString() {
        return Integer.toString(valeurNombre);
    }
}