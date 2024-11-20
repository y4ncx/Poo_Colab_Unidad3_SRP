class Producto {

    int id;
    String nombre;
    double precioBase;
    double descuento;
    String categoria;

    public Producto(int id, String nombre, double precioBase, double descuento, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.descuento = descuento;
        this.categoria = categoria;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getCategoria() {
        return categoria;
    }

}
