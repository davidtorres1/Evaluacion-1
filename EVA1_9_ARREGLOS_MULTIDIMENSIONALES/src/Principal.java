/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Arreglos multidimensionales arreglos de arreglos
        //matriz de 2x2
        int aiMatriz[][] = new int [2][2]; //4 enteros
        for (int i = 0; i < 2; i++) {//recorrer cada fila
            for (int j = 0; j < 2; j++) {//cada columna
                aiMatriz[i][j] = (int)(Math.random() * 10) + 1 ; // llenar 1-10
            }
        }
         //IMPRIMIR
        
        //print se mantiene en la linea actual
        //print ln se cambia de lines
        for (int i = 0; i < 2; i++) {//recorrer cada fila
            for (int j = 0; j < 2; j++) {//cada columna
                System.out.print("[" + aiMatriz[i][j] + "]");
            }
            System.out.println("");//NOS CAMBIA DE LINEA
        }
        //USANDO FOR EACH
        for (int[] aiMatriz1 : aiMatriz) {//recorre cada fila ----> arreglo
            //USANDO OTRO FOR EACH  //recorrer columnas
            for (int b : aiMatriz1) {
                System.out.print("[" + b + "]");
            }
            System.out.println("");
        }
    }
    
}
