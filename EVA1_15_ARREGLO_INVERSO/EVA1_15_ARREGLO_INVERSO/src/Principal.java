
import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("¿Cuantos datos?");
        int iDatos = sCaptu.nextInt();
        int aiArreglo[] = new int[iDatos];
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.println("Introdusca los datos que desee imprimir: ");
            aiArreglo[i] = sCaptu.nextInt();
        }  
        int aiInverso[] = new int[aiArreglo.length];
       // for (int i = 0; i < aiArreglo.length; i++) {
         //   for (int j = aiInverso.length-1;j < aiInverso.length; j--) {
           //     aiInverso[i] = aiArreglo[j];
             //   System.out.println(aiInverso[j]);
            //}
        //}
        for(int i = 0, j =aiInverso.length-1;i < aiArreglo.length; i++, j--){
            aiInverso[i] = aiArreglo[j];
            System.out.println(aiInverso[i]);
        }
        }
        
  }
    





