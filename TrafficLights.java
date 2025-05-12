import java.util.Scanner;
public class TrafficLights {
    public static void main(String[] args) {
        // Variable de entrada
        String colorSemaforo = "verde"; // Puedes cambiarlo a "amarillo", "rojo", u otro valor
        final String MENSAJE_VERDE = "Puedes seguir";
        final String MENSAJE_AMARILLO = "Ten cuidado";
        final String MENSAJE_ROJO = "¡¡¡Para!!!";
        final String MENSAJE_OTRO = "El semáforo está dañado";

        switch (colorSemaforo.toLowerCase()) {
            case "verde":
                System.out.println("Puedes seguir");
                break;
            case "amarillo":
                System.out.println("Ten cuidado");
                break;
            case "rojo":
                System.out.println("¡¡¡Para!!!");
                break;
            default:
                System.out.println("El semáforo está dañado");
                break;
        }
    }
}
        // trying and learning final to save memory
        //Escribe un programa que basado en el color del semáforo verde, amarillo o rojo determine las acciones de un conductor 
        
        //Si es verde imprime en la terminal: Puedes seguir
        //Si es amarillo imprime en la terminal: Ten cuidado
        //Si es rojo imprime en la terminal: ¡¡¡Para!!!
        //Si es otro color imprime en la terminal: El semáforo está dañado

        //Cambia el valor de la variable, corre el programa y mira el resultado 
