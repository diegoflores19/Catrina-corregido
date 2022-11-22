/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.registrodeproducto.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mx.itson.registrodeproducto.conexion.ConexionMysql;

/**Clase para Mostrar los datos en la tabla
 *
 * @author Diego Isaac Flore Grajeda
 */
public class ListarProductos {
    ConexionMysql con = new ConexionMysql(); //se instacia la clase conexion
    Connection cn=con.conectar();
    
    // se crea el metodo para mostrar la tabla y se pasa como parametro un JTable
    public void MostrarTable(JTable tabla){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Cantidad");
    modelo.addColumn("Precio");
    modelo.addColumn("Total");

    String consultasql="SELECT*FROM producto";
    Statement st;
    try{
    st=cn.createStatement();
    ResultSet rs=st.executeQuery(consultasql);
    while(rs.next()){
    Object[] lista={rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5)}; //se crea un object para todas las posiciones que queremos que se inserte en la tabla 
    modelo.addRow(lista);
    }   
    tabla.setModel(modelo);
    }catch (Exception e){
        System.out.println("ERROR AL LISTAR LOS DATOS"+e);
    
    }
    
    
    
    
    }
    
}
