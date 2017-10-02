
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String caso;
        double matriz[][]=new double[5][12];
        double [][] matriz2 = {{30.0,32.0,34.0,38.8,39.6,41.4,41.6,39.2,39.0,35.0,34.6,29.0},
            {18.1,21.2,24.2,27.9,32.2,34.0,32.1,30.3,29.2,26.8,21.9,18.2},
            {10.0,12.9,15.7,19.2,23.6,26.3,25.6,24.3,22.6,18.7,13.7,10.3},
            {2.0,4.5,7.1,10.4,14.9,18.6,19.1,18.2,16.0,10.7,5.5,2.4},
            {-12.8,-18.0,-5.8,-3.4,3.8,6.1,10.6,10.0,3.7,-2.4,-6.1,-11.5}};
        System.out.println("Ingresa el número del parametro\n"
                + "1.-Record de temperatura mas alta °C\n"
                + "2.-Promedio alto °C\n"
                + "3.-Media diaria °C\n"
                + "4.-Promedio bajo °C\n"
                + "5.-Record de temperatura mas baja °C");
        int param = sc.nextInt();
        switch(param){
            case 1: 
                caso = "El Record de temperatura mas alta °C ";
                break;
            case 2: 
                caso = "El Promedio alto °C ";
                break;
            case 3: 
                caso = "La Media diaria °C ";
                break;
            case 4: 
                caso = "El Promedio bajo °C ";
                break;
            case 5:
                caso = "El Record de temperatura mas baja °C ";
                break;
            default:caso= "";
        }
                
        System.out.println("Que mes?");
        int mes = (sc.nextInt());
        if(mes>12){System.out.println("Introduzca un mes");}
        if(param>5){System.out.println("Introduzca un parametro");}
        else{
            System.out.println( caso +" del mes "+(mes)+" es: "+matriz2[param-1][mes-1]+"°C ");
        }
    }
}
