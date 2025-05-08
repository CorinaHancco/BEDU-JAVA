package Reto1;

public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            System.out.println("✅ Reserva realizada con éxito.");
            return true;
        } else {
            System.out.println("⚠️ Ya hay un asiento reservado.");
            return false;
        }
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre,pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    public void cancelarReserva() {
        if (asientoReservado != null) {
            System.out.println("❌ Cancelando reserva...");
            asientoReservado = null;
        } else {
            System.out.println("⚠️ No hay reserva para cancelar.");
        }
    }

    public String obtenerItinerario() {
        String pasajeroInfo = (asientoReservado != null)
                ? asientoReservado.getNombre()
                : "[Sin reserva]";

        return "✈️ Itinerario del vuelo:\n" +
                "Código: " + codigoVuelo + "\n" +
                "Destino: " + destino + "\n" +
                "Salida: " + horaSalida + "\n" +
                "Pasajero: " + pasajeroInfo;
    }
}
