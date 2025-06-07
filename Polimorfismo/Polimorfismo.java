class Forma {
    public void dibujar() {
        System.out.println("Dibujando una forma");
    }
}

class Circulo extends Forma {
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}

class Cuadrado extends Forma {
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Forma f1 = new Circulo();
        Forma f2 = new Cuadrado();

        f1.dibujar();
        f2.dibujar();
    }
}
