package Reto01;

public class UnidadEmergencia {
    protected String nombre;

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void activarUnidad() {
        System.out.println("🚨 Activando unidad: " + nombre);
    }

    public void responder() {

    }
}
