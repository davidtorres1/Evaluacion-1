
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
        Alumno aaDatosAlumno[], copiaArreglo[]; //El identificador es nulo
        aaDatosAlumno = new Alumno[10]; //Creamos un arreglo de 10 alumnos
        copiaArreglo = new Alumno[aaDatosAlumno.length];
        
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumno[i] = new Alumno("David", "16550497", 0);
        }
        
        for (Alumno aaDatosAlumno1 : aaDatosAlumno) {
            System.out.println("Nombre: " + aaDatosAlumno1.getsNom());
            System.out.println("Matricula: " + aaDatosAlumno1.getsMatri());
            System.out.println("Carrera: " + aaDatosAlumno1.getiCar());
        }
        
        //CREAR UNA COPIA DEL ARREGLO
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            copiaArreglo[i] = new Alumno(aaDatosAlumno[i].getsNom(),
                                         aaDatosAlumno[i].getsMatri(),
                                         aaDatosAlumno[i].getiCar());
        }
        //IMPRIMIR LA COPIA
        for (Alumno copiaArreglo1 : copiaArreglo) {
            System.out.println("Nombre: " + copiaArreglo1.getsNom());
            System.out.println("Matricula: " + copiaArreglo1.getsMatri());
            System.out.println("Carrera: " + copiaArreglo1.getiCar());
        }
        System.out.println(aaDatosAlumno);
        System.out.println(copiaArreglo);
    }
    
}

class Alumno{
    private String sNom;
    private String sMatri;
    private int iCar;
    
    
    public Alumno(String sNombre, String sMatricula, int iCarrera){
        sNom = sNombre;
        sMatri = sMatricula;
        iCar = iCarrera;
    }

    Alumno(String sNom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsMatri() {
        return sMatri;
    }

    public void setsMatri(String sMatri) {
        this.sMatri = sMatri;
    }

    public int getiCar() {
        return iCar;
    }

    public void setiCar(int iCar) {
        this.iCar = iCar;
    }
    
    
}
