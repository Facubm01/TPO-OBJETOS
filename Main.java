import java.util.List;

public class Main {
    public static void main(String[] args) {
        ControlStock controlStock = ControlStock.getInstancia();

        // Agregar algunos productos
        controlStock.agregarProducto(new Prenda("Remera Nike", 499.99, 10, TipoPrenda.REMERA, Talle.M));
        controlStock.agregarProducto(new Prenda("Buzo Adidas", 999.99, 5, TipoPrenda.BUZO, Talle.L));

        // Consultar stock inicial
        System.out.println("Stock inicial:");
        List<Producto> stockActual = controlStock.consultarStock();
        for (Producto producto : stockActual) {
            System.out.println(producto);
        }

        // Agregar stock al producto "Buzo Adidas"
        controlStock.agregarStock("Buzo Adidas", 5);

        // Consultar stock después de agregar stock
        System.out.println("\nStock después de agregar stock:");
        stockActual = controlStock.consultarStock();
        for (Producto producto : stockActual) {
            System.out.println(producto);
        }

        // Actualizar producto "Remera Nike"
        controlStock.actualizarProducto("Remera Nike", 450.00, 15);

        // Consultar stock después de actualizar
        System.out.println("\nStock después de actualizar producto 'Remera Nike':");
        stockActual = controlStock.consultarStock();
        for (Producto producto : stockActual) {
            System.out.println(producto);
        }

        // Buscar productos por nombre
        System.out.println("\nBuscar productos con nombre 'Nike':");
        List<Producto> productosEncontrados = controlStock.buscarProductoPorNombre("Nike");
        for (Producto producto : productosEncontrados) {
            System.out.println(producto);
        }

        // Eliminar producto "Buzo Adidas"
        controlStock.eliminarProducto("Buzo Adidas");

        // Consultar stock después de eliminar
        System.out.println("\nStock después de eliminar producto 'Buzo Adidas':");
        stockActual = controlStock.consultarStock();
        for (Producto producto : stockActual) {
            System.out.println(producto);
        }
    }
}
