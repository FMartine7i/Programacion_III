package clases;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumo;
    protected String marca;

    public Electrodomestico(double precio, String color, char consumo, String marca){
        this.precio = precio;
        this.color = color;
        this.consumo = validarConsumoEnergetico(consumo);
        this.marca = marca;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public char getConsumo(){
        return consumo;
    }

    public void setConsumo(char consumo){
        this.consumo = consumo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public char validarConsumoEnergetico(char consumo){
        consumo = Character.toUpperCase(consumo);
        if(consumo >= 'A' && consumo <= 'F')
            return consumo;
        else
            return 'F';
    }

    public String imprimirPorPantalla(){
        return "Precio: " + precio + " usd" + "\nColor: " + color + "\nConsumo: " + consumo + "\nMarca: " + marca;
    }
}
