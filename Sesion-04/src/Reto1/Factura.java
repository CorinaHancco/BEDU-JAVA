package Reto1;

import java.util.Objects;

public class Factura {
    private String folio;
    private String cliente;
    private double total;

    // Constructor
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // toString() con formato solicitado
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // equals(): dos facturas son iguales si tienen el mismo folio
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Factura)) return false;
        Factura other = (Factura) obj;
        return Objects.equals(this.folio, other.folio);
    }

    // hashCode() basado en folio
    @Override
    public int hashCode() {
        return Objects.hash(folio);
    }
}
