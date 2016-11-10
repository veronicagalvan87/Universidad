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
public class Nooficial extends Master {
    

    private String titulo;

  
    
    public void mostrar() {
        super.mostrar();
        System.out.println(this.titulo);
    }

    public Nooficial(String titulo, String codigo, String especialidad) {
        super(codigo, especialidad);
        this.titulo = titulo;
    }

   

        

    
    
}
