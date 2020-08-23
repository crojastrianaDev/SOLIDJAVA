package Logica;

public class Factura implements OperacionesFactura{
	
	 private OperarDeduccion totaldeduccion;
	    private OperarIva totaliva;
	    private OperarFactura factura;
	    private double totalfactura;
	     public Factura() {
			// TODO Auto-generated constructor stub
		}
	     
	public Factura(OperarDeduccion totaldeduccion, OperarIva totaliva, OperarFactura factura) {
		this.totaldeduccion = totaldeduccion;
        this.totaliva = totaliva;
        this.factura = factura;
		}

	public OperarDeduccion getTotaldeduccion() {
			return totaldeduccion;
		}

		public void setTotaldeduccion(OperarDeduccion totaldeduccion) {
			this.totaldeduccion = totaldeduccion;
		}

		public OperarIva getTotaliva() {
			return totaliva;
		}

		public void setTotaliva(OperarIva totaliva) {
			this.totaliva = totaliva;
		}

		public OperarFactura getFactura() {
			return factura;
		}

		public void setFactura(OperarFactura factura) {
			this.factura = factura;
		}

		public double getTotalfactura() {
			return totalfactura;
		}

		public void setTotalfactura(double totalfactura) {
			this.totalfactura = totalfactura;
		}

	@Override
	public void calcularTotalFactura() {
		this.totalfactura= (this.factura.getImporteFactura() - this.totaldeduccion.getImporteDeduccion()) + this.totaliva.getImporteIva();
		
	}

}
