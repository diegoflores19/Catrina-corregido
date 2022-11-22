/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.registrodeproducto.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import mx.itson.registrodeproducto.conexion.ConexionMysql;

/** Clase para el registro de los productos
 *
 * @author Diego Isaac Flore Grajeda
 */
public class Registro {
    ConexionMysql con = new ConexionMysql(); // se instacia la conexion
    Connection cn = con.conectar();
    
    // se crea el metodo que nos permitira registar los productos y se manda como para la metro la clase producto
    public void registrarbd(Producto p){
    
    try{
    PreparedStatement ps = cn.prepareStatement("INSERT INTO producto(nombre,cantidad,precio,total)VALUES(?,?,?,?)"); // creamos PreparedStatement que nos permitira poner la consulta que nos permitira registar 
    ps.setString(1, p.getNombre());//parametos
     ps.setInt(2, p.getCantidad());
      ps.setDouble(3, p.getPrecio());
       ps.setDouble(4, p.Total()); // aqui llamamos al metodo total que creamos en producto
        ps.executeUpdate();
        
        
        
    }catch (Exception e){
    JOptionPane.showMessageDialog(null, "ERRO AL REGISTRAR DATOS"+e);
    
    }
    
    }
    
    
}
