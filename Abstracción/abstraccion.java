// Clase abstracta que representa un Vehículo
abstract class Vehiculo {
    String marca; // Atributo que guarda la marca del vehículo

    // Constructor que asigna una marca al vehículo
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método abstracto que obliga a las subclases a implementar conducir()
    public abstract void conducir();
}

// Clase concreta que extiende Vehiculo y le da funcionalidad al método conducir()
public class Abstraccion extends Vehiculo {

    // Constructor que llama al constructor de la clase padre
    public Abstraccion(String marca) {
        super(marca);
    }

    // Implementación del método abstracto conducir()
    @Override
    public void conducir() {
        System.out.println("Conduciendo un coche de marca " + marca);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto Abstraccion (tipo Coche) con marca "Toyota"
        Abstraccion miCoche = new Abstraccion("Toyota");

        // Llamar al método conducir() implementado
        miCoche.conducir();
    }
}
