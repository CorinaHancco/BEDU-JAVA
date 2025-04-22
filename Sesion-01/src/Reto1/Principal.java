package Reto1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = myObj.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = myObj.nextInt();
        // Aquí agregas nextLine() para consumir el salto de línea que queda
        myObj.nextLine();  // Esto es importante para que luego puedas leer correctamente el expediente
        System.out.println("Ingresa tu numero de expediente: ");
        String expediente = myObj.nextLine();

        myObj.close();

        Paciente paciente = new Paciente();
        paciente.nombre = nombre;
        paciente.edad = edad;
        paciente.numero_expediente = expediente;

        paciente.mostrarInformacion();
    }
}
