/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioscompu;

import Servicios.newpackage.ServiciosCompu;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       menu();
    }

    private static void menu() {
        //Intancia de los servicios
        ServiciosCompu Servicios = new ServiciosCompu();
        
        boolean bandera = true;
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();
        
        System.out.println("Bienvenido a la Tecnologia");
        do{
            System.out.println("Seleccione la opcion"
                    + "/n 1) Agregar"
                    + "/n 2) Actualizar");
            switch(opcion){
                case 1:
                    
                   Computadora compu =  pedirDatosAlUsuario();
                   Servicios.Create(compu);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ha salido del programa!!!!");
                    bandera = !bandera;
                    break;
                        
            }
            
            
        }while(bandera);
        
    }

    private static Computadora pedirDatosAlUsuario() {
    
    }
    
}
