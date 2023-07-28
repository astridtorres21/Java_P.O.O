
package mascotappservicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {
    
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota() {
         
        System.out.println("introducir nombre");
        String nombre = leer.next();
        
         System.out.println("introducir apodo");
        String apodo = leer.next();
        
        System.out.println("introducir tipo");
        String tipo = leer.next();
                
       return  new Mascota(nombre, apodo, tipo);
       
        
    }
}
