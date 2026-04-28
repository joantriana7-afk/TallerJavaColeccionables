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

}