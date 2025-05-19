package Reto2;

import java.util.HashSet;
import java.util.Scanner;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = null;
        HashSet<Integer> consumos = new HashSet<>();

        try {
            scanner = new Scanner(System.in);
            System.out.println("🖥️ Monitor de Consumo de CPU");
            System.out.println("Ingresa los valores de consumo de CPU por servidor (en %). Escribe 'fin' para terminar.");

            while (true) {
                System.out.print("➡️ Ingresar consumo: ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                int valor;

                try {
                    valor = Integer.parseInt(entrada);

                    if (valor < 0 || valor > 100) {
                        System.out.println("❌ Error: El valor debe estar entre 0 y 100.");
                        continue;
                    }

                    if (!consumos.add(valor)) {
                        System.out.println("⚠️ Valor duplicado ignorado: " + valor + "%");
                        continue;
                    }

                    if (valor > 95) {
                        throw new ConsumoCriticoException("🚨 Consumo crítico detectado: " + valor + "%");
                    }

                    System.out.println("✅ Consumo registrado: " + valor + "%");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Entrada no válida. Debe ser un número.");
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                }
            }

        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("🔚 Monitor finalizado. Recursos liberados.");
            }
        }
    }
}
