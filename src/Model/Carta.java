package Model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Carta {
    public Carta(Palo palo, String s) {
    }
    public static int obtenerValorCarta(String carta) {
        switch (carta) {
            case "J":
            case "Q":
            case "K":
                return 10;
            case "A":
                return 11;
            default:
                return Integer.parseInt(carta);
        }
    }
    public static List<String> obtenerMano() {
        List<String> cartas = new ArrayList<>();
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        // Baraja las cartas y elige dos al azar
        List<String> listaValores = new ArrayList<>();
        Collections.addAll(listaValores, valores);
        Collections.shuffle(listaValores);
        cartas.add(listaValores.get(0));
        cartas.add(listaValores.get(1));
        return cartas;
    }
    public static int gato() {
        List<String> mano = obtenerMano();
        System.out.println("Tu mano inicial es: " + mano);
        baraja.baraja();
        int total = mano.stream().mapToInt(Carta::obtenerValorCarta).sum();
        System.out.println("El valor total de tu mano es: " + total);
        return total;
    }
}