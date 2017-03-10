package sixpi.profesoradjunto.classes;

/**
 * Created by David on 10/03/2017.
 */

public class Usuario {
    private String nombre;
    private String contraseña;
    private String email;
    private String ubicacion;
    private String estudios;   //Universidad, Bachiller, Eso, FP, Master, profesor titulado, etc.


    public Usuario(String n, String c, String e, String ubi, String es) {
        nombre = n;
        contraseña = c;
        email = e;
        ubicacion = ubi;
        estudios = es;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String c) {
        contraseña = c;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubi) {
        ubicacion = ubi;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String es) {
        estudios = es;
    }
}
