public class Prenda extends Producto{
    private TipoPrenda tipoPrenda;
    private Talle talle;

    public Prenda(String nombre, double precio, int cantidadEnStock, TipoPrenda tipoPrenda, Talle talle) {
        super(nombre, precio, cantidadEnStock);
        this.tipoPrenda = tipoPrenda;
        this.talle = talle;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public Talle getTalle() {
        return talle;
    }

    public void setTalle(Talle talle) {
        this.talle = talle;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "tipoPrenda=" + tipoPrenda +
                ", talle=" + talle +
                "} " + super.toString();
    }
}
