package Reto1;

public class TransicionSimple implements TransicionHistoria {
    @Override
    public void avanzarEscena(String decision) {
        if ("A".equalsIgnoreCase(decision)) {
            System.out.println("🌄 Has elegido explorar la montaña.");
        } else {
            System.out.println("🌆 Decides quedarte en el pueblo.");
        }
    }
}
