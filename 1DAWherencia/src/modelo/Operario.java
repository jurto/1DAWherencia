package modelo;

/**
 *
 * @author Team
 */
public class Operario extends Empleado{
    
    // Variables
    
    // Métodos constructores
    
    public Operario(String nombre) {
        super(nombre);
    }
    
    public Operario() {
    }
    
    
    // Métodos funcionales

    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
    
}