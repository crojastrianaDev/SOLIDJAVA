package Principal;

import Logica.Factura;
import Logica.OperarDeduccion;
import Logica.OperarFactura;
import Logica.OperarIva;

public class Control {

	public static void main(String[] args) {
		
		 double operation;
	        OperarIva iva= new OperarIva();
	        OperarDeduccion deduccion= new OperarDeduccion();
	        
	        iva.setImporteFactura(1000000);
	        iva.calcularIva();
	        System.out.println(iva.getImporteIva());
	        
	        OperarFactura fac=new OperarFactura();
	        fac.setImporteFactura(1000000);
	        System.out.println(fac.getImporteFactura());
	        
	        deduccion.setImporteFactura(1000000);
	        deduccion.setPorcentajeDeduccion(10);
	        deduccion.calcularDeduccion();
	        System.out.println(deduccion.getImporteDeduccion());
	        
	        Factura factura= new Factura(deduccion, iva, fac);
	        factura.calcularTotalFactura();
	        System.out.println("el total a facturar es "+ factura.getTotalfactura());

	}

}
