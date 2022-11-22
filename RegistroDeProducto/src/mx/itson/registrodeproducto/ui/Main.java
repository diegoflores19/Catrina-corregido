/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.registrodeproducto.ui;
import mx.itson.registrodepodructo.controlador.Controlador_Frm_Registrar_Producto;
import mx.itson.registrodeproducto.modelo.ListarProductos;
import mx.itson.registrodeproducto.ui.frm_RegistrarProducto;

/**
 *
 * @author Diego Isaac Flore Grajeda
 */
public class Main {
    
    public static frm_RegistrarProducto frm_rp;
    public static Controlador_Frm_Registrar_Producto c_frm_rp; //c_frm_rp = controlador del formulario registrar producto
    public static ListarProductos lp; //hacemos referancia al listado
    public static void main(String[] args){
        
        frm_rp = new  frm_RegistrarProducto(); // se intacia el frm
        frm_rp.setVisible(true);
        frm_rp.setLocationRelativeTo(null); //esto es para que se centre la tabla
                
        c_frm_rp = new Controlador_Frm_Registrar_Producto(frm_rp); // se intacia el controlador y como paramero es la vista
        
        // esto es para que nos muestre en la tabla los registros que hemos echo y no este vacia
        lp = new ListarProductos();
        lp.MostrarTable(frm_rp.TablaProductos);
        
    }  
    
    
}
