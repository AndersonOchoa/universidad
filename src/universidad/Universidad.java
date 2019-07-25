package universidad;

/**
 *
 * @author cymaniatico
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumnos a1, a2;
        Administrativo ad1;
        Catedratico c1;
        Planta p1;
        
        a1 = new Alumnos("TI","1004679263", "Perez Meza",
                "Alejandro Antonio", 17, true, "2019114002", "Ingenieria", "Sistemas", 1);
        System.out.println(a1.mostrar());
        c1 = new Catedratico("CC", "198302874", "Benito Camela", "Maria", 20, true, "Ing. Sistemas", "Algoritmos", "01/01/2019", "31/12/2019");
        System.out.println(c1.mostrar());
        
        ad1 = new Administrativo("CC", "12345667", "Garcia", "Luis", 21, true, "Desarrollador", "01/01/2019");
        System.out.println(ad1.mostrar());
        
    }
    
}
