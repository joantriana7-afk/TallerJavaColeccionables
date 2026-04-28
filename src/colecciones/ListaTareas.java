package colecciones;

import java.util.ArrayList;

public class ListaTareas {

    // 1. La lista donde se guardan las tareas
    private ArrayList<String> tareas = new ArrayList<>();

    // 2. Agregar tarea
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }

    // 3. Mostrar todas las tareas
    public void mostrarTareas() {
        System.out.println("\nTareas pendientes:");
        for (String tarea : tareas) {
            System.out.println("  - " + tarea);
        }
    }

    // 4. Marcar como completada (eliminarla)
    public void completarTarea(String tarea) {
        tareas.remove(tarea);
        System.out.println("Tarea completada: " + tarea);
    }

    // 5. Mostrar total de tareas pendientes
    public void mostrarTotal() {
        System.out.println("Total pendientes: " + tareas.size());
    }
}