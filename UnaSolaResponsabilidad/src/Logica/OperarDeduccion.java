package Logica;

public class OperarDeduccion extends OperarFactura{
	private double importeDeduccion;
    private int porcentajeDeduccion;

    public OperarDeduccion() {
    }

    public OperarDeduccion(double importeDeduccion, int porcentajeDeduccion) {
        this.importeDeduccion = importeDeduccion;
        this.porcentajeDeduccion = porcentajeDeduccion;
    }

    public OperarDeduccion(double importeDeduccion, int porcentajeDeduccion, double importeFactura) {
        super(importeFactura);
        this.importeDeduccion = importeDeduccion;
        this.porcentajeDeduccion = porcentajeDeduccion;
    }

    public double getImporteDeduccion() {
        return importeDeduccion;
    }

    public void setImporteDeduccion(double importeDeduccion) {
        this.importeDeduccion = importeDeduccion;
    }

    public int getPorcentajeDeduccion() {
        return porcentajeDeduccion;
    }

    public void setPorcentajeDeduccion(int porcentajeDeduccion) {
        this.porcentajeDeduccion = porcentajeDeduccion;
    }

       
    public void calcularDeduccion() {
        this.importeDeduccion= (this.importeFactura* this.porcentajeDeduccion)/100;
        
    }

}
