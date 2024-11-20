public class AutenticacionUsuario {

    public boolean autenticar(Usuario usuario, String contrasenaIngresada) {
        return usuario.getContrasena().equals(contrasenaIngresada);
    }
    
}
