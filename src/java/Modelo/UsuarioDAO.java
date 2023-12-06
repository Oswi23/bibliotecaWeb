
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class UsuarioDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

public Usuario validar(String carnet, String pass){

     Usuario us = new Usuario();
     String sql = "SELECT * FROM usuario WHERE carnet = ? and pass = ?";
     try {
         con = cn.Conexion();
         ps = con.prepareStatement(sql);
         ps.setString(1, carnet);
         ps.setString(2, pass);
        rs = ps.executeQuery();
        
        while (rs.next()){
                us.setId_usuario(rs.getInt("id_usuario"));
                us.setCarnet(rs.getString("carnet"));
                us.setPass(rs.getString("pass"));
                us.setNombre_user(rs.getString("nombre_user"));
                 us.setCorreo(rs.getString("correo"));
        
        }
    } catch (SQLException e) {
         // Manejo de excepciones: Agrega lógica para manejar la excepción
         
    }
        return us;
}
    //Operaciones CRUD
    
    public List listar(){
        String sql="SELECT id_usuario, carnet, nombre_user, apellido_user, correo, pass, genero, estado_user, id_perfil  FROM usuario";
        List<Usuario>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Usuario us=new Usuario();
                us.setId_usuario(rs.getInt(1));
                us.setCarnet(rs.getString(2));
                us.setNombre_user(rs.getString(3));
                us.setApellido_user(rs.getString(4));
                us.setCorreo(rs.getString(5));
                us.setPass(rs.getString(6));
                us.setGenero(rs.getString(7));
                us.setEstado_user(rs.getString(8));
                us.setId_perfil(rs.getInt(9));
                lista.add(us);
            }       
        }catch (SQLException e) {
            
    }
        return lista;
    
    }
    public int agregar(Usuario us){
            String sql="INSERT INTO usuario(carnet, nombre_user, apellido_user, correo, pass, genero, estado_user, id_perfil)VALUES(?,?,?,?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, us.getCarnet());
            ps.setString(2, us.getNombre_user());
            ps.setString(3, us.getApellido_user());
            ps.setString(4, us.getCorreo());
            ps.setString(5, us.getPass());
            ps.setString(6, us.getGenero());
            ps.setString(7, us.getEstado_user());
            ps.setInt(8, us.getId_perfil());

            ps.executeUpdate();
            
        }catch (SQLException e) {
            
    }
        return r;
    }
    
    public Usuario listarId(int id_user){
            Usuario us = new Usuario();
            String sql="SELECT id_usuario, carnet, nombre_user, apellido_user, correo, pass, genero, estado_user, id_perfil FROM usuario WHERE id_usuario="+id_user;
            try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
              rs=ps.executeQuery();
              while(rs.next()){
              
                   us.setId_usuario(rs.getInt(1));
                   us.setCarnet(rs.getString(2));
                   us.setNombre_user(rs.getString(3));
                   us.setApellido_user(rs.getString(4));
                   us.setCorreo(rs.getString(5));
                   us.setPass(rs.getString(6));
                   us.setGenero(rs.getString(7));
                   us.setEstado_user(rs.getString(8));
                   us.setId_perfil(rs.getInt(9));

              }
        }catch (SQLException e) {
                // Manejo de excepciones: Agrega lógica para manejar la excepción
                
    }
        return us;
        
        
    }
    public int actualizar(Usuario us){
          String sql="UPDATE usuario SET carnet=?, nombre_user=?, apellido_user=?, correo=?, pass=?, genero=?, estado_user=?, id_perfil=? WHERE id_usuario=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, us.getCarnet());
            ps.setString(2, us.getNombre_user());
            ps.setString(3, us.getApellido_user());
            ps.setString(4, us.getCorreo());
            ps.setString(5, us.getPass());
            ps.setString(6, us.getGenero());
            ps.setString(7, us.getEstado_user());
            ps.setInt(8, us.getId_perfil());
            ps.setInt(9, us.getId_usuario());
            ps.executeUpdate();
            
        }catch (SQLException e) {
              // Manejo de excepciones: Agrega lógica para manejar la excepción
   
              
    }
    
    return r;
}
    public void delete(int id_user){
        String sql="DELETE FROM usuario WHERE id_usuario="+id_user;
        try {
             con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
     
    }
    
    }
}
