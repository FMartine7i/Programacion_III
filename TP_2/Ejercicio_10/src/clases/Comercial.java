package clases;

public class Comercial extends Inmueble{
    private TipoComercial tipoComercial;;
    private String centroComercial;

    public Comercial(int id, int area, String direccion, double valorPorMetroCuadrado, TipoComercial tipoComercial, String centroComercial){
        super(id, area, direccion, valorPorMetroCuadrado);
        this.tipoComercial = tipoComercial;
        this.centroComercial = centroComercial;
    }

    @Override
    public String imprimir(){
        return "\nComercial:" +
                "\nID: " + id +
                "\nÁrea: " + area + " m²" +
                "\nDirección: " + direccion +
                "\nValor por metro cuadrado: " + valorPorMetroCuadrado + " usd" +
                "\nTipo de comercial: " + tipoComercial +
                "\nCentro comercial: " + centroComercial + "\n";
    };
}
