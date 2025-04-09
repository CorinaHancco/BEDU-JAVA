package Reto1;

public class Paciente {
    String nombre;
    int edad;
    String numero_expediente;

    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Expediente: " + this.numero_expediente);
    }
}
