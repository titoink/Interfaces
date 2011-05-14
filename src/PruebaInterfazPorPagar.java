/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -DN-
 */
public class PruebaInterfazPorPagar {
    public static void main (String args []){
        PorPagar objetosPorPagar [] = new PorPagar [4];

        objetosPorPagar [0]= new Factura ("01234","asiento",2,375.00);
        objetosPorPagar [1]= new Factura ("56789","llanta",4,79.00);
        objetosPorPagar [2]= new EmpleadoAsalariado("John", "Smith", "2557-23-45", 800.00);
        objetosPorPagar [3]= new EmpleadoAsalariado ("Lisa", "Cole", "2222-66-622",1200.00);

        System.out.println("Facturas y Empleados procesados en forma polimorfica:\n");

        for (PorPagar porPagarActual : objetosPorPagar){
            System.out.printf("%s \n%s: $%,.2f\n\n",porPagarActual.toString(), "pago vencido",porPagarActual.obtenerMontoPago());
        }
    }

}
