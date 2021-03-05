package vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

// import javafx.scene.text.Font;

import javax.swing.*;

import controlador.DimensionesPantalla;
import controlador.DimensionesPantalla;;


public class Plantilla extends JFrame{
	
	protected JPanel fondo,encabezado,izquierda,derecha,central,pie;
	private JLabel titulo;
	private DimensionesPantalla dimpan;
	
	public Plantilla(String titulo) {		
		
		dimpan=new DimensionesPantalla();
		this.setSize(dimpan.horizontal(),dimpan.vertical());		
		iniciarPanelFondo();
		iniciarPaneles();
		iniciarTextField(titulo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
	}
	private void iniciarPanelFondo(){
		fondo= new JPanel();
		fondo.setLayout(new BorderLayout());
		fondo.setBackground(Color.darkGray);
		fondo.setSize(dimpan.horizontal(),dimpan.vertical());
		this.add(fondo);
	}
	private void iniciarPaneles(){
		encabezado= new JPanel();
		encabezado.setLayout(new FlowLayout());
		encabezado.setBackground(Color.darkGray);
		//encabezado.setSize(dimpan.horizontal(),dimpan.vertical());
		fondo.add(encabezado,BorderLayout.NORTH);
		
		izquierda= new JPanel();
		izquierda.setLayout(new BoxLayout(izquierda,2));
		izquierda.setBackground(Color.darkGray);
		//izquierda.setSize(dimpan.horizontal(),dimpan.vertical());
		fondo.add(izquierda,BorderLayout.WEST);
		
		derecha= new JPanel();
		derecha.setLayout(new BoxLayout(derecha,2));
		derecha.setBackground(Color.darkGray);
		//derecha.setSize(dimpan.horizontal(),dimpan.vertical());
		fondo.add(derecha,BorderLayout.EAST);
		
		central= new JPanel();
		central.setLayout(new GridLayout(1,1, 0, 0));
		//central.setLayout(null);
		central.setBackground(Color.darkGray);
		//central.setSize(dimpan.horizontal(),dimpan.vertical());
		fondo.add(central,BorderLayout.CENTER);
		
		pie= new JPanel();
		pie.setLayout(new GridLayout(5,5,10,10));
		pie.setBackground(Color.darkGray);
		//pie.setSize(dimpan.horizontal(),dimpan.vertical());
		fondo.add(pie,BorderLayout.SOUTH);
	}
	
	private void iniciarTextField(String titulo){
		this.titulo=new JLabel();
		this.titulo.setSize(dimpan.horizontal(),dimpan.PenY(10));
		this.titulo.setText(titulo);
		this.titulo.setAlignmentX(CENTER_ALIGNMENT);
		this.titulo.setForeground(Color.RED);
		encabezado.add(this.titulo);
	}
	
}
