package interfaces;

import modelo.Usuario;

public interface InterfaceAutentificar {
	
	interface Vista{
		public void mostrarAutentificacion(boolean exitoso);
	}
	
	interface Controlador{
		public void vistaUsuario(Usuario usuario);
		public void verificarAutentificacion(Usuario usuario);
	}
	
	interface Modelo{
		public void consultarCredenciales();
	}
	
}
