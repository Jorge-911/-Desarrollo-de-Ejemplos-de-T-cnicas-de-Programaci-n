abstract class Vehiculo {
    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public abstract void conducir();
}

class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo un coche de marca " + marca);
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota");
        miCoche.conducir();
    }
}
