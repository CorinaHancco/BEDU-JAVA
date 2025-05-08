package Reto2;

import java.util.Optional;

public class Factura {
    // 🔐 Atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    // 🛠️ Constructor público
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        // Si rfc es null, se guarda como Optional.empty()
        this.rfc = Optional.ofNullable(rfc);
    }

    // Método público: getResumen
    public String getResumen() {
        String resumen = "📄 Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";
        resumen += "RFC: " + (rfc.isPresent() ? rfc.get() : "[No proporcionado]");
        return resumen;
    }
}
