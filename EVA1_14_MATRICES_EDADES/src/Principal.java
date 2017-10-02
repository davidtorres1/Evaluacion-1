
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
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("¿Cuantos grupos? ");
        int iGrupos = sCaptu.nextInt();
        //CANTIDAD DE GRUPOS
        int mGrupos[][] = new int [iGrupos][]; //N GRUPOS
        //PARA CADA GRUPO, PREGUNTAR EL NÚMERO DE ALUMNOS
        int iNoAlu;
        for (int i = 0; i < iGrupos; i++) {
            //PREGUNTAR EL NÚMERO DE ALUMNOS
            System.out.println("Número de alumnos para el grupo " + (i+1) + ":" );
            iNoAlu = sCaptu.nextInt();
            mGrupos[i] = new int [iNoAlu];
            }
        //PEDIR LOS DATOS
        for (int i = 0; i < iGrupos; i++) { //FILAS ---> GRUPOS
            for (int j = 0; j < mGrupos[i].length; j++) {
                System.out.println("Edad Grupo " + i + ":");
                mGrupos[i][j] = sCaptu.nextInt();
            }
          }
        //CALCULAR LOS PROMEDIOS
        int iAcum;
        int dProm;
        for (int i = 0; i < iGrupos; i++) {
            iAcum = 0;
            dProm = 0;
            for (int j = 0; j < mGrupos[i].length; j++) { //ALUMNOS GRUPO ACTUAL
                iAcum += mGrupos[i][j]; //SUMATORIA DE TODAS LAS EDADES
            }
            dProm = iAcum / mGrupos[i].length;
            System.out.println("Para el grupo " + i + ", el promedio de " + "edad es: " + dProm);
        }
        }
    }
    

