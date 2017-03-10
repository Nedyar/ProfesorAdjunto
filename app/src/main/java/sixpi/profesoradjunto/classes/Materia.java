package sixpi.profesoradjunto.classes;

/**
 * Created by rceb9 on 10/03/2017.
 */

public class Materia {

    private String nombre;
    private String descripcion;
    private int nivel;


    public Materia(String n, String desc, int dific) {

        nombre = n;
        descripcion = desc;
        nivel = dific;

    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String n) {

        nombre = n;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public void setDescripcion(String d) {

        descripcion = d;

    }

    public int getNivel() {

        return nivel;
    }

    public void setNivel(int n) {
        nivel = n;

    }

}

