package Presentación;

import Logica.Persona;
import Logica.ServicioPersona;
import Persistencia.DAO;

public class Principal {
	public static void main(String[] arg) {
		Persona persona = new Persona();
		persona.setNombre("Alejandro Rojas");
		
		ServicioPersona sp = new ServicioPersona((DAO)persona);
		sp.savePersona(persona);
	}

}
