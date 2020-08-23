package Logica;

import Persistencia.DAO;

public class ServicioPersona {
	
	private DAO guardar;
	
	public ServicioPersona(DAO guardar) {
		this.guardar = guardar;
	}
	
	public void savePersona(Persona persona)
	   {
	       guardar.guardar(persona);
	   }

}
