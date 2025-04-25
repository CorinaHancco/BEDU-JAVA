package Reto2;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar el saldo del cajero automático
        double saldo = 1000.0;
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");

            // Leer la opción seleccionada por el usuario
            System.out.print("Por favor, elija una opción: ");
            opcion = scanner.nextInt();

            // Controlar el flujo con un switch
            switch (opcion) {
                case 1: // Consultar saldo
                    System.out.println("Saldo actual: $" + saldo);
                    break;

                case 2: // Depositar dinero
                    System.out.print("¿Cuánto dinero deseas depositar? $");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("El monto a depositar debe ser positivo.");
                    } else {
                        saldo += deposito;
                        System.out.println("Has depositado: $" + deposito);
                        System.out.println("Saldo actualizado: $" + saldo);
                    }
                    break;

                case 3: // Retirar dinero
                    System.out.print("¿Cuánto dinero deseas retirar? $");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("No tienes suficiente saldo para realizar esta operación.");
                        // Continuar con el siguiente ciclo sin hacer nada
                        break;
                    }
                    if (retiro <= 0) {
                        System.out.println("El monto a retirar debe ser positivo.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Has retirado: $" + retiro);
                        System.out.println("Saldo actualizado: $" + saldo);
                    }
                    break;

                case 4: // Salir
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
                    break;
            }

        } while (opcion != 4); // El ciclo continuará hasta que el usuario elija la opción 4 (salir)

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
