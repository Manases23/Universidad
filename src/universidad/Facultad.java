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
public class Facultad {
    
    private static int num_estudios;
    private String direccion;
    private String ciudad;
    private ArrayList <Estudio> estudios = new ArrayList <Estudio>();

    
    //Constructor, siempre con new en el main.
    public Facultad(String direccion, String ciudad) {
        if(num_estudios < 100){
        
        this.direccion = direccion;
        this.ciudad = ciudad;
        num_estudios++;
        }
    }

    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Estudio> getEstudios() {
        return estudios;
    }

    public void setEstudios(ArrayList<Estudio> estudios) {
        this.estudios = estudios;
    }
    
    public void addEstudio(Estudio estudios ){
    this.addEstudio(estudios);
    }
    
    
}
