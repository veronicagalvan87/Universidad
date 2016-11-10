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
public class Facultad {

    private String direccion;
    private String ciudad;
    

    Facultad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mostrar() {
        System.out.println(this.direccion);
        System.out.println(this.ciudad);

    }

    public Facultad(String direccion, String ciudad) {
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    void setDireccion(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCiudad(String badajoz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
