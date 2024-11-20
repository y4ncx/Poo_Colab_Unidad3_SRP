class ValidacionUsuario {

    public boolean validarCorreo(String correo) {
        return correo.contains("@") && correo.contains(".");
    }

    public boolean validarContrasena(String contrasena) {
        return contrasena.length() >= 8;
    }

    public boolean validar(Usuario usuario) {
        return validarCorreo(usuario.getCorreo()) && validarContrasena(usuario.getContrasena());
    }
    
}
