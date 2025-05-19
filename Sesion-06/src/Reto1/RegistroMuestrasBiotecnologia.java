package Reto1;

import java.util.*;

public class RegistroMuestrasBiotecnologia {
    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden de llegada
        ArrayList<String> ordenLlegadaMuestras = new ArrayList<>();
        ordenLlegadaMuestras.add("Homo sapiens");
        ordenLlegadaMuestras.add("Mus musculus");
        ordenLlegadaMuestras.add("Arabidopsis thaliana");
        ordenLlegadaMuestras.add("Homo sapiens"); // Muestra repetida

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(ordenLlegadaMuestras);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> muestraInvestigador = new HashMap<>();
        muestraInvestigador.put("M-001", "Dra. López");
        muestraInvestigador.put("M-002", "Dr. Hernández");
        muestraInvestigador.put("M-003", "Dra. García");
        muestraInvestigador.put("M-004", "Dr. Pérez");

        // Paso 4: Mostrar resultados

        // Mostrar el orden de llegada de las muestras
        System.out.println("📥 Orden de llegada de las muestras:");
        for (String especie : ordenLlegadaMuestras) {
            System.out.println("- " + especie);
        }

        // Mostrar las especies únicas
        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // Mostrar la relación ID de muestra → investigador
        System.out.println("\n🧑‍🔬 Relación de ID de muestra con investigador:");
        for (String id : muestraInvestigador.keySet()) {
            System.out.println(id + " → " + muestraInvestigador.get(id));
        }

        // Realizar una búsqueda por ID de muestra
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n🔍 Ingresa un ID de muestra para buscar al investigador (ej. M-002): ");
        String idBusqueda = scanner.nextLine();

        if (muestraInvestigador.containsKey(idBusqueda)) {
            System.out.println("El investigador responsable de la muestra " + idBusqueda + " es: " + muestraInvestigador.get(idBusqueda));
        } else {
            System.out.println("⚠️ No se encontró ninguna muestra con ese ID.");
        }

        scanner.close();
    }
}
