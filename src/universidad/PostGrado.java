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
public class PostGrado extends Master {
    
    private int estudios;

    
    
    public void mostrar() {
        super.mostrar();
        System.out.println(this.estudios);
    }

    public PostGrado(int estudios, String codigo, String especialidad) {
        super(codigo, especialidad);
        this.estudios = estudios;
    }

    
    }



   
    

   

    

   
    
