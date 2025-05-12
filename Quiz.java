import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenidos al un, dos, tres!!!");
        System.out.println( "\nIntroduce tu nombre");
        String name = scanner.nextLine();
        System.out.println("\n¿Estás lista?");
        String ready = scanner.nextLine();
        System.out.println( "Hola " + name + " , ¡comenzamos!!");
        System.out.println("¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?");
        System.out.println("\t  a. Ada Lovelace");
        System.out.println("\t  b. Jude Milhon");
        System.out.println("\t  c. Martha Ackelsberg");
        System.out.println("\t  d. Jane Jacobs");
        String answer1 = scanner.nextLine();
        int score = 0;
        if (answer1.equalsIgnoreCase("b")) {A
        score +=5;
        }
        System.out.println("Genial!! siguiente pregunta.\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("¿Quién es Fuencisla Clemares?");
        System.out.println("\t  a. La directora general de IBM Europa, Oriente Medio y África");
        System.out.println("\t  b. La vicepresidenta de Microsoft Western Europe");
        System.out.println("\t  c. La directora general de Google en España y Portugal");
        System.out.println("\t  d. Fundadora y CEO de Marsi Bionics");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("c")) {
            score += 5;
        }
        System.out.println("Genial!! siguiente pregunta.\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?");
        System.out.println(" Puedes elegir más de una opción por ejemplo a y b");
        System.out.println("\t  a. Primera programadora de software");
        System.out.println("\t  b. Una actriz de cine");
        System.out.println("\t  c. Inventora del procesador de datos");
        System.out.println("\t  d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS");
        String answer3 = scanner.nextLine().toLowerCase();
        if (answer3.contains("b") && answer3.contains ("d")) {
            score += 5;

        }
        System.out.println("Genial!! siguiente pregunta.\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
        System.out.println("\t  a. Katherine Johnson, Dorothy Vaughan y Mary Jackson");
        System.out.println("\t  b. Jessica Miller, Emily Johnson, Sarah Davis");
        System.out.println("\t  c. bell hooks, Toni Morrison y Alice Walker");
        System.out.println("\t  d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");
        String answer4 = scanner.nextLine();
        if (answer4.equalsIgnoreCase("a")) {
            score += 5;
        }
        System.out.println("\n Tu puntuación final es: "+ score + "/20");
        if (score >=15 ) {
        System.out.println("\n Tú si que sabes mucho");
        } else if (score >=5) {
        System.out.println("\n No lo has hecho mal");
        } else {
        System.out.println("\n Buena suerte la próxima vez");
        }
        scanner.close();

        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cúal fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú sí que sabes mucho
        //Si el puntaje es menor de 15 pero, mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java

        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

    }
    
}