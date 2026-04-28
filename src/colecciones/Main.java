package colecciones;

public class Main {
    public static void main(String[] args) {

        // ══════════════════════════════════════
        // EJERCICIO 1: ArrayList - Lista Tareas
        // ══════════════════════════════════════
        System.out.println("===== LISTA DE TAREAS =====");
        ListaTareas lista = new ListaTareas();

        lista.agregarTarea("Estudiar Java");
        lista.agregarTarea("Hacer el taller");
        lista.agregarTarea("Repasar colecciones");

        lista.mostrarTareas();
        lista.completarTarea("Hacer el taller");
        lista.mostrarTareas();
        lista.mostrarTotal();

        // ══════════════════════════════════════
        // EJERCICIO 2: HashSet - Biblioteca
        // ══════════════════════════════════════
        System.out.println("\n===== BIBLIOTECA DE LIBROS =====");
        BilbiotecaLibros biblioteca = new BilbiotecaLibros();

        biblioteca.agregarLibro("Cien años de soledad");
        biblioteca.agregarLibro("El principito");
        biblioteca.agregarLibro("Harry Potter");
        biblioteca.agregarLibro("Cien años de soledad"); // duplicado

        biblioteca.mostrarLibros();
        biblioteca.verificarLibro("Harry Potter");
        biblioteca.verificarLibro("Don Quijote");
        biblioteca.contarLibros();

        // ══════════════════════════════════════
        // EJERCICIO 3: HashMap - Trabajadores
        // ══════════════════════════════════════
        System.out.println("\n===== DIRECTORIO TRABAJADORES =====");
        DirectorioTrabajadores directorio = new DirectorioTrabajadores();

        directorio.agregarTrabajador("Carlos", 3500000);
        directorio.agregarTrabajador("Ana", 4200000);
        directorio.agregarTrabajador("Luis", 2800000);

        directorio.mostrarTrabajadores();
        directorio.actualizarSalario("Carlos", 4000000);
        directorio.mostrarTrabajadores();
        directorio.calcularPromedio();
    }
}