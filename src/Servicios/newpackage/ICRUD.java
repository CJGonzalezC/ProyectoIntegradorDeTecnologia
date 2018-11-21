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
public interface ICRUD {
    
    public boolean Create(Computadora compu);
    public LinkedList Read();
    
    //public void Update();
    //public void Delete();
    
    
}
