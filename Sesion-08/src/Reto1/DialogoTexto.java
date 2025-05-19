package Reto1;

public class DialogoTexto implements GestorDialogo{
    @Override
    public void mostrarDialogo(String texto) {
        System.out.println("🗨️  [Personaje]: " + texto);
    }
}
