
package Modelo;


public class Usuario {
 int id_usuario;
 String carnet;
 String nombre_user;
 String apellido_user;
 String user;
 String pass;
 String fecha_creacion;
 String ultima_sesion;
 String correo;
 String estado_user;
 String genero;
 int id_perfil;
 String nombre_perfil;

    public Usuario() {
    }

    public Usuario(int id_usuario, String carnet, String nombre_user, String apellido_user, String user, String pass, String fecha_creacion, String ultima_sesion, String correo, String estado_user, String genero, int id_perfil, String nombre_perfil) {
        this.id_usuario = id_usuario;
        this.carnet = carnet;
        this.nombre_user = nombre_user;
        this.apellido_user = apellido_user;
        this.user = user;
        this.pass = pass;
        this.fecha_creacion = fecha_creacion;
        this.ultima_sesion = ultima_sesion;
        this.correo = correo;
        this.estado_user = estado_user;
        this.genero = genero;
        this.id_perfil = id_perfil;
        this.nombre_perfil = nombre_perfil;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getApellido_user() {
        return apellido_user;
    }

    public void setApellido_user(String apellido_user) {
        this.apellido_user = apellido_user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getUltima_sesion() {
        return ultima_sesion;
    }

    public void setUltima_sesion(String ultima_sesion) {
        this.ultima_sesion = ultima_sesion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado_user() {
        return estado_user;
    }

    public void setEstado_user(String estado_user) {
        this.estado_user = estado_user;
    }




    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getNombre_perfil() {
        return nombre_perfil;
    }

    public void setNombre_perfil(String nombre_perfil) {
        this.nombre_perfil = nombre_perfil;
    }

    public void setId_perfil(String addperfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
       

    
}
