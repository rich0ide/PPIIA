/*
Chimaltenango, 29 de julio de 2023
Programador: Ricardo José Sis Cabrera
Descripción del programa: Calculadora simple que permite suma, resta, multiplicar y dividir
*/
package I_PARCIAL;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        int opcion;
        float a,b,c;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("=========================");
            System.out.println("       CALCULADORA");
            System.out.println("-------------------------");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Producto");
            System.out.println("4) División");
            System.out.println("5) SALIR");
            System.out.println("-------------------------");
            System.out.print("Selecione su opción: ");
            opcion = teclado.nextInt();
            System.out.println("=========================");
            switch(opcion){
                case 1:
                    System.out.println("          SUMA");
                    System.out.println("-------------------------");
                    System.out.print("Ingrese primer número: ");
                    a = teclado.nextInt();
                    System.out.print("Ingrese segundo número: ");
                    b = teclado.nextInt();
                    c = a+b;
                    System.out.println("La suma es: "+c);
                break;
                case 2:
                    System.out.println("          RESTA");
                    System.out.println("-------------------------");
                    System.out.print("Ingrese primer número: ");
                    a = teclado.nextInt();
                    System.out.print("Ingrese segundo número: ");
                    b = teclado.nextInt();
                    c = a-b;
                    System.out.println("La resta es: "+c);
                break;
                case 3:
                    System.out.println("        PRODUCTO");
                    System.out.println("-------------------------");
                    System.out.print("Ingrese primer número: ");
                    a = teclado.nextInt();
                    System.out.print("Ingrese segundo número: ");
                    b = teclado.nextInt();
                    c = a*b;
                    System.out.println("El producto es: "+c);
                break;
                case 4:
                    System.out.println("        DIVISIÓN");
                    System.out.println("-------------------------");
                    System.out.print("Ingrese el númerador: ");
                    a = teclado.nextInt();
                    System.out.print("Ingrese el denominador: ");
                    b = teclado.nextInt();
                    while(b == 0){
                        System.out.println("ERROR! EL DENOMINADOR NO PUEDE SER CERO");
                        System.out.print("Ingrese el denominador: ");
                        b = teclado.nextInt();
                    }
                    c = a/b;
                    System.out.println("La división es: "+c);
                break;
                case 5:
                break;
                default:
                    System.out.println("OPCIÓN NO DISPONIBLE");
            }
        }while(opcion != 5);
    }
}
