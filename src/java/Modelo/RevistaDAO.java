
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RevistaDAO {
    //Instanciando la conexión a la base de datos
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
     int r;
     
     public Revista buscar(String dni){
     Revista libroEncontrado = new Revista();
     String sql = "SELECT id_biblioteca, codigo_material, nombre_ejemplar, ISBN, numero_paginas, fecha_publicacion, cantidad, estado_material_id_estado_material, genero_id_genero, editorial_id_editorial, autor_id_autor  FROM biblioteca WHERE codigo_material="+dni;
         try {
             con=cn.Conexion();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while (rs.next()){
                 libroEncontrado.setId_biblioteca(rs.getInt(1));
                libroEncontrado.setCodigo_material(rs.getString(2));
                libroEncontrado.setNombre_ejemplar(rs.getString(3));
                libroEncontrado.setISBN(rs.getString(4));
                libroEncontrado.setNumero_paginas(rs.getInt(5));
                libroEncontrado.setFecha_publicacion(rs.getString(6));
                libroEncontrado.setCantidad(rs.getInt(7));
                libroEncontrado.setEstado_material_id_estado_material(rs.getInt(8));
                libroEncontrado.setGenero_id_genero(rs.getInt(9));
                libroEncontrado.setEditorial_id_editorial(rs.getInt(10));
                libroEncontrado.setAutor_id_autor(rs.getInt(11));
             
             }
         } catch (Exception e) {
         }
         return libroEncontrado;
     }
    
    //OPERACIONES CRUD
    
 public List listar(){
        String sql="SELECT id_biblioteca, codigo_material, nombre_ejemplar, ISBN, numero_paginas, fecha_publicacion, cantidad, estado_material_id_estado_material, genero_id_genero, editorial_id_editorial, autor_id_autor, tipo_material_id_tipo_material  FROM biblioteca WHERE tipo_material_id_tipo_material = 2";
        List<Revista>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Revista rev=new Revista();
                rev.setId_biblioteca(rs.getInt(1));
                rev.setCodigo_material(rs.getString(2));
                rev.setNombre_ejemplar(rs.getString(3));
                rev.setISBN(rs.getString(4));
                rev.setNumero_paginas(rs.getInt(5));
                rev.setFecha_publicacion(rs.getString(6));
                rev.setCantidad(rs.getInt(7));
                rev.setEstado_material_id_estado_material(rs.getInt(8));
                rev.setGenero_id_genero(rs.getInt(9));
                rev.setEditorial_id_editorial(rs.getInt(10));
                rev.setAutor_id_autor(rs.getInt(11));
                rev.setTipo_material_id_tipo_material(rs.getInt(12));
                lista.add(rev);
            }       
        }catch (SQLException e) {
            
    }
        return lista;
    
    }
    public int agregar(Revista rev){
            String sql="INSERT INTO biblioteca(codigo_material, nombre_ejemplar, ISBN, numero_paginas, fecha_publicacion, cantidad, estado_material_id_estado_material, genero_id_genero, editorial_id_editorial, autor_id_autor, tipo_material_id_tipo_material)VALUES(?,?,?,?,?,?,?,?,?,?,1)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, rev.getCodigo_material());
            ps.setString(2, rev.getNombre_ejemplar());
            ps.setString(3, rev.getISBN());
            ps.setInt(4, rev.getNumero_paginas());
            ps.setString(5, rev.getFecha_publicacion());
            ps.setInt(6, rev.getCantidad());
            ps.setInt(7, rev.getEstado_material_id_estado_material());
            ps.setInt(8, rev.getGenero_id_genero());
            ps.setInt(9, rev.getEditorial_id_editorial());
            ps.setInt(10, rev.getAutor_id_autor());

            ps.executeUpdate();
            
        }catch (SQLException e) {
            
    }
        return r;
    }
    
    public Revista listarId(int id_bibli1){
            Revista rev = new Revista();
            String sql="SELECT id_biblioteca, codigo_material, nombre_ejemplar, ISBN, numero_paginas, fecha_publicacion, cantidad, estado_material_id_estado_material, genero_id_genero, editorial_id_editorial, autor_id_autor FROM biblioteca WHERE id_biblioteca="+id_bibli1;
            try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
              rs=ps.executeQuery();
              while(rs.next()){
              
                rev.setId_biblioteca(rs.getInt(1));
                rev.setCodigo_material(rs.getString(2));
                rev.setNombre_ejemplar(rs.getString(3));
                rev.setISBN(rs.getString(4));
                rev.setNumero_paginas(rs.getInt(5));
                rev.setFecha_publicacion(rs.getString(6));
                rev.setCantidad(rs.getInt(7));
                rev.setEstado_material_id_estado_material(rs.getInt(8));
                rev.setGenero_id_genero(rs.getInt(9));
                rev.setEditorial_id_editorial(rs.getInt(10));
                rev.setAutor_id_autor(rs.getInt(11));
               //  lib.setTipo_material_id_tipo_material(rs.getInt(12));
              }
        }catch (SQLException e) {
                // Manejo de excepciones: Agrega lógica para manejar la excepción
                
    }
        return rev;
        
        
    }
    public int actualizar(Revista rev){
           String sql="UPDATE biblioteca SET codigo_material=?, nombre_ejemplar=?, ISBN=?, numero_paginas=?, fecha_publicacion=?, cantidad=?, estado_material_id_estado_material=?, genero_id_genero=?, editorial_id_editorial=?, autor_id_autor=? WHERE id_biblioteca=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, rev.getCodigo_material());
            ps.setString(2, rev.getNombre_ejemplar());
            ps.setString(3, rev.getISBN());
            ps.setInt(4, rev.getNumero_paginas());
            ps.setString(5, rev.getFecha_publicacion());
            ps.setInt(6, rev.getCantidad());
            ps.setInt(7, rev.getEstado_material_id_estado_material());
            ps.setInt(8, rev.getGenero_id_genero());
            ps.setInt(9, rev.getEditorial_id_editorial());
            ps.setInt(10, rev.getAutor_id_autor());
            ps.setInt(11, rev.getId_biblioteca());

            ps.executeUpdate();
            
        }catch (SQLException e) {
            
    }
        return r;
}
    public void delete(int id_bibli){
        String sql="DELETE FROM biblioteca WHERE id_biblioteca="+id_bibli;
        try {
             con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
     
    }
    
    }
}
    
    
    

