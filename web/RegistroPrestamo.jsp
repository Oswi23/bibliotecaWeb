
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Modelo.Usuario, Modelo.UsuarioDAO,java.util.List" %>
<%@ page import="java.util.List, java.util.Map" %>

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
            <div class="card col-sm-4 formulario">
                <div class="card-body">
                    <h1 class="text-center">Registro de Prestamo</h1>
                    <form action="procesarRegistroPrestamo.jsp" method="post">
                        <div class="form-group">
                            <label>No. Prestamo:</label>
                            <%
                                try {
                                    Modelo.UsuarioDAO usuarioDAO = new Modelo.UsuarioDAO();
                                    int ultimoPrestamo = usuarioDAO.obtenerUltimoNumeroPrestamo();
                            %>
                            <input type="text" name="txtId_Prestamo" class="form-control" value="<%= ultimoPrestamo%>" readonly>
                            <%
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            %>
                        </div>
                        <div class="form-group">
                            <label>Nombre de Usuario:</label>
                            <input type="text" name="txtNombreUser" class="form-control" value="${nombre_user.nombre}" readonly>

                            <input type="text" name="txtNombreUser" class="form-control" value="${nombre_user.nombre_user}" readonly>
                        </div>
                        <div class="form-group">
                            <label>Carnet de Usuario:</label>
                            <input type="text" name="txtCarnet" class="form-control" value="${carnet}" readonly>

                            <input type="text" name="txtCarnet" class="form-control" value="${carnet.carnet}" readonly>
                        </div>
                        <div class="form-group">
                            <label>Buscar por Nombre:</label>
                            <input type="text" name="txtBuscar" class="form-control">
                        </div>
                        <div class="justify-content-end">
                            <input type="submit" name="btnBuscar" value="Buscar" class="btn btn-primary">
                            <input type="button" value="Cancelar" class="btn btn-secondary" onclick="limpiarBusqueda()">
                        </div>
                        <%
                            if (request.getParameter("btnBuscar") != null) {
                                String nombreLibro = request.getParameter("txtBuscar");

                                try {
                                    Modelo.UsuarioDAO usuarioDAO = new Modelo.UsuarioDAO();
                                    List<Map<String, Object>> librosEncontrados = usuarioDAO.buscarLibrosPorNombre(nombreLibro);

                                    for (Map<String, Object> libro : librosEncontrados) {
                        %>
                        <tr>
                            <td><%= libro.get("codigo")%></td>
                            <td><%= libro.get("nombre")%></td>
                        </tr>
                        <%
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        %> 

                </div>
                <div>
                    <h2>Resultado de Búsqueda</h2>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Codigo del Libro</th>
                                <th>Nombre del libro</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Aquí puedes agregar filas con datos, por ejemplo: -->
                            <tr>
                            </tr>
                            <!-- Puedes repetir este patrón para mostrar más resultados -->
                        </tbody>
                    </table> 
                </div>
                <div>
                    <h2>Filas Seleccionadas</h2>
                    <!-- Agrega aquí la tabla u otros elementos para mostrar las filas seleccionadas -->
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Codigo del Libro</th>
                                <th>Nombre del libro</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Aquí puedes agregar las filas seleccionadas si tienes alguna lógica para mostrarlas -->
                            <!-- Por ejemplo: -->
                            <tr>
                            </tr>
                            <!-- Puedes agregar más filas según sea necesario -->
                        </tbody>
                    </table>
                </div>
                <div class="form-group">
                    <label>Fecha Actual:</label>
                    <input type="text" name="txtFechaSistema" readonly class="form-control">
                    <% java.time.LocalDate fechaActual = java.time.LocalDate.now();%>
                    <script>
                        document.getElementsByName("txtFechaSistema")[0].value = '<%= fechaActual%>';
                    </script>
                </div>
                <div class="justify-content-end">
                    <input type="submit" name="btnAgregar" value="Agregar a la Lista de Prestamo" class="btn bg-info">
                    <input type="submit" name="btnGenerar" value="Generar Prestamo de Material" class="btn btn-success">
                </div>
                </form>
            </div>
        </div>
    </div>
    <!-- Puedes incluir scripts o enlaces adicionales si los necesitas -->
    <script>
        function limpiarBusqueda() {
            // Limpiar el campo de búsqueda
            document.getElementsByName("txtBuscar")[0].value = "";

            // Limpiar la tabla de resultados
            var resultadosTable = document.getElementById("resultadosTable");
            while (resultadosTable.rows.length > 1) {
                resultadosTable.deleteRow(1);
            }
        }
    </script>
</body>
</html>
