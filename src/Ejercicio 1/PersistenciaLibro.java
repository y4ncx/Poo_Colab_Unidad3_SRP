public class PersistenciaLibro {
    
    public void guardarLibro(Libro libro) {

        System.out.println("Guardando el libro: " + libro.getTitulo() + " - " + libro.getCodigo());

    }

    public void cargarLibro(Libro libro) {

        System.out.println("Cargando la información del libro: " + libro.getTitulo() + " - " + libro.getCodigo());

    }

}

