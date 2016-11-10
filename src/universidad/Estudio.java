/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Estudio {
    static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    private String codigo;
    String Alumnos;
    Facultad facultad;

    Estudio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mostrar() {

        System.out.println(this.codigo);
        System.out.println(this.alumnos);
    }

    public Estudio(String codigo, String alumnos, Facultad facultad) {
        this.codigo = codigo;
        this.facultad = facultad;
    }

    void setCodigo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setFacultad(String educacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setAlumnos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
