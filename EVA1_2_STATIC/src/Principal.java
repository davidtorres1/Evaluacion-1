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
        MiClasePrueba mcpObjeto = new MiClasePrueba();
        mcpObjeto.imprimirMensaje();
        System.out.println(mcpObjeto.sNom);
        
        MiClasePrueba2.imprimirMensaje();
        MiClasePrueba2.sNom = "David";
        System.out.println(MiClasePrueba2.sNom);
    }
    
}

class MiClasePrueba{
    public String sNom = "David";
    public void imprimirMensaje(){
        System.out.println("Hola mundo!");
    }
}

class MiClasePrueba2{
    public static String sNom = "David";
    public static void imprimirMensaje(){
            System.out.println("Hola mundo!");
    }
}
