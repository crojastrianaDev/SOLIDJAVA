package Logica;

public class OperarIva extends OperarFactura{
	
	 private double importeIva;

	    public OperarIva() {
	    }

	    public OperarIva(double importeIva) {
	        this.importeIva = importeIva;
	    }

	    public OperarIva(double importeIva, double importeFactura) {
	        super(importeFactura);
	        this.importeIva = importeIva;
	    }

	    public double getImporteIva() {
	        return importeIva;
	    }

	    public void setImporteIva(double importeIva) {
	        this.importeIva = importeIva;
	    }
	     
	    
	   
	    public void calcularIva() {
	       
	        this.importeIva=this.importeFactura*0.19;
	    }

}
