/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proysena;
 import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author maral
 */
public class Proysena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            String usuario ="root";
            String password="Cri115208";
            String url="jdbc:mysql://localhost:3306/prueba";
            
            //Creación de objetos
            Connection conexion;
            Statement st;
            ResultSet rs;
        
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Proysena.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            try {
                    conexion=DriverManager.getConnection(url, usuario, password);
                    st=conexion.createStatement();
                   /*
                    rs=st.executeQuery("SELECT * FROM usuarios");
                    //método para realizar todo el recorrido por la base de datos
                    
                    rs.next();
                    do{
                        System.out.println(rs.getInt("id")+" : "+ rs.getString("nomusu"));
                    } while (rs.next());*/
                    
                     //sentencia INSERT - para INSERTAR datos
                   /* st.executeUpdate("INSERT INTO usuarios VALUES(4, 'Juan', '3334')");
                    rs=st.executeQuery("SELECT * FROM usuarios");
                    rs.next();
                    do{
                        System.out.println(rs.getInt("id")+" : "+ rs.getString("nomusu"));
                    } while (rs.next()); */
         
                   

                     
                    // Update - Actualizar datos
                    
                  /*  st.executeUpdate("UPDATE usuarios SET nomusu='Clara' WHERE id=3");
                    rs=st.executeQuery("SELECT * FROM usuarios");
                    rs.next();
                    do{
                        System.out.println(rs.getInt("id")+" : "+ rs.getString("nomusu"));
                    } while (rs.next());

                   */


                    //DELETE: Borra el dato seleccionado.
                    
                     st.executeUpdate("DELETE FROM USUARIOS WHERE id=5");
                    rs=st.executeQuery("SELECT * FROM usuarios");
                    rs.next();
                    do{
                        System.out.println(rs.getInt("id")+" : "+ rs.getString("nomusu"));
                    } while (rs.next());
         
                                } catch (SQLException ex) {
                      Logger.getLogger(Proysena.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
    }
    
}
