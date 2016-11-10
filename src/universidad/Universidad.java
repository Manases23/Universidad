/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

public class Universidad {

    static ArrayList<Facultad> facultades = new ArrayList<Facultad>();

    public static void rellenarDatos() {

        Facultad f;
        Grado g;
        Alumno a;
        Master m;
        
        //creo 10 facultades
        for (int i = 0; i < 10; i++) {
            //Mediante un constructor
            f = new Facultad("Campus Universitario" + i, "Badajoz ");

            //creo 10 grados dentro de cada facultad,CONSTRUCTOR
            for (int j = 0; j < 10; j++) {
                g = new Grado("4 años", "GRADO000" + i);

                f.addEstudio(g);

                //Creo 10 alumnos regulares dentro de cada grado, Constructor
                for (int k = 0; k < 10; k++) {
                    a = new AlumnoRegular("Alumno regular " + i, 18 + i);

                    g.addAlumno(a);
                }
                
            }
            //Creo 10 master dentro de cada facultad, Constructor
            for (int j = 0; j < 10; j++) {
                m = new Master("MASTER000" + i, "Especialidad " + i);

                f.addEstudio(m);

                //Creo 10 alumnos becarios dentro de cada master
                for (int k = 0; k < 10; k++) {
                    a = new AlumnoBecario("Deparatamento " + i, "Alumno becario " + i, 22 + i);

                    m.addAlumno(a);
                }

            }

            facultades.add(f);
        }
    }

    public static void main(String[] args) {

        rellenarDatos();

        
        
    }

}
