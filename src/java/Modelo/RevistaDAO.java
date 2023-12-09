
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
     
     public Libro buscar(String dni){
     Libro libroEncontrado = new Libro();
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
        List<Libro>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Libro lib=new Libro();
                lib.setId_biblioteca(rs.getInt(1));
                lib.setCodigo_material(rs.getString(2));
                lib.setNombre_ejemplar(rs.getString(3));
                lib.setISBN(rs.getString(4));
                lib.setNumero_paginas(rs.getInt(5));
                lib.setFecha_publicacion(rs.getString(6));
                lib.setCantidad(rs.getInt(7));
                lib.setEstado_material_id_estado_material(rs.getInt(8));
                lib.setGenero_id_genero(rs.getInt(9));
                lib.setEditorial_id_editorial(rs.getInt(10));
                lib.setAutor_id_autor(rs.getInt(11));
                lib.setTipo_material_id_tipo_material(rs.getInt(12));
                lista.add(lib);
            }       
        }catch (SQLException e) {
            
    }
        return lista;
    
    }
    public int agregar(Libro lib){
            String sql="INSERT INTO biblioteca(codigo_material, nombre_ejemplar, ISBN, numero_paginas, fecha_publicacion, cantidad, estado_material_id_estado_material, genero_id_genero, editorial_id_editorial, autor_id_autor, tipo_material_id_tipo_material)VALUES(?,?,?,?,?,?,?,?,?,?,1)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, lib.getCodigo_material());
            ps.setString(2, lib.getNombre_ejemplar());
            ps.setString(3, lib.getISBN());
            ps.setInt(4, lib.getNumero_paginas());
            ps.setString(5, lib.getFecha_publicacion());
            ps.setInt(6, lib.getCantidad());
            ps.setInt(7, lib.getEstado_material_id_estado_material());
            ps.setInt(8, lib.getGenero_id_genero());
            ps.setInt(9, lib.getEditorial_id_editorial());
            ps.setInt(10, lib.getAutor_id_autor());

            ps.executeUpdate();
            
        }catch (SQLException e) {
            
    }
        return r;
    }
    
    public Libro listarId(int id_bibli){
            Libro lib = new Libro();
            String sql="SELECT id_biblioteca, codigo_material, nombre_ejemplar, ISBN, numero_paginas, fecha_publicacion, cantidad, estado_material_id_estado_material, genero_id_genero, editorial_id_editorial, autor_id_autor FROM biblioteca WHERE id_biblioteca="+id_bibli;
            try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
              rs=ps.executeQuery();
              while(rs.next()){
              
                lib.setId_biblioteca(rs.getInt(1));
                lib.setCodigo_material(rs.getString(2));
                lib.setNombre_ejemplar(rs.getString(3));
                lib.setISBN(rs.getString(4));
                lib.setNumero_paginas(rs.getInt(5));
                lib.setFecha_publicacion(rs.getString(6));
                lib.setCantidad(rs.getInt(7));
                lib.setEstado_material_id_estado_material(rs.getInt(8));
                lib.setGenero_id_genero(rs.getInt(9));
                lib.setEditorial_id_editorial(rs.getInt(10));
                lib.setAutor_id_autor(rs.getInt(11));
               //  lib.setTipo_material_id_tipo_material(rs.getInt(12));
              }
        }catch (SQLException e) {
                // Manejo de excepciones: Agrega lógica para manejar la excepción
                
    }
        return lib;
        
        
    }
    public int actualizar(Libro lib){
           String sql="UPDATE biblioteca SET codigo_material=?, nombre_ejemplar=?, ISBN=?, numero_paginas=?, fecha_publicacion=?, cantidad=?, estado_material_id_estado_material=?, genero_id_genero=?, editorial_id_editorial=?, autor_id_autor=? WHERE id_biblioteca=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, lib.getCodigo_material());
            ps.setString(2, lib.getNombre_ejemplar());
            ps.setString(3, lib.getISBN());
            ps.setInt(4, lib.getNumero_paginas());
            ps.setString(5, lib.getFecha_publicacion());
            ps.setInt(6, lib.getCantidad());
            ps.setInt(7, lib.getEstado_material_id_estado_material());
            ps.setInt(8, lib.getGenero_id_genero());
            ps.setInt(9, lib.getEditorial_id_editorial());
            ps.setInt(10, lib.getAutor_id_autor());
            ps.setInt(11, lib.getId_biblioteca());

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
    
    
    

