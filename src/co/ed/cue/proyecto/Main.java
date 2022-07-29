package co.ed.cue.proyecto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //co.ed.cue.proyecto.Calculadora ejemplo clase
      /*  System.out.println("Hello world!");
        co.ed.cue.proyecto.Calculadora calculadora = new co.ed.cue.proyecto.Calculadora(3,2);//crear un objeto a partir del constructor por defecto
        calculadora.sumar();
        int resultado= calculadora.resta(5,3);
        System.out.println("el resultado de la resta es: "+resultado);*/
        //Punto 4
        /*int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
        int [] arreglo = new int[cantidad];
        co.ed.cue.proyecto.Facturas facturas = new co.ed.cue.proyecto.Facturas();
        co.ed.cue.proyecto.Producto producto = new co.ed.cue.proyecto.Producto();

        for(int i=0; i<cantidad; i++){
            String nombre = JOptionPane.showInputDialog("Ingrese la cantidad de productos");
            String color = JOptionPane.showInputDialog("Ingrese el color");
            String material = JOptionPane.showInputDialog("Ingrese la cantidad de productos");
            int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del producto"));
            int precioVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del producto"));
            int costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor final del producto"));
            int cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto"));
            arreglo[i]= facturas.imprimirC(nombre,color,material,peso,precioVenta,costo,cantidadProducto);
        }
        }*/
        //co.ed.cue.proyecto.Facturas facturas = new co.ed.cue.proyecto.Facturas();
        //co.ed.cue.proyecto.Producto producto = new co.ed.cue.proyecto.Producto();

        Producto producto1 = new Producto("Café", "Comida", 3000);
        Producto producto2 = new Producto("Chocolate", "Comida", 2500);
        Producto producto3 = new Producto("Cama", "Hogar", 650000);
        Producto producto4 = new Producto("Colchón", "Hogar", 500000);
        Producto producto5 = new Producto("Cortina", "Hogar", 50000);

        int totalDeLasFacturas;

        for (int i=1; i < 4; i++) {
            int cantidadProducto1 = Integer.parseInt(JOptionPane.showInputDialog(producto1.getNombre()+" "+producto1.getPrecio()+" Ingrese la cantidad del producto"));
            int cantidadProducto2 = Integer.parseInt(JOptionPane.showInputDialog(producto2.getNombre()+" "+producto2.getPrecio()+" Ingrese la cantidad del producto"));
            int cantidadProducto3 = Integer.parseInt(JOptionPane.showInputDialog(producto3.getNombre()+" "+producto3.getPrecio()+" Ingrese la cantidad del producto"));
            int cantidadProducto4 = Integer.parseInt(JOptionPane.showInputDialog(producto4.getNombre()+" "+producto4.getPrecio()+" Ingrese la cantidad del producto"));
            int cantidadProducto5 = Integer.parseInt(JOptionPane.showInputDialog(producto5.getNombre()+" "+producto5.getPrecio()+" Ingrese la cantidad del producto"));

            Factura factura_producto1 = new Factura(producto1.getNombre(), producto1.getPrecio(), cantidadProducto1);
            int factura_producto_1=factura_producto1.imprimirC(producto1.getNombre(), producto1.getPrecio(),cantidadProducto1);

            Factura factura_producto2 = new Factura(producto2.getNombre(), producto2.getPrecio(), cantidadProducto2);
            int factura_producto_2=factura_producto2.imprimirC(producto2.getNombre(), producto2.getPrecio(),cantidadProducto2);

            Factura factura_producto3 = new Factura(producto3.getNombre(), producto3.getPrecio(), cantidadProducto3);
            int factura_producto_3=factura_producto3.imprimirC(producto3.getNombre(), producto3.getPrecio(),cantidadProducto3);

            Factura factura_producto4 = new Factura(producto4.getNombre(), producto4.getPrecio(), cantidadProducto4);
            int factura_producto_4=factura_producto4.imprimirC(producto4.getNombre(), producto4.getPrecio(),cantidadProducto4);

            Factura factura_producto5 = new Factura(producto5.getNombre(), producto5.getPrecio(), cantidadProducto5);
            int factura_producto_5=factura_producto5.imprimirC(producto5.getNombre(), producto5.getPrecio(),cantidadProducto5);

            int totalPorFactura = factura_producto_1+factura_producto_2+factura_producto_3+factura_producto_4+factura_producto_5;
            totalDeLasFacturas=totalPorFactura+totalPorFactura;

            JOptionPane.showMessageDialog(null,
                    "Factura: "+i+"\n"+
                            "Producto: "+producto1.getNombre()+" "+producto1.getPrecio()+" Cantidad: "+cantidadProducto1+" "+" Total: "+factura_producto_1+"\n"+
                            "Producto: "+producto2.getNombre()+" "+producto2.getPrecio()+" Cantidad: "+cantidadProducto2+" "+" Total: "+factura_producto_2+"\n"+
                            "Producto: "+producto3.getNombre()+" "+producto3.getPrecio()+" Cantidad: "+cantidadProducto3+" "+" Total: "+factura_producto_3+"\n"+
                            "Producto: "+producto4.getNombre()+" "+producto4.getPrecio()+" Cantidad: "+cantidadProducto4+" "+" Total: "+factura_producto_4+"\n"+
                            "Producto: "+producto5.getNombre()+" "+producto5.getPrecio()+" Cantidad: "+cantidadProducto5+" "+" Total: "+factura_producto_5+"\n"+
                            "Total: "+totalPorFactura
            );

            if(i==3){
                JOptionPane.showMessageDialog(null,"El total por las 3 facturas fue: "+totalDeLasFacturas);
            }
        }
    }
    }