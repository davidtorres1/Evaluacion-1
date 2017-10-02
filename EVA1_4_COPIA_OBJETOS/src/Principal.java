
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
        int i = 5;
        System.out.println("i = " + i);
        //crear una copia de i
        int iCopia = i; //asignamos el valor de i a la variable i copia
        i++;
        System.out.println("i++" + i);
        System.out.println("iCopia = " + iCopia);
        //declarar un objeto de tipo numero
        Numero nVal = new Numero(); // creamos el objeto
        System.out.println("El valor de nVal.i = " + nVal.i);
        
        //copia real de un objeto
        Numero nCopiaReal = new Numero();
        nCopiaReal.i = nVal.i;
    }
    
}

class Numero{
    public int i = 5;
}
