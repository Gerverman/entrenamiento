package vista;

import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.PresentationDirection;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import controlador.ControladorAutenficar;
import controlador.DimensionesPantalla;
import interfaces.InterfaceAutentificar;
import modelo.Usuario;

//import javax.swing.*;
/**
 * @author GerverMan
 *
 */
public class Login extends Plantilla implements ActionListener, InterfaceAutentificar.Vista {
	
	private JTextField usuario,contrasenia;
	private JButton botonIniciar;
	private ImageIcon iconoLogin;
	private JLabel labelIcon;
	private DimensionesPantalla dimPan;
	private JPanel formulario;
	private ControladorAutenficar controlador;
	
	public Login() {
		super("INICIAR SESION");
		dimPan = new DimensionesPantalla();
	
		iniciarComponentes();
		setVisible(true);
		
		controlador = new ControladorAutenficar(this);
	}
	private void iniciarComponentes(){
		
		formulario = new JPanel();
		formulario.setLayout(null);
		central.add(formulario);
		
		initImagen();
		usuario=new JTextField();
		usuario.setBounds(dimPan.PenX(35), dimPan.PenY(30), dimPan.PenX(30), dimPan.PenY(5));
		contrasenia=new JTextField();
		contrasenia.setBounds(dimPan.PenX(35), dimPan.PenY(40), dimPan.PenX(30), dimPan.PenY(5));
		botonIniciar=new JButton("INICIAR");
		botonIniciar.setBounds(dimPan.PenX(35), dimPan.PenY(50), dimPan.PenX(30), dimPan.PenY(5));
		botonIniciar.addActionListener(this);
		//central.add(new JLabel());
		formulario.add(usuario);
		//central.add(new JLabel());
		
		//central.add(new JLabel());
		formulario.add(contrasenia);
		//central.add(new JLabel());
		
		//central.add(new JLabel());
		formulario.add(botonIniciar);
		//central.add(new JLabel());
	}
	private void initImagen(){
		labelIcon = new JLabel();
		labelIcon.setBounds(dimPan.PenX(30), dimPan.PenY(5), dimPan.PenX(30F), dimPan.PenY(30F));
		iconoLogin = new ImageIcon(getClass().getResource("iconlogin.png"));		
		ImageIcon propiedadesFondo = new ImageIcon(iconoLogin.getImage().getScaledInstance(labelIcon.getWidth(), labelIcon.getHeight(), Image.SCALE_DEFAULT));
		labelIcon.setIcon(propiedadesFondo);
		formulario.add(labelIcon);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == botonIniciar) {
			Usuario user = new Usuario(usuario.getText(), contrasenia.getText());
		
			controlador.vistaUsuario(user);
			
		}else System.out.println("Cambiar datos...");
	}
	public void mostrarAutentificacion(boolean exitoso) {
		// TODO Auto-generated method stub
		if(exitoso) System.out.println("Iniciaste sesión");
		else System.out.println("No pudiste iniciar sesión");
	}
	
}
