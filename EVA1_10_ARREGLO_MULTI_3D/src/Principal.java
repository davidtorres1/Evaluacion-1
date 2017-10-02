/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CUBO (3 DIMENSIONES)
        int aiArreglo3D[][][] = new int [3][3][3];
        //RECORRERLO Y LLENARLO DE ENTEROS
        for (int i = 0; i < 3; i++) {//FILAS
            for (int j = 0; j < 3; j++) {//COLUMNAS
                for (int k = 0; k < 3; k++) {//NIVELES
                    aiArreglo3D[i][j][k] = (int)(Math.random() * 100) + 1;
                }
            }
        }
        //IMPRIMIR
        for (int i = 0; i < 3; i++) {//FILAS
            for (int j = 0; j < 3; j++) {//COLUMNAS
                for (int k = 0; k < 3; k++) {//NIVELES
                    System.out.println("[" + aiArreglo3D[i][j][k] + "]");
                }
            }
        }
    }
    
}
