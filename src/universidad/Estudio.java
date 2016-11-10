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
    
    private String codigo;
    static ArrayList <Alumno> alumnos = new ArrayList <Alumno>();

    public Estudio(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    public void mostrar (){
        System.out.println(this.codigo);
            
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public static ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public static void setAlumnos(ArrayList<Alumno> alumnos) {
        Estudio.alumnos = alumnos;
    }
    
    public void addAlumno(Alumno alumnos){
        this.addAlumno(alumnos);
    }
    
    
}
