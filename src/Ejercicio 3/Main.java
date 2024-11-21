public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario( 5405175, "Jesús", "Aguilar", "jaguilarn1@unicartagena.edu.co", "LaMambaNegra.png");
        

        ValidacionUsuario validador = new ValidacionUsuario();
        if (validador.validar(usuario)) {
            System.out.println("Los datos del usuario son válidos.");    
        } 
        else {
            System.out.println("Los datos del usuario no son correctas," + "\n"
            "por favor, vuelva a intentarlo.");
        }
        

        AutenticacionUsuario autenticador = new AutenticacionUsuario();
        if (autenticador.autenticar(usuario, "LaMambaNegra.png")) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Autenticación errada, intentelo nuevamente.");
        }

    }

}
