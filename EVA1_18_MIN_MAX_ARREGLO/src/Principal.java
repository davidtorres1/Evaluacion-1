
import java.util.Arrays;
import java.util.Scanner;

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
        int cantNum, arrayLength;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De que tamaño el arreglo?");
        arrayLength = sc.nextInt();
        int array[] = new int [arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Introduce los números");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("El valor minimo es: " + array[0]);
        System.out.println("El valor maximo es: " + array[array.length - 1]);
    }
    
}
