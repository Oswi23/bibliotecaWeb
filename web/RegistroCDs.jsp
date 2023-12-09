<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" 
              crossorigin="anonymous">
        <style>
            .formulario {
                margin-right: 10px; /* Ajusta el margen derecho según sea necesario */
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>

        <div class="d-flex">
            <div class="card col-sm-3 formulario">
                <div class="card-body">
                    <form action="Controlador?menu=RegistroLibro" method="POST">
                        <div class="form-group">
                            <label>Codigo del Libro</label>
                            <input type="text" value ="${libro.getCodigo_material()}" name="txtCodigo" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Nombre del Libro</label>
                            <input type="text" value="${libro.getNombre_ejemplar()}" name="txtNombreLibro" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>ISBN</label>
                            <input type="text" value="${libro.getISBN()}" name="txtIsbn" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Numero de Paginas</label>
                            <input type="number" value="${libro.getNumero_paginas()}"  name="txtNumero" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Existencias</label>
                            <input type="number" value="${libro.getCantidad()}" name="txtExistencia" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Estado del Libro</label>

                            <select name="cmbEstado" class="form-control">
                                <option value="0" ${libro.getEstado_material_id_estado_material() == 0 ? 'selected' : ''}>Selecciona Estado</option>
                                <option value="1" ${libro.getEstado_material_id_estado_material() == 1 ? 'selected' : ''}>En Reparación</option>
                                <option value="2" ${libro.getEstado_material_id_estado_material() == 2 ? 'selected' : ''}>Fuera del Sistema</option>
                                <option value="3" ${libro.getEstado_material_id_estado_material() == 3 ? 'selected' : ''}>Prestado</option>
                                <option value="4" ${libro.getEstado_material_id_estado_material() == 4 ? 'selected' : ''}>Disponible</option>
                                <option value="5" ${libro.getEstado_material_id_estado_material() == 5 ? 'selected' : ''}>Perdido</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Editorial</label>
                            <select name="cmbEditorial" class="form-control">
                                <option value="0" ${libro.getEditorial_id_editorial() == 0 ? 'selected' : ''}>Selecciona un Libro</option>
                                <option value="1" ${libro.getEditorial_id_editorial() == 1 ? 'selected' : ''}>Libros Rápidos</option>
                                <option value="2" ${libro.getEditorial_id_editorial() == 2 ? 'selected' : ''}>Ediciones Estelares</option>
                                <option value="3" ${libro.getEditorial_id_editorial() == 3 ? 'selected' : ''}>Publicaciones Virtuosas</option>
                                <option value="4" ${libro.getEditorial_id_editorial() == 4 ? 'selected' : ''}>Páginas Doradas</option> 
                                <option value="5" ${libro.getEditorial_id_editorial() == 5 ? 'selected' : ''}>Impresiones Mágicas</option>
                                <option value="6" ${libro.getEditorial_id_editorial() == 6 ? 'selected' : ''}>Libros del Mañana</option>
                                <option value="7" ${libro.getEditorial_id_editorial() == 7 ? 'selected' : ''}>Historias Inéditas</option>
                                <option value="8" ${libro.getEditorial_id_editorial() == 8 ? 'selected' : ''}>Aventuras Literarias</option>
                                <option value="9" ${libro.getEditorial_id_editorial() == 9 ? 'selected' : ''}>Mundos Imaginarios</option>
                                <option value="10" ${libro.getEditorial_id_editorial() == 10 ? 'selected' : ''}>Armonía Editorial</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Autor</label>
                            <select name="cmbAutor" class="form-control">
                                <option value="0" ${libro.getAutor_id_autor() == 0 ? 'selected' : ''}>Selecciona un Autor</option>
                                <option value="1" ${libro.getAutor_id_autor() == 1 ? 'selected' : ''}>J.K. Rowling</option>
                                <option value="2" ${libro.getAutor_id_autor() == 2 ? 'selected' : ''}>Stephen King</option>
                                <option value="3" ${libro.getAutor_id_autor() == 3 ? 'selected' : ''}>Agatha Christie</option>
                                <option value="4" ${libro.getAutor_id_autor() == 4 ? 'selected' : ''}>Gabriel García Márquez</option>
                                <option value="5" ${libro.getAutor_id_autor() == 5 ? 'selected' : ''}>J.R.R. Tolkien</option>
                                <option value="6" ${libro.getAutor_id_autor() == 6 ? 'selected' : ''}>Jane Austen</option>
                                <option value="7" ${libro.getAutor_id_autor() == 7 ? 'selected' : ''}>Haruki Murakami</option>
                                <option value="8" ${libro.getAutor_id_autor() == 8 ? 'selected' : ''}>Maya Angelou</option>
                                <option value="9" ${libro.getAutor_id_autor() == 9 ? 'selected' : ''}>Bob Dylans</option>
                                <option value="10" ${libro.getAutor_id_autor() == 10 ? 'selected' : ''}>Jorge Luis Borges</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Genero</label>
                            <select name="cmbGenero" class="form-control">
                                <option value="0" ${libro.getGenero_id_genero() == 0 ? 'selected' : ''}>Selecciona un Genero</option>
                                <option value="1" ${libro.getGenero_id_genero() == 1 ? 'selected' : ''}>Novela</option>
                                <option value="2" ${libro.getGenero_id_genero() == 2 ? 'selected' : ''}>Moda</option>
                                <option value="3" ${libro.getGenero_id_genero() == 3 ? 'selected' : ''}>Diseño</option>
                                <option value="4" ${libro.getGenero_id_genero() == 4 ? 'selected' : ''}>Drama</option>
                                <option value="5" ${libro.getGenero_id_genero() == 5 ? 'selected' : ''}>Suspenso</option>
                                <option value="6" ${libro.getGenero_id_genero() == 6 ? 'selected' : ''}>Arte</option>
                                <option value="7" ${libro.getGenero_id_genero() == 7 ? 'selected' : ''}>Acción</option>
                                <option value="8" ${libro.getGenero_id_genero() == 8 ? 'selected' : ''}>Rock</option>
                                <option value="9" ${libro.getGenero_id_genero() == 9 ? 'selected' : ''}>Clásico</option>
                                <option value="10" ${libro.getGenero_id_genero() == 10 ? 'selected' : ''}>Balada</option>
                                <option value="11" ${libro.getGenero_id_genero() == 11 ? 'selected' : ''}>Salsa</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Fecha de Publicacion</label>
                            <input type="date" value="${libro.getFecha_publicacion().toString().substring(0, 10)}" name="txtFechaPublicacion"  class="form-control">
                        </div>
                        <input type ="submit" name = "accion" value="Agregar" class="btn bg-info">
                        <input type ="submit" name = "accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
                        
            <div class="container">
                <div class="row justify-content-end">
                    <div class="d-flex col-sm-4">
                        <input type="text" name="codigocliente" value="${b.getCodigo_material()}" class="form-control" placeholder="Codigo">
                        <input type="submit" name="accion" value="BuscarCliente" class="btn bg-info">
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-12">
                        <table class="table table-hover">
                            <tr>
                                <th>ID</th>
                                <th>CODIGO LIBRO </th>
                                <th>NOMBRE LIBRO</th>
                                <th>ISBN</th>
                                <th>NUMERO DE PAGINAS</th> 
                                <th>EXISTENCIAS</th>
                                <th>ESTADO DE LIBRO</th>
                                <th>EDITORIAL</th>
                                <th>AUTOR</th>
                                <th>GENERO</th>
                                <th>FECHA PUBLICACION</th>
                                <th>ACCIONES</th>                           
                            </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="lib" items="${libros}">
                                    <tr>
                                        <td>${lib.getId_biblioteca()}</td>
                                        <td>${lib.getCodigo_material()}</td>
                                        <td>${lib.getNombre_ejemplar()}</td>
                                        <td>${lib.getISBN()}</td>
                                        <td>${lib.getNumero_paginas()}</td>
                                        <td>${lib.getCantidad()}</td>
                                        <td>${lib.getEstado_material_id_estado_material()}</td>
                                        <td>${lib.getEditorial_id_editorial()}</td>
                                        <td>${lib.getAutor_id_autor()}</td>
                                        <td>${lib.getGenero_id_genero()}</td>
                                        <td>${lib.getFecha_publicacion().toString().substring(0, 10)}</td>
                                        <td>
                                            <a class="btn btn-warning" href="Controlador?menu=RegistroLibro&accion=Editar&id=${lib.getId_biblioteca()}">Editar</a>
                                            <a class="btn btn-danger" href="Controlador?menu=RegistroLibro&accion=Eliminar&id=${lib.getId_biblioteca()}">Eliminar</a>  
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>      
            </div>

            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" 
            crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" 
            crossorigin="anonymous"></script>
    </body>
</html>
