/*
 * registrarCliente: lo registra en el sistema.
 obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
 actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
 de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
 eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.
 */
package extra3.Services;

import extra3.Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class ServicioCliente {

    ArrayList<Cliente> clientes = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    public void registrarCliente() {
        Cliente c = new Cliente();
        System.out.println("Ingresar el ID");
        c.setId(leer.nextInt());
        System.out.println("Ingresar el nombre");
        c.setNombre(leer.next());
        System.out.println("Ingresar su edad");
        c.setEdad(leer.nextInt());
        System.out.println("Ingresar su altura");
        c.setAltura(leer.nextDouble());
        System.out.println("Ingresar su peso");
        c.setPeso(leer.nextDouble());
        System.out.println("Ingresar el objetivo");
        c.setObjetivo(leer.next());
        clientes.add(c);
    }

    public void obtenerClientes() {
        System.out.println(clientes);

    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        boolean existe = false;
        for (Cliente cl : clientes) {
            if (id == cl.getId()) {
                cl.setNombre(nombre);
                cl.setEdad(edad);
                cl.setAltura(altura);
                cl.setPeso(peso);
                cl.setObjetivo(objetivo);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No se encontro el cliente");
        }
    }

    public boolean eliminarCliente(int id) {
        
        for (Cliente cl : clientes) {
            if (id == cl.getId()) {
                clientes.remove(cl);
                return true;
            }

        }
        
    return false;
    }

}
