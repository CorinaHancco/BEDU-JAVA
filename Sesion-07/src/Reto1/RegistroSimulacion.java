package Reto1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {
    public static void main(String[] args) {
        try {
            // Guardar parámetros en el archivo
            guardarParametros();

            // Leer y mostrar el contenido del archivo
            leerParametros();

        } catch (IOException e) {
            System.err.println("❌ Ocurrió un error: " + e.getMessage());
        }
    }

    public static void guardarParametros() throws IOException {
        // Ruta de la carpeta y el archivo
        Path carpetaConfig = Paths.get("src/Reto1/config");
        Path archivoParametros = carpetaConfig.resolve("parametros.txt");

        // Crear carpeta si no existe
        if (Files.notExists(carpetaConfig)) {
            Files.createDirectories(carpetaConfig);
            System.out.println("📁 Carpeta 'config/' creada.");
        }

        // Parámetros a guardar
        String contenido = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        // Escribir en el archivo
        Files.write(archivoParametros, contenido.getBytes());

        // Verificar si el archivo se creó correctamente
        if (Files.exists(archivoParametros)) {
            System.out.println("✅ Archivo 'parametros.txt' creado correctamente.");
        } else {
            System.out.println("⚠️ No se pudo crear el archivo.");
        }
    }

    /**
     * Método que lee el contenido del archivo y lo muestra en consola
     */
    public static void leerParametros() throws IOException {
        Path archivoParametros = Paths.get("src/Reto1/config/parametros.txt");

        if (Files.exists(archivoParametros)) {
            String contenido = Files.readString(archivoParametros);
            System.out.println("\n📄 Contenido del archivo:");
            System.out.println(contenido);
        } else {
            System.out.println("❌ El archivo no existe. No se puede leer.");
        }
    }
}
