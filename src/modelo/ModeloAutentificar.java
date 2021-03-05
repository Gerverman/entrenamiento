package modelo;

import interfaces.InterfaceAutentificar;

public class ModeloAutentificar implements InterfaceAutentificar.Modelo {
	

	InterfaceAutentificar.Controlador controlador;
	
	public ModeloAutentificar(InterfaceAutentificar.Controlador controlador) {
		this.controlador = controlador;
	}

	public void consultarCredenciales() {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario("ruddy", "123456");
		
		controlador.verificarAutentificacion(usuario);
	}
	
}
