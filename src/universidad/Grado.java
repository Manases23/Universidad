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
public class Grado extends Estudio{
    
    private String duración;

    public Grado(String duración, String codigo) {
        super(codigo);
        this.duración = duración;
    }

  
    
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.duración);
    }
    
    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }
    
    
}
