package sixpi.profesoradjunto.classes;

/**
 * Created by rceb9 on 10/03/2017.
 */

public class Materia {

    private String nombre;
    private String categoria;


    public Materia(String n, String cat) {

        nombre = n;
        categoria = cat;

    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String n) {

        nombre = n;
    }

    public String getCategoria() {

        return categoria;
    }

    public void setCategoria(String c) {

        categoria = c;
    }



}

