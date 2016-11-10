/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;
import static universidad.Estudio.alumnos;

/**
 *
 * @author usuario
 */
public class Universidad {

    static ArrayList<Facultad> facultades = new ArrayList<Facultad>();
    static ArrayList<Estudio> estudios = new ArrayList<Estudio>();
    
    

    public static void rellenarDatos() {
        Facultad f;
        Estudio e;
        Grado g;
        Master m;
        PostGrado pg;
        Nooficial no;
        Alumno a = null;
        Regular r;
        Becario b;
        Intercambio in;

        for (int i = 0; i < 10; i++) {
            f = new Facultad("Avenida de Elvas " + i,"Badajoz");
            

            e = new Estudio("8383737"+i,"educacion"+i,f);
            
            g = new Grado("82989283"+i,200+i);
            estudios.add(g);

            m = new Master("83983729"+i,"PSICOLOGIA"+i);
            estudios.add(m);

            pg = new PostGrado(78678678+i,"CLINICA"+i,"educacion"+i);
            estudios.add(pg);

            no = new Nooficial("98893783"+i,"INFANTIL"+i,"Orientador"+i);
            estudios.add(no);

            for (int j = 0; j < 10; j++) {
                r = new Regular();
                r.setNombre("Juan");
                r.setEdad(22);
                alumnos.add(a);

                b = new Becario();
                b.setDepartamento("psicologia de la educacion");
                b.setNombre("Carmen" + j);
                b.setEdad(24 + 1);
                alumnos.add(a);

                in = new Intercambio();
                in.setUniversidad_origen("Bolonia");
                in.setNombre("Bella");
                in.setEdad(21 + 1);
                alumnos.add(a);

            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
