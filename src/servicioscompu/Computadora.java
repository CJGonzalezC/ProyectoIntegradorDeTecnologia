/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioscompu;

/**
 *
 * @author Administrador
 */
public class Computadora extends Tecnologia {
    
    private String procesador;
    private int RAM;
    
    Computadora(){
        
    }
    
    Computadora(String NoSerie, String Anio, String Modelo, String procesador, int RAM){
     super(NoSerie,Anio,Modelo);   
     this.RAM = RAM;
     this.procesador= procesador;
    }
    
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    
    @Override
    public String toString()
    { 
        //Utiliza el super para contatenar el to String()
        return super.toString() + " procesador: "+ procesador + " RAM: " + RAM;
    }
    
    
}
