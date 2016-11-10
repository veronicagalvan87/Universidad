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
public class Grado extends Estudio {

    private String codigo;
    private int duracion;

    Grado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mostrar() {
        System.out.println(this.codigo);
        System.out.println(this.duracion);
    }

    public Grado(String codigo, int duracion) {
        this.codigo = codigo;
        this.duracion = duracion;
    }

    

    
}
