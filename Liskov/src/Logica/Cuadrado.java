package Logica;

public class Cuadrado implements Forma{
	private double tamaño;
	public Cuadrado() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Cuadrado(double tamaño) {
		super();
		this.tamaño = tamaño;
	}



	public double getTamaño() {
		return tamaño;
	}



	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.tamaño*this.tamaño;
	}

}
