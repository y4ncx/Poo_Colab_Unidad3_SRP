class Main {

    public static void main(String[] args) {

        Libro libro = new Libro( 33012,"Charlie y la fábrica de chocolate", "Roald Dahl", "Fantastico", 1964);
        
        GeneradorReporteLibro generador = new GeneradorReporteLibro();
        String reporte = generador.generarReporte(libro);
        System.out.println(reporte);
        
        PersistenciaLibro persistencia = new PersistenciaLibro();
        persistencia.guardarLibro(libro);
        
        persistencia.cargarLibro(libro);

    }

}
