
import java.util.Scanner;


/**
 *
 * @author Sergio Varela 16550457
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Big O(2N)
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("de cuantos datos se desea el arreglo?");
        int size = scanner.nextInt();
        System.out.println("introduzca "+ size + " valores numericos");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("dato numero " + i );
            arr[i] = scanner.nextInt();
        }
        System.out.println("introduzca el numero a buscar");
        int find= scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if(arr[i]==find){
                System.out.println("el valor esta en la posicion "+ (i+1));
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("no se encotro el num");
        }
    }
    
}
