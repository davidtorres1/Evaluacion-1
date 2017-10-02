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
        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];
        int[][] matrizRes = new int[matriz1.length][matriz2[0].length];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int)(Math.random()*9+1);
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int)(Math.random()*9+1);
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                   matrizRes[i][j] = matriz1[i][j] * matriz2[i][j];
                System.out.print(matrizRes[i][j] + " ");                                
            }
            System.out.println();
        }
    }
    
}
