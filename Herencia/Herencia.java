class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.hacerSonido();
    }
}
