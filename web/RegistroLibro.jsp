<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" 
              crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="card">
            <div class="card-body">
                <form>
                    <div class="form-group">
                        <label>Codigo del Libro</label>
                        <input type="text" name="txtCodigo" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Nombre del Libro</label>
                        <input type="text" name="txtNombreLibro" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>ISBN</label>
                        <input type="text" name="txtIsbn" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Numero de Paginas</label>
                         <input type="number" name="txtNumero" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Existencias</label>
                        <input type="number" name="txtNumero" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Estado del Material</label>
                        <select name="cmbOpciones" class="form-control">
                            <option value="opcion1">Opción 1</option>
                            <option value="opcion2" selected>Opción 2 (Seleccionada por defecto)</option>
                            <option value="opcion3">Opción 3</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Editorial</label>
                        <select name="cmbOpciones" class="form-control">
                            <option value="opcion1">Opción 1</option>
                            <option value="opcion2" selected>Opción 2 (Seleccionada por defecto)</option>
                            <option value="opcion3">Opción 3</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Autor</label>
                        <select name="cmbOpciones" class="form-control">
                            <option value="opcion1">Opción 1</option>
                            <option value="opcion2" selected>Opción 2 (Seleccionada por defecto)</option>
                            <option value="opcion3">Opción 3</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Genero</label>
                        <select name="cmbOpciones" class="form-control">
                            <option value="1">Opción 1</option>
                            <option value="2" selected>Opción 2 (Seleccionada por defecto)</option>
                            <option value="d3">Opción 3</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Fecha de Publicacion</label>
                        <input type="date" name="txtFechaPublicacion"  autocomplete="off" class="form-control">
                    </div>
                </form>
            </div>
        </div>



        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" 
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" 
        crossorigin="anonymous"></script>
    </body>
</html>
