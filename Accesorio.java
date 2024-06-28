public class Accesorio extends Producto{
    private TipoAccesorio tipoAccesorio;

    public Accesorio(String nombre, double precio, int cantidadEnStock, TipoAccesorio tipoAccesorio) {
        super(nombre, precio, cantidadEnStock);
        this.tipoAccesorio = tipoAccesorio;
    }

    public TipoAccesorio getTipoAccesorio() {
        return tipoAccesorio;
    }

    public void setTipoAccesorio(TipoAccesorio tipoAccesorio) {
        this.tipoAccesorio = tipoAccesorio;
    }

    @Override
    public String toString() {
        return "Accesorio{" +
                "tipoAccesorio=" + tipoAccesorio +
                "} " + super.toString();
    }
}
