/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.registrodeproducto.modelo;

/**Metodos y Atributos de la entidad Producto
 *
 * @author Diego Isaac Flores Grajeda
 */
public class Producto {
    private String nombre;
    private int cantidad;
    private Double precio;
    private Double total;

    // se crea el constructor 
    public Producto(String nombre, int cantidad, Double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    /** Obtiene el valor del nombre 
     * 
     * @return el atributo nombre
     */

    public String getNombre() {
        return nombre;
    }
    
   /** Asigna el valor del nombre 
   * 
   * @param nombre el valor del atributo nombre
   */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**Obtiene el valor de la cantidad
     * 
     * @return el atributo cantidad
     */

    public int getCantidad() {
        return cantidad;
    }
    
    /** Asigna el valor de la cantidad
     * 
     * @param cantidad el valor del atributo cantidad
     */
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /** Obtiene el valor del precio
     * 
     * @return el atributo precio
     */
    
    public Double getPrecio() {
        return precio;
    }
    
    /** Asigna el valor del precio
     * 
     * @param precio el valor del atributo precio
     */
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    /** Obtiene el valor del total
     * 
     * @return el atributo total
     */
    
    public Double getTotal() {
        return total;
    }
    
    /** Asigna el valor del total
     * 
     * @param total el valor del atributo total
     */
    
    public void setTotal(Double total) {
        this.total = total;
    }
    
    
    // se crea el metodo para que calculo el total, que es la cantidad x el precio
    public Double Total(){
    Double total=cantidad*precio;
    return total;
    }
    
}
