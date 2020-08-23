package Logica;

public class Bart extends Simpson{
	public Bart(String camiseta, String pantalon) {
		super(camiseta, pantalon);
	}

	@Override
	void dibujar() {
		System.out.println("Bart \n"+getCamiseta()+"\n"+getPantalon() );
	}

}
