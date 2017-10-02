package eva1_20_numeros_primos;

/**
 *
 * @author temporal2
 */
public class EVA1_20_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 357957627;
        
        for (int i = 2; i < n-1; i++) {
            if(n % i == 0){
                System.out.println("No es primo");
                break;
            }
            if (n % i != 0){
                System.out.println("Es primo");
                break;
            }
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                System.out.println("No es primo");
                break;
            }
            if(n % i != 0){
                System.out.println("Es primo");
                break;
            }
        }
    }
    
}
