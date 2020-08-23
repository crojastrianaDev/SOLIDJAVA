package Logica;

public class Rectangulo implements Forma {
	private double alto;
	private double ancho;
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}

	
	public Rectangulo(double alto, double ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}


	public double getAlto() {
		return alto;
	}


	public void setAlto(double alto) {
		this.alto = alto;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.alto*this.ancho;
	}

}
