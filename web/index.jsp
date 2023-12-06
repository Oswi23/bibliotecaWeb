<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class = "container mt-4 col-lg-4">
                <div class = "card col-sm-10">
                    <div class = "card-body">
                        <form class="form-sign" action="Validar" method="POST">
                            <div class="form-group text-center">
                                <h3>Login</h3>
                                <img src="img/Logo.png" alt="70" width="170"/><br>
                                <label>Bienvenidos al Sistema</label>
                            </div>
                            <div class="form-group">
                                <label>Carnet:</label>
                                <input type ="text" name="txtCarnet" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Password:</label>
                                <input type ="password" name="txtPass" class="form-control"><br>
                            </div>
                                <input type ="submit" name="accion" value ="Ingresar" class="btn btn-primary btn-block">
                        </form>
                    </div>
                        
                </div>
                    
        </div>
        
         <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>

    </body>
</html>
