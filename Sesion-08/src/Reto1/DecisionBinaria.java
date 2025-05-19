package Reto1;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String obtenerDecision() {
        System.out.println("¿Qué deseas hacer?");
        System.out.println("A - Subir la montaña");
        System.out.println("B - Quedarte en el pueblo");
        System.out.print("👉 Ingresa tu elección (A/B): ");
        return scanner.nextLine().trim();
    }
}
