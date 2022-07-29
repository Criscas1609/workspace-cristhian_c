package co.ed.cue.proyecto;
// 3 facturas, 5 productos
public class Factura {
    String nombre;
    int precio;
    int cantidadProducto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int imprimirC(String nombre, int precio, int cantidadProducto) {
        precio = cantidadProducto*precio;
        return precio;
    }
    public Factura(){

    }
    public Factura(String nombre, int precio, int cantidadProducto){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidadProducto=cantidadProducto;
    }

}

