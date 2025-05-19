package Reto2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        String archivoLog = "src/Reto2/errores.log";
        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        // Lectura del archivo usando try-with-resources
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoLog))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    totalErrores++;
                }

                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            // Mostrar resumen
            System.out.println("📊 Resumen del análisis de logs:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores (ERROR): " + totalErrores);
            System.out.println("Cantidad de advertencias (WARNING): " + totalWarnings);

            double porcentaje = ((double)(totalErrores + totalWarnings) / totalLineas) * 100;
            System.out.printf("Porcentaje de líneas con errores o advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.err.println("❌ Error al leer el archivo: " + e.getMessage());

            // Escribir el error en registro_fallos.txt
            guardarError("src/Reto2/registro_fallos.txt", e.getMessage());
        }
    }

    /**
     * Guarda el mensaje de error en un archivo de registro
     */
    private static void guardarError(String rutaArchivo, String mensaje) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            escritor.write("Error detectado: " + mensaje);
            escritor.newLine();
            System.out.println("📝 Mensaje de error registrado en " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("⚠️ No se pudo escribir el mensaje de error en el archivo de fallos.");
        }
    }
}
