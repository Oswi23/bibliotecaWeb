package Controlador;

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
    int ide;//La usaremos para editar

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        //    try (PrintWriter out = response.getWriter()) {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
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
        if (menu.equals("RegistroMaterial")) {
            switch (accion) {
                case "Listar":

                    break;

                case "Agregar":

                    break;
                case "Editar":

                    break;

                case "Eliminar":

                    break;
                default:
                    throw new AssertionError();
            }

            request.getRequestDispatcher("RegistroMaterial.jsp").forward(request, response);
        }
        if (menu.equals("RegistroPrestamo")) {
            request.getRequestDispatcher("RegistroPrestamo.jsp").forward(request, response);
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
