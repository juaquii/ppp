package Model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// es un nombre para un conjunto de valores
enum Palo {
    CORAZONES, DIAMANTES, ESPADAS, TREBOLES
}
 public class baraja {
    private Palo palo;
    private String valor;
    public baraja(Palo palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }
    public static void baraja() {
    }
    public String toString() {
        return valor + " de " + palo;
    }
}
class Inizializarbaraja {
    private List<Carta> cartas;
    public Inizializarbaraja() {
        cartas = new ArrayList<>();
        inicializarBaraja();
        barajarBaraja();
    }
    public  void inicializarBaraja() {
        for (Palo palo : Palo.values()) {
            for (int i = 2; i <= 10; i++) {
                cartas.add(new Carta(palo, String.valueOf(i)));
            }
            cartas.add(new Carta(palo, "J"));
            cartas.add(new Carta(palo, "Q"));
            cartas.add(new Carta(palo, "K"));
            cartas.add(new Carta(palo, "A"));
        }
    }
    void barajarBaraja() {
        Collections.shuffle(cartas);
    }
    public Carta repartirCartas() {
        if (cartas.isEmpty()) {
            System.out.println("Se acabaron las cartas. La baraja está vacía.");
            return null;
        }
        return cartas.remove(0);
    }
    public  void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
class Mostrarbaraja {
    public static void main(String[] args) {
        Mostrarbaraja baraja = new Mostrarbaraja();
        baraja.mostrarbaraja();
        Carta carta1 = baraja.repartirCarta();
        Carta carta2 = baraja.repartirCarta();

        if (carta1 != null && carta2 != null) {
            System.out.println("\nCarta 1: " + carta1);
            System.out.println("Carta 2: " + carta2);
        }
        baraja.mostrarbaraja();
    }
    Carta repartirCarta() {
        return null;
    }

    private void mostrarbaraja() {
    }
}