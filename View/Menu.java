package View;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Añadir Jugador");
        System.out.println("2. Iniciar Juego");
        System.out.println("3. Salir");
    }

    public int leerOpcion() {
        return scanner.nextInt();
    }
//lee lo que hemos elegido
    public String leerNombreJugador() {
        System.out.println("Ingrese el nombre   :");
        return scanner.next();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        int opcion;

        do {
            menu.mostrarMenu();
            opcion = menu.leerOpcion();

            switch (opcion) {
                case 1:
                    String nombreJugador = menu.leerNombreJugador();
                    System.out.println("Jugador " + nombreJugador + " añadido.");
                    break;
                case 2:
                    System.out.println("Iniciando juego....");

                    break;
                case 3:
                    System.out.println("¡Hasta la proxima máquina!");
                    break;
                default:
                    System.out.println("Eso no me sirve po otra cosa.");
            }
        } while (opcion != 3);
    }
}