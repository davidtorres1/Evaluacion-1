/**
 *
 * @author David
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i == j){
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        } 
    }
    
}
