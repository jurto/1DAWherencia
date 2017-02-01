package modelo;

/**
 *
 * @author Team
 */
public class Empleado {
    
    // Variables
    
    protected String nombre;
    
    
    // Métodos constructores
    
    public Empleado(String n) {
        this.nombre = n;
    }
    
    public Empleado() {
    }
    
    
    // Métodos funcionales

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
    
}