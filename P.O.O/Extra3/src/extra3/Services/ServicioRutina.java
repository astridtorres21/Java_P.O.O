/*
 * crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
 obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
 actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
 de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
 eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema
 */
package extra3.Services;

import extra3.Entidades.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class ServicioRutina {

    ArrayList<Rutina> rut = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    public void crearRutina(Rutina rutina) {
        rut.add(rutina);
    }

    public void obtenerRutinas() {

        System.out.println(rut);

    }

    public void actualizarRutina(int id, String nombre, int duracion, String lvlD, String descripcion) {
        boolean existe = false;
        for (Rutina r1 : rut) {
            if (r1.getId() == id) {
                r1.setNombre(nombre);
                r1.setDuracion(duracion);
                r1.setLvlD(lvlD);
                r1.setDescripcion(descripcion);
                existe = true;
            }

        }
        if (!existe) {
            System.out.println("No se encuentra el id");
        }

    }

    public boolean eliminarRutina(int id) {
        for (Rutina r1 : rut) {
            if (r1.getId() == id) {
                rut.remove(r1);
                return true;
            }
            
        }
        return false;
    }

    }
