package vista;

import java.awt.GridBagConstraints;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import controlador.DimensionesPantalla;

//import javax.swing.*;
/**
 * @author GerverMan
 *
 */
public class Login extends Plantilla {
	
	private JTextField user,contrasenia;
	private JButton botonIniciar;
	private ImageIcon iconoLogin;
	private JLabel labelIcon;
	private DimensionesPantalla dimPan;
	private JPanel formulario;
	
	public Login() {
		super("INICIAR SESION");
		dimPan = new DimensionesPantalla();
	
		iniciarComponentes();
		setVisible(true);
	}
	private void iniciarComponentes(){
		
		formulario = new JPanel();
		formulario.setLayout(null);
		central.add(formulario);
		
		initImagen();
		user=new JTextField();
		user.setBounds(dimPan.PenX(35), dimPan.PenY(30), dimPan.PenX(30), dimPan.PenY(5));
		contrasenia=new JTextField();
		contrasenia.setBounds(dimPan.PenX(35), dimPan.PenY(40), dimPan.PenX(30), dimPan.PenY(5));
		botonIniciar=new JButton("INICIAR");
		botonIniciar.setBounds(dimPan.PenX(35), dimPan.PenY(50), dimPan.PenX(30), dimPan.PenY(5));
		
		//central.add(new JLabel());
		formulario.add(user);
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
}
