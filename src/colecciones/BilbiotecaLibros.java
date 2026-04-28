package colecciones;
import java.util.HashSet;
public class BilbiotecaLibros {

    private HashSet<String> libros = new HashSet<>();

    // 1. Agregar libro
    public void agregarLibro(String titulo) {
        boolean agregado = libros.add(titulo);
        if (agregado) {
            System.out.println("Libro agregado: " + titulo);
        } else {
            System.out.println("El libro ya existe: " + titulo);
        }
    }

    // 2. Mostrar todos los libros
    public void mostrarLibros() {
        System.out.println("\nLibros disponibles:");
        for (String libro : libros) {
            System.out.println("  - " + libro);
        }
    }

    // 3. Verificar si un libro está disponible
    public void verificarLibro(String titulo) {
        if (libros.contains(titulo)) {
            System.out.println("Disponible: " + titulo);
        } else {
            System.out.println("No disponible: " + titulo);
        }
    }

    // 4. Contar libros únicos
    public void contarLibros() {
        System.out.println("Total de libros únicos: " + libros.size());
    }
}