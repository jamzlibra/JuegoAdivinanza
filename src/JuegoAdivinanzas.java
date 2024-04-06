import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            int numeroAdivinar = random.nextInt(101); // Generar número aleatorio entre 0 y 100
            int intentos = 0;

            System.out.println("Bienvenido al juego de adivinanzas. Debes adivinar un número entre 0 y 100.");

            while (intentos < 5) {
                System.out.println("Intento #" + (intentos + 1) + ": Ingresa tu número:");
                int numeroUsuario = teclado.nextInt();

                if (numeroUsuario == numeroAdivinar) {
                    System.out.println("¡Felicidades! ¡Has adivinado el número!");
                    break;
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }

                intentos++;
            }

            if (intentos == 5) {
                System.out.println("¡Lo siento! Has agotado tus 5 intentos. El número a adivinar era: " + numeroAdivinar);
            }

            System.out.println("¿Desea jugar de nuevo? (Sí: 's' o 'S', No: cualquier otra tecla)");
            char opcion = teclado.next().charAt(0);

            if (opcion != 's' && opcion != 'S') {
                jugarDeNuevo = false;
            }
        }

        System.out.println("¡Gracias por jugar!");
        teclado.close();
    }
}
