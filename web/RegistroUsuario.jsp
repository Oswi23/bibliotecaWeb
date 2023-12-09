<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        
            <style>
        .formulario {
            margin-right: 10px; /* Ajusta el margen derecho según sea necesario */
        }
    </style>
        
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">

            <div class="card col-sm-2 formulario">
                <div class="card-body">
                    <form action="Controlador?menu=RegistroUsuario" method="POST">

                        <div class="form-group">
                            <label>Carnet</label>
                            <input type="text" value="${usuario.getCarnet()}" name="txtCarnet" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Nombres</label>
                            <input type="text" value="${usuario.getNombre_user()}" name="txtNombres" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Apellidos</label>
                        </div>
                        <input type="text" value="${usuario.getApellido_user()}" name="txtApellidos" class="form-control">
                        <div class="form-group">
                            <label>Correo</label>
                            <input type="text" value="${usuario.getCorreo()}" name="txtCorreo" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Contraseña</label>
                            <input type="password" value="${usuario.getPass()}" name="txtPass" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Genero</label>
                            <input type="text" value="${usuario.getGenero()}" name="txtGenero" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Estado</label>
                            <input type="text" value="${usuario.getEstado_user()}" name="txtEstado" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Perfil</label>
                            <input type="text" value="${usuario.getId_perfil()}" name="txtPerfil" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
                        
                         <div class="container">
                <div class="row justify-content-end">
                    <div class="d-flex col-sm-4">
                        <input type="text" name="codigocliente" value="${b.getCodigo_material()}" class="form-control" placeholder="CarnetUsuario">
                        <input type="submit" name="accion" value="BuscarUsuario" class="btn bg-info">
                    </div>
                </div>

                        

            <div class="col-sm-12">
                <table class="table table-hover" >
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">CARNET</th>
                            <th scope="col">NOMBRES</th>
                            <th scope="col">APELLIDOS</th>
                            <th scope="col">CORREO </th>
                            <!-- <th scope="col">CONTRASEÑA</th>-->
                            <th scope="col">GENERO</th>
                            <th scope="col">ESTADO</th>
                            <th scope="col">PERFIL</th>
                            <th scope="col">ACCIONES</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="us" items="${usuarios}">
                            <tr>
                                <td>${us.getId_usuario()}</td>
                                <td>${us.getCarnet()}</td>
                                <td>${us.getNombre_user()}</td>
                                <td>${us.getApellido_user()}</td>
                                <td>${us.getCorreo()}</td>
                              
                                <td>${us.getGenero()}</td>
                                <td>${us.getEstado_user()}</td>
                                <td>${us.getId_perfil()}</td>
                                <td>
                                    <a class="btn btn-warning" href="Controlador?menu=RegistroUsuario&accion=Editar&id=${us.getId_usuario()}">Editar</a>
                                    <a class="btn btn-danger" href="Controlador?menu=RegistroUsuario&accion=Eliminar&id=${us.getId_usuario()}">Eliminar</a>

                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>

        </div>   

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
    </body>
</html>
