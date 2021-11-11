package mx.edu.tesoem.isc.tarea6;

public class Datos {
    String nombre;
    String colorFavorito;
    String numFavorito;
    String comidaFavorita;
    public Datos(String nom, String color, String comida, String num){
        nombre = nom;
        colorFavorito = color;
        numFavorito = num;
        comidaFavorita = comida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColorFavorito(String colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

    public String getColorFavorito() {
        return colorFavorito;
    }

    public void setNumeroFavorito(String numeroFavorito) {
        this.numFavorito = numeroFavorito;
    }

    public String getNumeroFavorito() {
        return numFavorito;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }
}
