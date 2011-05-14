/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -DN-
 */
public abstract class Empleado implements PorPagar{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    //constructor
    public Empleado (String nombre, String apellido, String nss){
        primerNombre=nombre;
        apellidoPaterno=apellido;
        numeroSeguroSocial=nss;
    }
    public void establecerPrimerNombre(String nombre){
         primerNombre=nombre;
    }
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    public void establecerApellidoPaterno (String apellido){
        apellidoPaterno=apellido;
    }
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    public void establecerNumeroSeguroSocial (String nss){
        numeroSeguroSocial = nss;
    }
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    public String toString(){
        return String.format("%s %s \nnumero de seguro social: %s",
                obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial() );
    }

    //aqui no se implemento el método obtenerMontoPago de la interfaz por pagar, asi que
    //esta clase debe declararse abstract para evitar un error de compilación.

}
