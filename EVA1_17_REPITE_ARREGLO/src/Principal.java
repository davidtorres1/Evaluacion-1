
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
        int arrayLength, count = 0, repetido;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De que tamaño el arreglo?");
        arrayLength = sc.nextInt();
        int array[] = new int [arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Ingresa los números");
            array[i] = sc.nextInt();
        }
        System.out.println("¿Que número quieres saber si se repite?");
        repetido = sc.nextInt();
        for (int b : array) {
            if(repetido == b){
                count++;
            }
        }
        System.out.println("El número se repite " + count + " veces.");
    }
    
}
