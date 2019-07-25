package universidad;

/**
 *
 * @author cymaniatico
 */
public class Catedratico extends Docente{
    
    private String fechaInicio, fechaFin;
    
    public Catedratico(String tipoDocumento, String documento, String apellidos, 
            String nombres, int edad, boolean activo, String profesion, 
            String asignatura,
            String fechaInicio, String fechaFin) {
        super(tipoDocumento, documento, apellidos, nombres, edad, activo, profesion, asignatura);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        
    }
    
    public String mostrar(){
        String resultado = "";
        resultado = mostrarInfo()+"\t"+asignatura+"\t"+profesion+"\t"+
                fechaInicio+"\t"+fechaFin;
        return resultado;
    }
    
}
