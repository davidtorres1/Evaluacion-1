
import java.util.Scanner;



/**
 *
 * @author David
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sNom;
        int iEdad;
        double dSalario;
        
        Scanner sScanner = new Scanner(System.in);
        
        System.out.println("¿Cual es tu nombre?");
        sNom = sScanner.nextLine();
        
        System.out.println("¿Cual es tu edad?");
        iEdad = sScanner.nextInt();
        
        System.out.println("Cual es tu salario?");
        dSalario = sScanner.nextDouble();
        
        hacerAlgo(sNom, iEdad, dSalario);
    }
    
    public static void hacerAlgo(String sNombre, int iEdad, double dSalario){
        System.out.println(sNombre + " " + iEdad + " " + dSalario);
    }
    
}
