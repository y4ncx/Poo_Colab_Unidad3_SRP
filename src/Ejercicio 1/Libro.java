class Libro {
    int codigo;
    String titulo;
    String autor;
    int añoPublicacion;
    String genero;
    
    public Libro(int cod, String titulo, String autor, int anioPublicacion, String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.genero = genero;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getGenero() {
        return genero;
    }
    
}