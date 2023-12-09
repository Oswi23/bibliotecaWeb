package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorValidar extends HttpServlet {

    UsuarioDAO udao = new UsuarioDAO();
    Usuario us = new Usuario();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("Ingresar")) {
            String carnet = request.getParameter("txtCarnet");
            String pass = request.getParameter("txtPass");

            us = udao.validar(carnet, pass);
            if (us.getCarnet() != null) {
               request.setAttribute("nombre_user", us);
               request.setAttribute("carnet", us);
               request.setAttribute("correo", us);
               request.getRequestDispatcher("Controlador?menu=Principal").forward(request, response);
            } else {

                request.getRequestDispatcher("index.jsp").forward(request, response);

            }
        } else {

            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("Ingresar")) {
            String carnet = request.getParameter("txtCarnet");
            String pass = request.getParameter("txtPass");

            us = udao.validar(carnet, pass);
            if (us.getCarnet() != null) {
                String nombreUsuario = udao.obtenerNombreUsuario(carnet);
                request.setAttribute("nombre_user", us);
               request.setAttribute("carnet", us);
               request.setAttribute("correo", us);
                request.getRequestDispatcher("Controlador?menu=Principal").forward(request, response);
            } else {

                request.getRequestDispatcher("index.jsp").forward(request, response);

            }
        } else {

            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
        
        
        }

    }

   /*@Override
    public String getServletInfo() {
        return "Short description";
    }*/



