import java.util.Scanner;

public class VariablesCondicionesClclos {

    // Calcula el promedio de 3 notas
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // Retorna true si el promedio es mayor o igual a 61
    public static boolean esAprobado(double promedio) {
        return promedio >= 61;
    }

    // Muestra todos los estudiantes con su promedio y estado
    public static void mostrarResumen(String[] nombres, double[] promedios, String[] estados, int total) {
        System.out.println("\nResumen de estudiantes:");
        for (int i = 0; i < total; i++) {
            System.out.printf("Nombre: %s  Promedio: %.2f  Estado: %s\n",
                    nombres[i], promedios[i], estados[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];
        double[] promedios = new double[5];
        String[] estados = new String[5];

        System.out.print("¿Cuántos estudiantes desea ingresar? (máx. 5): ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.print("\nNombre del estudiante: ");
            nombres[i] = sc.nextLine();

            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double n3 = sc.nextDouble();
            sc.nextLine(); // limpiar buffer

            promedios[i] = calcularPromedio(n1, n2, n3);
            estados[i] = esAprobado(promedios[i]) ? "Aprobado" : "Reprobado";
        }

        mostrarResumen(nombres, promedios, estados, cantidad);
        sc.close();
    }
}
