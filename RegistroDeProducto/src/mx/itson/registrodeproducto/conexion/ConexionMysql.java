/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.registrodeproducto.conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**Conexion hacia la base de datos 
 *
 * @author Diego Isaac Flore Grajeda
 */
public class ConexionMysql {
    
    Connection cn;
    
    public Connection conectar(){
    
    try{
    Class.forName("com.mysql.jdbc.Driver"); // se hace referencia al driver de la conexion
    cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/registrodeproducto","root",""); //se agrega la url para conectarse a la base de datos
        System.out.println("Conexion Exitosa");
    
    }catch (Exception e){
        System.out.println("ERROR DE CONEXION"+e);
    }
        return cn;
    
    }
    
}
