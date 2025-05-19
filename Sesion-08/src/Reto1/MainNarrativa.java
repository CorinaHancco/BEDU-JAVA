package Reto1;

public class MainNarrativa {
    public static void main(String[] args) {
        // Inyección de dependencias usando interfaces
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();
        TransicionHistoria transicion = new TransicionSimple();

        // Simulación narrativa
        dialogo.mostrarDialogo("¡Bienvenido al valle encantado!");
        dialogo.mostrarDialogo("Un viajero se detiene en la bifurcación del destino...");

        String eleccion = decision.obtenerDecision();

        dialogo.mostrarDialogo("Has elegido: " + eleccion);
        transicion.avanzarEscena(eleccion);

        dialogo.mostrarDialogo("Fin de la escena.");
    }
}
