/**
 *
 * @author temporal2
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiMisNum[]= new int[10];
            //for each
        for (int i = 0; i < 10; i++) {
            aiMisNum[i] = (int)(Math.random()*10)+1;
            for(int x: aiMisNum){  //int x; for(int i = 0; i<10; i++){}
                System.out.println(" x = " + x);
        }
            //MULTIPLES ARREGLOS
            int[] aiArreglo1, aiArreglo2,aiArreglo3; //TODOS SON ARREGLOS
            aiArreglo1 = new int[3];
            aiArreglo2 = new int [10];
            aiArreglo3 = new int [100];
            
            //ARREGLO Y VARIABLES 
            int aiArre[], iVar, iVar2;//REFERENCIA A MEMORIA
            aiArre = new int[10];
            iVar = 10;
            iVar = 30;
        }
    }
    
}
