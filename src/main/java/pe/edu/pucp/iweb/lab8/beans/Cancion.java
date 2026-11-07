package pe.edu.pucp.iweb.lab8.beans;

/**
 * Ejercicio 2: bean Cancion.
 */
public class Cancion {
    private String idCancion;
    private String titulo;
    private String artista;
    private int duracionSeg;
    private String anio;
    private Genero genero;


    // TODO: atributos idCancion, titulo, artista, duracionSeg, anio
    //          y genero (de tipo Genero)

    // TODO: getters y setters

    /**
     * TODO: retornar la duración en formato m:ss
     *          (354 segundos -> "5:54", 200 segundos -> "3:20").
     */
    public String getDuracionFormateada() {
        int duracionMin = (int)(duracionSeg / 60);
        System.out.println("Duracion: " + duracionMin + ":" + duracionSeg);
        return  duracionMin + ":" + duracionSeg;
    }
}
