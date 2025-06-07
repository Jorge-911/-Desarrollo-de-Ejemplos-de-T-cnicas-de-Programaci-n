// Clase que encapsula los datos de una Persona
public class Encapsulacion {
    private String nombre; // Atributo privado: nombre
    private int edad;      // Atributo privado: edad

    // Constructor que inicializa los atributos
    public Encapsulacion(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter: devuelve el nombre actual
    public String getNombre() {
        return nombre;
    }

    // Setter: cambia el valor de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter: devuelve la edad actual
    public int getEdad() {
        return edad;
    }

    // Setter: cambia la edad solo si el valor es mayor a 0
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de tipo Persona
        Encapsulacion persona = new Encapsulacion("Luis", 25);

        // Mostrar el nombre usando el getter
        System.out.println("Nombre: " + persona.getNombre());

        // Modificar la edad usando el setter
        persona.setEdad(30);

        // Mostrar la edad actualizada
        System.out.println("Edad actualizada: " + persona.getEdad());
    }
}
