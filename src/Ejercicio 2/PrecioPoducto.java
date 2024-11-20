class PrecioProducto {

    public double PrecioFinal(Producto producto) {

        return producto.getPrecioBase() - (producto.getPrecioBase() * producto.getDescuento() / 100);
        //Presio - ( Precio * Descuento / 100 ).

    }

}
