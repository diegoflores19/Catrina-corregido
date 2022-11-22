/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.registrodepodructo.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mx.itson.registrodeproducto.modelo.ListarProductos;
import mx.itson.registrodeproducto.modelo.Producto;
import mx.itson.registrodeproducto.modelo.Registro;
import mx.itson.registrodeproducto.ui.frm_RegistrarProducto;

/**Metodo del controlador del Registro 
 *
 * @author Diego Isaac Flores Grajeda
 */


public class Controlador_Frm_Registrar_Producto implements ActionListener{
    frm_RegistrarProducto frm_rp; // frm_rp = formulario regristrar producto

    public Controlador_Frm_Registrar_Producto(frm_RegistrarProducto frm_rp) {
        this.frm_rp = frm_rp;
        this.frm_rp.btnguardar.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==frm_rp.btnguardar){ //funciona para al momento de dar click en guarda se ejecute todo lo de abajo
            
            //recupermos los datos que se ingresen en la caja de texto 
            String nombre = frm_rp.txtnombre.getText();
            int cantidad = Integer.parseInt(frm_rp.txtcantidad.getText());
            Double precio = Double.parseDouble(frm_rp.txtprecio.getText());
            
            Producto P = new Producto(nombre, cantidad, precio); //se instacia la clase producto
            Registro R = new Registro(); //se instacia la clase registro
            R.registrarbd(P); // llamamos al metos registrarbd
            
            
            
           ListarProductos lp = new ListarProductos(); // se instacia la clase listarproductos
           lp.MostrarTable(frm_rp.TablaProductos);
           limpiarentradas();
        
        }
        
        
    }
    
     // metodo para limpiar las entrada
    private void limpiarentradas() {
    frm_rp.txtnombre.setText("");
    frm_rp.txtcantidad.setText("");
    frm_rp.txtprecio.setText("");
   
  
    }
    
}
