package Controlador;

import Modelo.Libro;
import Modelo.LibroDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    Usuario us = new Usuario(); //Entidad
    UsuarioDAO udao = new UsuarioDAO(); //Clase
    Libro lib = new Libro();//Entidad
    LibroDAO libdao = new LibroDAO();//Clase
    int id_Libro;
    
    int ide;//La usaremos para editar

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        //    try (PrintWriter out = response.getWriter()) {
        String menu = request.getParameter("menu"); // Esta variable recibe el menú creado en Principal.jsp
        String accion = request.getParameter("accion"); //Esta variable recibe la acción que realiza el usuario
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if (menu.equals("RegistroUsuario")) {
            switch (accion) {
                case "Listar":
                    List lista = udao.listar();
                    request.setAttribute("usuarios", lista);
                    break;

                case "Agregar":

                    String carnet = request.getParameter("txtCarnet");
                    String nombres = request.getParameter("txtNombres");
                    String apellidos = request.getParameter("txtApellidos");
                    String correo = request.getParameter("txtCorreo");
                    String pass = request.getParameter("txtPass");
                    String genero = request.getParameter("txtGenero");
                    String estado = request.getParameter("txtEstado");
                    String perfilString = request.getParameter("txtPerfil");
                    int perfil = Integer.parseInt(perfilString);

                    // Validar que el perfilString no sea nulo o vacío antes de convertirlo a entero
                    //  if (perfilString != null && !perfilString.isEmpty()) {
                    us.setCarnet(carnet);
                    us.setNombre_user(nombres);
                    us.setApellido_user(apellidos);
                    us.setCorreo(correo);
                    us.setPass(pass);
                    us.setGenero(genero);
                    us.setEstado_user(estado);
                    us.setId_perfil(perfil);

                    udao.agregar(us);
                    request.getRequestDispatcher("Controlador?menu=RegistroUsuario&accion=Listar").forward(request, response);
                    //  }
                    break;

                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Usuario u = udao.listarId(ide);
                    request.setAttribute("usuario", u);
                    request.getRequestDispatcher("Controlador?menu=RegistroUsuario&accion=Listar").forward(request, response);
                    break;

                case "Actualizar":

                    String carnet1 = request.getParameter("txtCarnet");
                    String nombres1 = request.getParameter("txtNombres");
                    String apellidos1 = request.getParameter("txtApellidos");
                    String correo1 = request.getParameter("txtCorreo");
                    String pass1 = request.getParameter("txtPass");
                    String genero1 = request.getParameter("txtGenero");
                    String estado1 = request.getParameter("txtEstado");
                    String perfilString1 = request.getParameter("txtPerfil");
                    int perfil1 = Integer.parseInt(perfilString1);

                    // Validar que el perfilString no sea nulo o vacío antes de convertirlo a entero
                    //  if (perfilString != null && !perfilString.isEmpty()) {
                    us.setCarnet(carnet1);
                    us.setNombre_user(nombres1);
                    us.setApellido_user(apellidos1);
                    us.setCorreo(correo1);
                    us.setPass(pass1);
                    us.setGenero(genero1);
                    us.setEstado_user(estado1);
                    us.setId_perfil(perfil1);
                    us.setId_usuario(ide);
                    udao.actualizar(us);
                    request.getRequestDispatcher("Controlador?menu=RegistroUsuario&accion=Listar").forward(request, response);
                    break;

                case "Eliminar":
                    ide = Integer.parseInt(request.getParameter("id"));//Revisar de donde viene es id
                    udao.delete(ide);
                    request.getRequestDispatcher("Controlador?menu=RegistroUsuario&accion=Listar").forward(request, response);

                    break;
                default:
                    throw new AssertionError();
            }

            request.getRequestDispatcher("RegistroUsuario.jsp").forward(request, response);
        }
        
        if (menu.equals("RegistroLibro")) {
            switch (accion) { //La variable que tendrá el switch será acción
                case "Listar":
                    List lista = libdao.listar();
                    request.setAttribute("libros", lista);
                    break;
                case "Agregar":
                    String cod_libro = request.getParameter("txtCodigo");
                    String nom_libro = request.getParameter("txtNombreLibro");
                    String isbn_libro = request.getParameter("txtIsbn");
                    String paginas = request.getParameter("txtNumero");
                     int paginas_libro = Integer.parseInt(paginas);
                    String exis = request.getParameter("txtExistencia");
                    int exis_libro = Integer.parseInt(exis);
                    // Obtener el valor seleccionado del ComboBox
                    String estado = request.getParameter("cmbEstado");
                    int estado_libro = Integer.parseInt(estado);
                    String editor = request.getParameter("cmbEditorial");
                    int editor_libro = Integer.parseInt(editor);
                    String autor = request.getParameter("cmbAutor");
                    int autor_libro = Integer.parseInt(autor);
                    String genero = request.getParameter("cmbGenero");
                    int genero_libro = Integer.parseInt(genero);
                    String publica_libro = request.getParameter("txtFechaPublicacion");
                    
                    lib.setCodigo_material(cod_libro);
                    lib.setNombre_ejemplar(nom_libro);
                    lib.setISBN(isbn_libro);
                    lib.setNumero_paginas(paginas_libro);
                    lib.setCantidad(exis_libro);
                    lib.setEstado_material_id_estado_material(estado_libro);
                    lib.setEditorial_id_editorial(editor_libro);
                    lib.setAutor_id_autor(autor_libro);
                    lib.setGenero_id_genero(genero_libro);
                    lib.setFecha_publicacion(publica_libro);
                        
                    libdao.agregar(lib);
                     request.getRequestDispatcher("Controlador?menu=RegistroLibro&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    id_Libro = Integer.parseInt(request.getParameter("id"));
                    Libro l = libdao.listarId(id_Libro);
                    request.setAttribute("libro", l);
                    request.getRequestDispatcher("Controlador?menu=RegistroLibro&accion=Listar").forward(request, response);

                    break;
                    case "Actualizar":
                    String cod_libro1 = request.getParameter("txtCodigo");
                    String nom_libro1 = request.getParameter("txtNombreLibro");
                    String isbn_libro1 = request.getParameter("txtIsbn");
                    String paginas1 = request.getParameter("txtNumero");
                     int paginas_libro1 = Integer.parseInt(paginas1);
                    String exis1 = request.getParameter("txtExistencia");
                    int exis_libro1 = Integer.parseInt(exis1);
                    // Obtener el valor seleccionado del ComboBox
                    String estado1 = request.getParameter("cmbEstado");
                    int estado_libro1 = Integer.parseInt(estado1);
                    String editor1 = request.getParameter("cmbEditorial");
                    int editor_libro1 = Integer.parseInt(editor1);
                    String autor1 = request.getParameter("cmbAutor");
                    int autor_libro1 = Integer.parseInt(autor1);
                    String genero1 = request.getParameter("cmbGenero");
                    int genero_libro1 = Integer.parseInt(genero1);
                    String publica_libro1 = request.getParameter("txtFechaPublicacion");
                    
                    lib.setCodigo_material(cod_libro1);
                    lib.setNombre_ejemplar(nom_libro1);
                    lib.setISBN(isbn_libro1);
                    lib.setNumero_paginas(paginas_libro1);
                    lib.setCantidad(exis_libro1);
                    lib.setEstado_material_id_estado_material(estado_libro1);
                    lib.setEditorial_id_editorial(editor_libro1);
                    lib.setAutor_id_autor(autor_libro1);
                    lib.setGenero_id_genero(genero_libro1);
                    lib.setFecha_publicacion(publica_libro1);
                    lib.setId_biblioteca(id_Libro);

 
                    libdao.actualizar(lib);
                    request.getRequestDispatcher("Controlador?menu=RegistroLibro&accion=Listar").forward(request, response);
                    

                    break;

               case "Eliminar":
                    id_Libro = Integer.parseInt(request.getParameter("id"));//Revisar de donde viene es id
                    libdao.delete(id_Libro);
                    request.getRequestDispatcher("Controlador?menu=RegistroLibro&accion=Listar").forward(request, response);
                    break;
                    /*
                       Libro lib = new Libro();                               //Entidad
                        LibroDAO libdao = new LibroDAO();      //Clase
                    */
               case "BuscarCliente": 
                   String dni = request.getParameter("codigocliente");
                   lib.setCodigo_material(dni);
                   lib=libdao.buscar(dni);
                    request.setAttribute("lib", lib);
                    break;
                default:
                    throw new AssertionError();

            }

            request.getRequestDispatcher("RegistroLibro.jsp").forward(request, response);
        }
        if (menu.equals("RegistroPrestamo")) {
            request.getRequestDispatcher("RegistroPrestamo.jsp").forward(request, response);
        }
        
         if (menu.equals("RegistroRevista")) {
            request.getRequestDispatcher("RegistroRevista.jsp").forward(request, response);
        }
         
         if (menu.equals("RegistroCDs")) {
            request.getRequestDispatcher("RegistroCDs.jsp").forward(request, response);
        }
        
        // }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
