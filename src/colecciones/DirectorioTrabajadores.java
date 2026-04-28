package colecciones;

import java.util.HashMap;

public class DirectorioTrabajadores {

    private HashMap<String, Double> trabajadores = new HashMap<>();

    // 1. Agregar trabajador con salario
    public void agregarTrabajador(String nombre, double salario) {
        trabajadores.put(nombre, salario);
        System.out.println("Trabajador agregado: " + nombre + " | Salario: $" + salario);
    }

    // 2. Mostrar todos los trabajadores y salarios
    public void mostrarTrabajadores() {
        System.out.println("\nDirectorio de trabajadores:");
        for (String nombre : trabajadores.keySet()) {
            System.out.println("  " + nombre + " → $" + trabajadores.get(nombre));
        }
    }

    // 3. Actualizar salario de un trabajador
    public void actualizarSalario(String nombre, double nuevoSalario) {
        if (trabajadores.containsKey(nombre)) {
            trabajadores.put(nombre, nuevoSalario);
            System.out.println("Salario actualizado: " + nombre + " → $" + nuevoSalario);
        } else {
            System.out.println("Trabajador no encontrado: " + nombre);
        }
    }

    // 4. Calcular salario promedio
    public void calcularPromedio() {
        double total = 0;
        for (double salario : trabajadores.values()) {
            total += salario;
        }
        double promedio = total / trabajadores.size();
        System.out.println("Salario promedio: $" + promedio);
    }
}