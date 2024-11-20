class EtiquetaProducto {

    public String generadorEtiqueta(Producto producto) {

        return 
            "Producto: " + producto.getNombre() + "\n" +
            "Categoría: " + producto.getCategoria() + "\n" +
            "Precio: $" + producto.getPrecioBase();

    }

}
