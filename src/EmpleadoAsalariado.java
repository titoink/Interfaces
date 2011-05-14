/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -DN-
 */
public class EmpleadoAsalariado extends Empleado{

    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss,
            double salario){
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario); //valida y almacena el salario;
    }
    public void establecerSalarioSemanal(double salario){
        salarioSemanal= salario < 0.0 ? 0.0 : salario;
    }
    public double obtenerSalarioSemanal(){
        return salarioSemanal;
    }
  
    public String toString(){
        return String.format("empleado asalariado: %s\n%s: $%,.2f",
                super.toString(),"salario semanal", obtenerSalarioSemanal());
    }

    public double obtenerMontoPago() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void Talcosa(int recibo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
