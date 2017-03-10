package sixpi.profesoradjunto.classes;

import java.util.ArrayList;

/**
 * Created by David on 10/03/2017.
 */

public class Profesor extends Usuario {
    private int nivel;
    private ArrayList<Curso> cursos;


    public Profesor(String n, String c, String e, String ubi, String es) {
        super(n, c, e, ubi, es);

        cursos = new ArrayList<>();

        nivel = 0;
    }

    public void setCurso(Curso cur) {
        cursos.add(cur);
        double karmacont = 0;
        if (cur != null) {
            for (int i = 0; i < cursos.size(); i++) {
                karmacont = karmacont + cursos.get(i).getKarma();
            }
        }
        setNivel(karmacont);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(double karma) {
        double i = karma / 100;
        i = i / 5;
        nivel = (int) i;
    }
}