// Clase base llamada Forma
class Forma {
    // Método que puede ser sobrescrito por subclases
    public void dibujar() {
        System.out.println("Dibujando una forma");
    }
}

// Subclase Circulo que hereda de Forma
class Circulo extends Forma {
    // Sobrescribe el método dibujar()
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}

// Subclase Cuadrado que hereda de Forma
class Cuadrado extends Forma {
    // Sobrescribe el método dibujar()
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}

// Clase principal para demostrar el polimorfismo
public class Polimorfismo {
    public static void main(String[] args) {
        // Uso de polimorfismo: Forma puede ser un Circulo o Cuadrado
        Forma f1 = new Circulo();  // f1 apunta a un objeto Circulo
        Forma f2 = new Cuadrado(); // f2 apunta a un objeto Cuadrado

        // Llamadas al método dibujar(), se ejecuta la versión correcta
        f1.dibujar(); // Dibuja un círculo
        f2.dibujar(); // Dibuja un cuadrado
    }
}
