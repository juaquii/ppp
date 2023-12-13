package View;
import Model.Carta;
import java.util.Scanner;
public class Menu {
    public static Scanner scanner;
    public  Menu() {
        this.scanner = new Scanner(System.in);
    }
    public static void mostrarMenu() {
        System.out.println("----------------------------");
        System.out.println("Bienvenido al casino pitoño");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Añadir Jugador");
        System.out.println("2. Iniciar Juego");
        System.out.println("3. Salir");
        System.out.println("----------------------------");
    }
    public int leerOpcion() {
        return scanner.nextInt();
    }
//lee lo que hemos elegido y que regrese
    public static String leerNombreJugador() {
        System.out.println("Ingrese el nombre   :");
        return scanner.next();
    }// lo que hemos elegido y que regrese
    public static String leerNombreJugador2() {
        System.out.println("Ingrese el nombre   :");
        return scanner.next();
    }// lo que hemos elegido y que regrese
    public static void perro(){
        Menu menu = new Menu();
        int opcion;
        do {
            menu.mostrarMenu();
            opcion = menu.leerOpcion();
            switch (opcion) {
                case 1:
                    int total=0;
                    String nombreJugador = menu.leerNombreJugador();
                    System.out.println("Jugador " + nombreJugador + " añadido.");
                    System.out.println("Iniciando juego....");
                    int valor1=Carta.gato();
                    String nombreJugador2 = menu.leerNombreJugador2();
                    System.out.println("Jugador " + nombreJugador2 + " añadido.");
                    System.out.println("Iniciando juego....");
                   int valor2=Carta.gato();
                    if (valor1>valor2){
                       System.out.println(  nombreJugador + " ha ganado");}
                   else {
                    System.out.println(nombreJugador2 + " ha ganado");
                }
                    break;
                case 3:
                    System.out.println("¡Hasta la proxima máquina!");
                    break;
                default:
                    System.out.println("Error añade otro jugador.");
            }
        } while (opcion != 3);
    }
}