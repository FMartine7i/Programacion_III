package clases;

public class Inmueble {
    protected int id;
    protected int area;
    protected String direccion;
    protected double valorPorMetroCuadrado;

    public Inmueble(int id, int area, String direccion, double valorPorMetroCuadrado){
        this.id = id;
        this.area = area;
        this.direccion = direccion;
        this.valorPorMetroCuadrado = valorPorMetroCuadrado;
    }

    public String imprimir(){
        return "\nID: " + id +
                "\nÁrea: " + area + " m²" +
                "\nDirección: " + direccion +
                "\nValor por metro cuadrado: " + valorPorMetroCuadrado + " usd\n";
    }

    public String precioDeVenta(){
        return "Precio de venta: " + String.valueOf(valorPorMetroCuadrado*area) +" usd\n";
    }
}
