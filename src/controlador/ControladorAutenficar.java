package controlador;

import interfaces.InterfaceAutentificar;
import modelo.ModeloAutentificar;
import modelo.Usuario;

public class ControladorAutenficar implements InterfaceAutentificar.Controlador {
	
	private Usuario usuario;
	private InterfaceAutentificar.Vista vista;
	private ModeloAutentificar modelo;
	
	public ControladorAutenficar(InterfaceAutentificar.Vista vista) {
		this.vista = vista;
		usuario = new Usuario();
		modelo = new ModeloAutentificar(this);
	}
	
	public void vistaUsuario(Usuario usuario) {
		this.usuario = usuario;
		modelo.consultarCredenciales();
	}

	public void verificarAutentificacion(Usuario usuario) {
		// TODO Auto-generated method stub
		if(this.usuario.getNombreUsuario().equals(usuario.getNombreUsuario()) 
				&& this.usuario.getContrasenia().equals(usuario.getContrasenia())) {
			vista.mostrarAutentificacion(true);
		}else vista.mostrarAutentificacion(false);
	}
	
}
