

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">
                    <img src="img/Logo.png" alt="70" width="70"/><br>
                </a>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a style ="margin-left: 10px; border: none" class="btn btn-outline-light" aria-current="page" href=href=# >Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a style ="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=RegistroUsuario&accion=Listar" target="myFrame">Usuarios</a>                         
                        </li>
                        <li class="nav-item">
                            <a style ="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=RegistroLibro&accion=Listar" target="myFrame">Libros</a>
                        </li>
                         <li class="nav-item">
                            <a style ="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=RegistroRevista&accion=Listar" target="myFrame">Revistas</a>
                        </li>
                         <li class="nav-item">
                            <a style ="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=RegistroCDs&accion=Listar" target="myFrame">CD's</a>
                        </li>
                        <li class="nav-item">
                            <a style ="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=RegistroPrestamo" target="myFrame">RegistroPrestamo</a>
                        </li>
                    </ul>
                </div>
                <div class="dropdown">
                    <button style ="border: none"class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
                        ${nombre_user.getNombre_user()}
                    </button>
                    <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="#">
                            <img src="img/user.png" alt="60" width="60"/>
                        </a>
                        <a class="dropdown-item" href="#">
                            ${carnet.getCarnet()}
                        </a>
                        <a class="dropdown-item" href="#">
                            ${correo.getCorreo()}
                        </a>
                        <div class="dropdown-divider"></div>
                        <form action="Validar" method="POST">
                            <button name = "accion" value="Salir" class="dropdown-item" href="#">Salir</button>
                        </form>

                    </div>
                </div>
            </div>
        </nav>      
        <div class="m-4" style="height: 750px;" >
            <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>

    </body>
</html>
