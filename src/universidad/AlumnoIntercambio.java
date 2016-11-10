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
public class AlumnoIntercambio extends Alumno{
    
    private String uni_origen;

    public AlumnoIntercambio(String uni_origen, String nombre, int edad) {
        super(nombre, edad);
        this.uni_origen = uni_origen;
    }
    
    
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.uni_origen);
    }

    public String getUni_origen() {
        return uni_origen;
    }

    public void setUni_origen(String uni_origen) {
        this.uni_origen = uni_origen;
    }
    
    
}
