package Contro;

import Logica.Corvette;
import Logica.DeLorean;

public class Principal {

	public static void main(String[] args) {
		DeLorean dl = new DeLorean();
		System.err.println("DeLorean");
		dl.encender();
		dl.acelerar();
		dl.pasado();
		dl.futuro();
		
		Corvette cv = new Corvette();
		System.err.println("Corvette");
		cv.encender();
		cv.acelerar();
	}
}
