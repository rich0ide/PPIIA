/*
Chimaltenango, 29 de julio de 2023
Programador: Ricardo José Sis Cabrera
Descripción del programa: Ejercicios For
*/
package I_PARCIAL;
public class EjerciciosFor {
    public static void main(String[] args) {
        /*
        for(int i = 1; i <= 50; i++){
             System.out.println(i);
         }
        
        for(int i = 50; i >= 1; i--){
             System.out.println(i);
         }
        
        for(int i = 0; i <= 99; i = i + 3){
             System.out.println(i);
         }

        */
        
        for(int k = 1; k <= 24; k++){
        if(k == 1 || k == 24){
        for(int i = 1; i <= 80; i++){
            System.out.print("x");
        }
        }else{
            System.out.print("x");
            for(int i = 1; i <= 78; i++){
            System.out.print(" ");
            }
            System.out.print("x");
        }
        System.out.println("");
        }
        
        for(int h = 0; h <= 23; h++){
            for(int m = 0; m <= 59; m++){
                for(int s = 0; s <= 59; s++){
                    System.out.println(h + " : " + m + " : " + s);
                }
            }
        }
        
        
    }
}
