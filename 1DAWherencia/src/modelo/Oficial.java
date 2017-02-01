package modelo;

/**
 *
 * @author Team
 */
public class Oficial extends Operario{
    
    // Variables
    
    // Métodos constructores
    
    public Oficial(String nombre) {
        super(nombre);
    }
    
    public Oficial() {
    }
    
    
    // Métodos funcionales

    @Override
    public String toString() {
        return "Empleado " + nombre + "-> Operario -> Oficial";
    }
    
}