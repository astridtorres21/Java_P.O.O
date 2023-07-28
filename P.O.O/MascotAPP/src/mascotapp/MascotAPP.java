/*package mascotapp;*/
import mascotapp.entidades.Mascota;


public class MascotAPP {

    public static void main(String[] args)  {
        
        int a = 10;
 
         Mascota mm = new Mascota();
        
        modificador(a, mm);
        
        System.out.println("a" + a);
        System.out.println("Mascota" + mm);
        
    }
    
    public static void modificador(int num, Mascota m){
        num = 100;
        m.setApodo("Mascota Referencia");
    }
    }
        
        //se crea un servicio correspondiente
        
       // ServicioMascota sm = new ServicioMascota();
        
     //  Mascota m1 = sm.crearMascota();
  
   //     System.out.println(m1.toString());
    
 //   }

