package Reto1;

public class Principa {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "X1234567");
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento
        vuelo1.reservarAsiento(pasajero1);

        // Mostrar itinerario
        System.out.println();
        System.out.println(vuelo1.obtenerItinerario());

        // Cancelar reserva
        System.out.println();
        vuelo1.cancelarReserva();

        // Mostrar itinerario después de cancelar
        System.out.println();
        System.out.println(vuelo1.obtenerItinerario());

        // Reservar nuevamente con sobrecarga
        System.out.println();
        vuelo1.reservarAsiento("Mario Gonzalez", "Y7654321");

        // Mostrar itinerario final
        System.out.println();
        System.out.println(vuelo1.obtenerItinerario());
    }
}
