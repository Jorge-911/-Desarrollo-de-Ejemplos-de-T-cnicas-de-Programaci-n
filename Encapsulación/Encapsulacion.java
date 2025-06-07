public class Encapsulacion {
    private String nombre;
    private int edad;

    public Encapsulacion(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public static void main(String[] args) {
        Encapsulacion persona = new Encapsulacion("Luis", 25);
        System.out.println("Nombre: " + persona.getNombre());
        persona.setEdad(30);
        System.out.println("Edad actualizada: " + persona.getEdad());
    }
}
