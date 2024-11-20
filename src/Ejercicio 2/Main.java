class Main {

    public static void main(String[] args) {

        Producto producto = new Producto( 33012, "Platano", 1000.00, 15.0, "Electrónica");
        
        EtiquetaProducto generadorEtiqueta = new GeneradorEtiqueta();
        String etiqueta = generadorEtiqueta.generarEtiqueta(producto);
        System.out.println("Etiqueta: " "\n" + etiqueta);
        
        PrecioProducto calculadorPrecio = new PrecioProducto();
        double precioFinal = calculadorPrecio.calcularPrecioFinal(producto);
        System.out.println("Precio final con descuento: $" + precioFinal);

    }

}
