/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.newpackage;

import java.util.LinkedList;
import servicioscompu.Computadora;

/**
 *
 * @author Administrador
 */
public class ServiciosCompu implements ICRUD{
    LinkedList<Computadora> listaComputadoras = new LinkedList();
    
    /**
     *
     * @param compu
     * @return
     */
    @Override
    public boolean Create(Computadora compu){
    return false;
        
       // return listaComputadoras.add(compu);
    }

  /*  //@Override
    public void Update(){
    }

   // @Override
    public void Delete() {
        
    }
*/

    @Override
    public LinkedList Read() {
        
        return listaComputadoras;
    }

    
}
