import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ControlStock {
    private List<Producto> productos;
    private static ControlStock instancia;

    private ControlStock() {
        this.productos = new ArrayList<>();
    }

    public static ControlStock getInstancia() {
        if (instancia == null) {
            instancia = new ControlStock();
        }
        return instancia;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void actualizarProducto(String nombreProducto, double nuevoPrecio, int nuevaCantidad) {
        Optional<Producto> productoExistente = productos.stream()
                .filter(p -> p.getNombre().equals(nombreProducto))
                .findFirst();

        productoExistente.ifPresent(p -> {
            p.setPrecio(nuevoPrecio);
            p.setCantidadEnStock(nuevaCantidad);
        });
    }

    public void eliminarProducto(String nombreProducto) {
        productos.removeIf(producto -> producto.getNombre().equals(nombreProducto));
    }

    public List<Producto> consultarStock() {
        return new ArrayList<>(productos);
    }

    public void agregarStock(String nombreProducto, int cantidad) {
        Optional<Producto> productoEncontrado = productos.stream()
                .filter(producto -> producto.getNombre().equals(nombreProducto))
                .findFirst();

        if (productoEncontrado.isPresent()) {
            productoEncontrado.get().agregarStock(cantidad);
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }

    public void quitarStock(String nombreProducto, int cantidad) {
        Optional<Producto> productoEncontrado = productos.stream()
                .filter(producto -> producto.getNombre().equals(nombreProducto))
                .findFirst();

        if (productoEncontrado.isPresent()) {
            productoEncontrado.get().quitarStock(cantidad);
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }

    public List<Producto> buscarProductoPorNombre(String nombre) {
        return productos.stream()
                .filter(producto -> producto.getNombre().contains(nombre))
                .collect(Collectors.toList());
    }
}
