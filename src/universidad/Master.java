/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author usuario
 */
public class Master extends Estudio {

    private String codigo;
    private String especialidad;

   
    public void mostrar() {
        System.out.println(this.codigo);
        System.out.println(this.especialidad);
    }

    public Master(String codigo, String especialidad) {
        this.codigo = codigo;
        this.especialidad = especialidad;
    }

   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }



   
}
