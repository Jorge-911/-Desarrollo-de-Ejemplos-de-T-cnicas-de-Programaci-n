// Clase base llamada Animal
class Animal {
    // Método que puede ser sobreescrito por las subclases
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Clase Herencia (simula ser un Perro) que hereda de Animal
public class Herencia extends Animal {

    // Sobrescribe el método hacerSonido() de la clase Animal
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    // Método principal para ejecutar el ejemplo
    public static void main(String[] args) {
        // Crear objeto de tipo Herencia
        Herencia miPerro = new Herencia();

        // Llamar al método sobreescrito
        miPerro.hacerSonido();
    }
}
