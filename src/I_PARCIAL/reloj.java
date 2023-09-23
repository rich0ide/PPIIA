
package I_PARCIAL;

public class reloj {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 24; i++){
            if(i == 24){
                System.out.println("00:00:00");
                return;
            }
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {    
                    System.out.println(i+ ":" + j +":" + k );
                    Thread.sleep(900);
                }
            }
        }
    }
}
