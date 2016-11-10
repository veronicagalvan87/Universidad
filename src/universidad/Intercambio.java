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
public class Intercambio extends Alumno {

    private String universidad_origen;
    private String nombre;

    public void mostrar() {
        super.mostrar();
        System.out.println(this.universidad_origen);
        System.out.println(this.nombre);
    }

    public String getUniversidad_origen() {
        return universidad_origen;
    }

    public void setUniversidad_origen(String universidad_origen) {
        this.universidad_origen = universidad_origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    private int edad;

}
