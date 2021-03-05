package modelo;

public class Usuario {
//	String encript=DigestUtils.shaHex(texto);
	private String nombreUsuario;
	private String contrasenia;
	
	public Usuario(String nombreUsuario, String contrasenia) {
		this.nombreUsuario = nombreUsuario;
		this.contrasenia =  contrasenia;
	}
	
	public Usuario() {
		
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	
}
