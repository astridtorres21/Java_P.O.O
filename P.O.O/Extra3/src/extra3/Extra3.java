/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import extra3.Entidades.Rutina;
import extra3.Services.ServicioCliente;
import extra3.Services.ServicioRutina;

/**
 *
 * @author carol
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ServicioCliente sc = new ServicioCliente();
        sc.registrarCliente();
        sc.obtenerClientes();
        sc.actualizarCliente(505, "Luis", 33, 1.65, 61, "sobrevivir");
        sc.obtenerClientes();
         sc.actualizarCliente(100, "Luis", 33, 1.65, 61, "sobrevivir");
         sc.eliminarCliente(505);
         sc.obtenerClientes();*/
         
         ServicioRutina rt = new ServicioRutina();
         Rutina r1 = new Rutina(1,10, "cardio", "facil", "no morir");
         Rutina r2 = new Rutina(2,15, "piernas", "medio", "no morir*2");
         rt.crearRutina(r1);
         rt.crearRutina(r2);
         rt.obtenerRutinas();
         rt.actualizarRutina(2, "piernasact", 20, "dificil", "estas vivo");
         rt.obtenerRutinas();
         rt.eliminarRutina(1);
         rt.obtenerRutinas();
         
        
    }
    
}
