class Usuario {

    int id;
    String nombre;
    String apellido;
    String correo;
    String contrasena;

    public Usuario(int id, String nombre, String apellido; String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

}
