
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
        //PREEGUNTAR CUANTAS EDADES SE VAN A CAPTURAR
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Cuantas edades se van a capturar ");
        int iCant = sCaptu.nextInt(); //CANTIDAD A CAPTURAR
        //INICIALIZAR EL ARREGLO
        int aiEdades[] = new int[iCant];
        //CAPTURAR
        for (int i = 0; i < iCant; i++) {
            System.out.println("Introduce la edad: ");
            aiEdades[i] = sCaptu.nextInt();
        }
        //CALCULAR EL PROMEDIO
        int iAcum = 0;
        for (int iVal : aiEdades) {
            iAcum += iVal; //iAcum = iAcum + iVal; EQUIVALENTE
        }
        double dProm = iAcum/iCant;
        System.out.println("El promedio es: " + dProm);
    }
    
}
