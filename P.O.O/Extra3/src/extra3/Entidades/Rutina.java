/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3.Entidades;

/**
 *
 * @author carol
 */
public class Rutina {
    
    private int id, duracion;
    private String nombre,lvlD,descripcion;

    public Rutina() {
    }

    public Rutina(int id, int duracion, String nombre, String lvlD, String descripcion) {
        this.id = id;
        this.duracion = duracion;
        this.nombre = nombre;
        this.lvlD = lvlD;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLvlD() {
        return lvlD;
    }

    public void setLvlD(String lvlD) {
        this.lvlD = lvlD;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", duracion=" + duracion + ", nombre=" + nombre + ", lvlD=" + lvlD + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
}
