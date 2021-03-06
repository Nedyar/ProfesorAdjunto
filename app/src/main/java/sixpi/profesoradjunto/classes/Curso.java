package sixpi.profesoradjunto.classes;


import java.util.ArrayList;

/**
 * Created by rceb9hola on 10/03/2017.
 */

public class Curso {
    private String nombre;
    private Materia materia;
    private Profesor profesor;
    private ArrayList<Usuario> usuarios;
    private double precio;
    private String descripcion;
    private String destinado;
    private ArrayList<String> etiquetas;
    private int karma;

    public Curso(Materia m, Profesor p, float precio, String descripcion, String name, String des) {
        nombre = name;
        materia = m;
        profesor = p;
        usuarios = new ArrayList<>();
        this.precio = precio;
        this.descripcion = descripcion;
        destinado = des;
        etiquetas = new ArrayList<>();

    }

    public Materia getMateria() {
        return materia;
    }
    public void setMateria(Materia m){materia = m;}

    public String getNombre() {
        return nombre;
    }

    public String getDestinado() {
        return destinado;
    }


    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {

        profesor = p;

    }

    public ArrayList<Usuario> getUsuarios() {

        return usuarios;

    }

    public void setUsuarios(ArrayList<Usuario> u) {

        for (int i = 0; i < u.size(); i++) {

            usuarios.add(u.get(i));

        }

    }

    public double getPrecio() {

        return precio;
    }

    public void setPrecio(double p) {

        precio = p;

    }

    public String getDescripcion() {

        return descripcion;

    }

    public void setDescripcion(String d) {

        descripcion = d;
    }

    public ArrayList<String> getEtiquetas() {

        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> e) {

        for (int i = 0; i < e.size(); i++) {

            etiquetas.add(e.get(i));

        }


    }


    public int getKarma() {
        return karma;
    }


    public void setKarma(int k) {
        karma = k;
    }
}
