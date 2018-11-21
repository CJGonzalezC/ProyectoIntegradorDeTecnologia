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
abstract class Tecnologia {

    public String getNoSerie() {
        return NoSerie;
    }

    public void setNoSerie(String NoSerie) {
        this.NoSerie = NoSerie;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    Tecnologia(){
        
    }
   
    Tecnologia(String NoSerie, String Anio, String Modelo){
        this.NoSerie = NoSerie;
        this.Anio = Anio;
        this.Modelo = Modelo;
    }
    
    private String NoSerie;
    private String Anio;
    private String Modelo;
    
    
    @Override
    public String toString()
    {
        return "El Modelo es: " + this.Modelo + "/n El NoSerie es: " + this.NoSerie + "El Anio es :"+ this.Anio;
    }
}
