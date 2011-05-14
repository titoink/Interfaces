
public class Factura implements PorPagar, Comparable{
    private String numeroPieza;
    private String descripcionPieza;
    private int  cantidad;
    private double precioPorArticulo;
    
    //constructor con cuatro argumentos
    public Factura (String pieza, String descripcion, int cuenta, 
            double precio){
        numeroPieza=pieza;
        descripcionPieza=descripcion;
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo (precio);
    }
    
    //establece el número de piezas 
    public void establecerNumeroPieza(String pieza){
        numeroPieza=pieza;
    }
    //obtener número de pieza
    public String ObtenerNumeroPieza(){
        return numeroPieza;
    }
    //Establece la Descripcion
    public void establecerDescripcionPieza(String descripcion){
        descripcionPieza = descripcion;
    }
    //obtiene la descripcion
    public String obtenerDescripcionPieza(){
        return descripcionPieza;
    }
    //establece la cantidad 
    public void establecerCantidad (int cuenta){
        cantidad = (cuenta < 0) ? 0: cuenta ;
    }
    //obtener cantidad
    public int obtenerCantidad(){
        return cantidad;
    }
    //establece el precio por artículo
    public void establecerPrecioPorArticulo (double precio){
        precioPorArticulo=(precio < 0.0) ? 0.0 : precio;
    }
    //obtiene el precio por artículo
    public double obtenerPrecioPorArticulo(){
        return precioPorArticulo;
    }
    public String toString(){
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "Factura", "numero de pieza",
                ObtenerNumeroPieza(),obtenerDescripcionPieza(), "cantidad", obtenerCantidad(), "precio por articulo", obtenerPrecioPorArticulo());
    }
    //metodo requerido para realizar el contrato con la interfaz PorPagar
    public double obtenerMontoPago() {
        return obtenerCantidad()*obtenerPrecioPorArticulo();
    }

    public void Talcosa(int recibo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean ParaComparar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }





}//FIn de la clase Factura
