
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
        String asMeses[] = {"Enero", "Febrero", "Marzo",
                            "Abril", "Mayo", "Junio", 
                            "Julio", "Agosto", "Septiembre", 
                            "Octubre", "Noviembre", "Diciembre"};
        //DIAS
        int aiDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //SOLICITA EL MES AL USUARIO
        int iMes;
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Numero de mes (1 - 12): ");
        iMes = sCaptu.nextInt();
        System.out.println("El mes es " + asMeses[iMes - 1] + " "
                         + "y tiene " + aiDias[iMes - 1] + " dias");
    }
    
}
