
package Modelo;

public class CDs {
    
 int id_biblioteca;
 String codigo_material;
 String nombre_ejemplar;
 String ISBN;
 int numero_paginas;
 String fecha_publicacion;
 int cantidad;
 int estado_material_id_estado_material;
 int genero_id_genero;
 int editorial_id_editorial;
 int autor_id_autor;
 int tipo_material_id_tipo_material;
 
    public CDs () {
    }

    public CDs(int id_biblioteca, String codigo_material, String nombre_ejemplar, String ISBN, int numero_paginas, String fecha_publicacion, int cantidad, int estado_material_id_estado_material, int genero_id_genero, int editorial_id_editorial, int autor_id_autor) {
        this.id_biblioteca = id_biblioteca;
        this.codigo_material = codigo_material;
        this.nombre_ejemplar = nombre_ejemplar;
        this.ISBN = ISBN;
        this.numero_paginas = numero_paginas;
        this.fecha_publicacion = fecha_publicacion;
        this.cantidad = cantidad;
        this.estado_material_id_estado_material = estado_material_id_estado_material;
        this.genero_id_genero = genero_id_genero;
        this.editorial_id_editorial = editorial_id_editorial;
        this.autor_id_autor = autor_id_autor;
    }   

    public int getId_biblioteca() {
        return id_biblioteca;
    }

    public void setId_biblioteca(int id_biblioteca) {
        this.id_biblioteca = id_biblioteca;
    }

    public String getCodigo_material() {
        return codigo_material;
    }

    public void setCodigo_material(String codigo_material) {
        this.codigo_material = codigo_material;
    }

    public String getNombre_ejemplar() {
        return nombre_ejemplar;
    }

    public void setNombre_ejemplar(String nombre_ejemplar) {
        this.nombre_ejemplar = nombre_ejemplar;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstado_material_id_estado_material() {
        return estado_material_id_estado_material;
    }

    public void setEstado_material_id_estado_material(int estado_material_id_estado_material) {
        this.estado_material_id_estado_material = estado_material_id_estado_material;
    }

    public int getGenero_id_genero() {
        return genero_id_genero;
    }

    public void setGenero_id_genero(int genero_id_genero) {
        this.genero_id_genero = genero_id_genero;
    }



    public int getEditorial_id_editorial() {
        return editorial_id_editorial;
    }

    public void setEditorial_id_editorial(int editorial_id_editorial) {
        this.editorial_id_editorial = editorial_id_editorial;
    }

    public int getAutor_id_autor() {
        return autor_id_autor;
    }

    public void setAutor_id_autor(int autor_id_autor) {
        this.autor_id_autor = autor_id_autor;
    }

    public int getTipo_material_id_tipo_material() {
        return tipo_material_id_tipo_material;
    }

    public void setTipo_material_id_tipo_material(int tipo_material_id_tipo_material) {
        this.tipo_material_id_tipo_material = tipo_material_id_tipo_material;
    }
    
    
    
}
