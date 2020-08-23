package Logica;

public class Homero extends Simpson{

	public Homero(String camiseta, String pantalon) {
		super(camiseta, pantalon);
		
	}
	@Override
	void dibujar() {
		System.out.println("Homero: \n"+getCamiseta()+"\n"+getPantalon());
		
	}
	

}
