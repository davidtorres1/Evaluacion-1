
import java.util.Scanner;

/**
 *
 * @author dany
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cantidad, suma = 0;
        double promedio, promedio2, res= 0, var, desv;
        System.out.println("¿Cuantas edades?");
        cantidad = sc.nextInt();
        int[] array = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduzca las edades: ");
            array[i] = sc.nextInt();
        }
        for (int i : array) {
            suma = suma + i;
        }
        promedio = (double)(suma)/(double)(cantidad);
        System.out.println("El promedio es: " + promedio);
        
        for (int i : array) {
            var = i - promedio;
            res = res + Math.pow(var,2);
        }
        promedio2 = res/cantidad;
        desv = Math.sqrt(promedio2);
        System.out.println("La desviación estandar es: " + desv);
        
        
    }
    
}
