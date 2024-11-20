public class GeneradorReporteLibro {
    
    public String generarReporte(Libro libro) {
    
        return  
            "Codigo: " + libro.getCodigo() + "\n" +
            "Título: " + libro.getTitulo() + "\n" +
            "Autor: " + libro.getAutor() + "\n" +
            "Género: " + libro.getGenero() + "\n" +
            "Año de Publicación: " + libro.getAnioPublicacion();

    }

}
