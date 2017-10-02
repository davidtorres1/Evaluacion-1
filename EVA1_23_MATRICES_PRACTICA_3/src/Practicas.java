
/**
 *
 * @author David
 */
public class Practicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*100+1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
                }
        System.out.println();
        int[][] matrizInv = new int[matriz.length][matriz.length];
        int filas = matriz.length-1, columnas = matriz[0].length-1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matrizInv.length; j++) {
                matrizInv[filas][columnas] = matriz[i][j];
                columnas--;
            }
            filas--;
            columnas = matriz.length-1;          
        }
        for (int[] is : matrizInv) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
            
        }
}
  

  
   
