/*
Chimaltenango, 29 de julio de 2023
Programador: Ricardo José Sis Cabrera
Descripción del programa: Ejemplo de Estructura Repetitiva While
*/
package EstructurasRepetitivas;
import java.util.Scanner;
public class EstructuraRepetitivaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorNotasMayoresIgualA7 = 0;
        int contadorNotasMenoresA7 = 0;
        int totalNotas = 10;
        int contador = 0;

        while (contador < totalNotas) {
            System.out.print("Ingrese la nota del alumno " + (contador + 1) + ": ");
            int nota = scanner.nextInt();
            contadorNotasMayoresIgualA7 += (nota >= 7) ? 1 : 0;
            contadorNotasMenoresA7 += (nota < 7) ? 1 : 0;
            contador++;
        }
        System.out.println("Número de alumnos con nota mayor o igual a 7: " + contadorNotasMayoresIgualA7);
        System.out.println("Número de alumnos con nota menor a 7: " + contadorNotasMenoresA7);
        scanner.close();
    }
}
