import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Importamos la clase scanner para ingresar datos
        Scanner s = new Scanner(System.in);

        /*
        1. Solicitar al usuario que ingrese las siguientes calificaciones:
            - Calificación del examen parcial (de 0 a 100)
            - Calificación de los trabajos prácticos (de 0 a 100)
            - Calificación de participación en clase (de 0 a 100)
            - Calificación del proyecto final (de 0 a 100)
         */

        // Le damos la bienvenida al usario
        System.out.println("------ Bienvenido al Sistema de Calificaciones ------");

        // Pedimos al usuario calificación del examen parcial (de 0 a 100)
        System.out.println("Ingresa la calificación del examen parcial (de 0 a 100)");
        int califExamenParcial = s.nextInt();

        // Pedimos al usuario Calificación de los trabajos prácticos (de 0 a 100)
        System.out.println("Ingresa la calificación de los trabajos prácticos (de 0 a 100)");
        int califTrabajosPracticos = s.nextInt();

        // Pedimos al usuario Calificación de participación en clase (de 0 a 100)
        System.out.println("Ingresa la calificación de participación en clase (de 0 a 100)");
        int califParticipacion = s.nextInt();

        // Pedimos al usuario Calificación del proyecto final (de 0 a 100)
        System.out.println("Ingresa la calificación del proyecto final (de 0 a 100)");
        int califProyectoFinal = s.nextInt();

        /* Hacemos el calculo de las calificaciones segun su porcentaje
        - Examen parcial (40%)
        - Trabajos prácticos (30%)
        - Participación en clase (10%)
        - Proyecto final (20%)
         */
        
        double examenParcial = califExamenParcial * 0.40;
        double trabajosPracticos = califTrabajosPracticos * 0.30;
        double participacionClase = califParticipacion * 0.10;
        double proyectoFinal = califProyectoFinal * 0.20;
        
        // 2. Calcular la calificación final utilizando los porcentajes dados.
        double calificacionFinal = examenParcial + trabajosPracticos + participacionClase + proyectoFinal;

        // 3. Mostrar la calificación final y determinar si el estudiante aprobó o reprobó. La calificación mínima aprobatoria es 60.
        String aprobado = calificacionFinal >= 60 ? "APROBADO" : "REPROBADO";
        System.out.println("Calificación Final = " + calificacionFinal + ". Estado = " + aprobado);

    }
}