package modelo;

import java.util.ArrayList;

public class Encuesta {
	
	private String titulo;
	private ArrayList<Integer> listaVotaciones;
	private float promedio;
	
	public Encuesta() {
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public ArrayList<Integer> getListaVotaciones() {
		return listaVotaciones;
	}
	public void setListaVotaciones(ArrayList<Integer> listaVotaciones) {
		this.listaVotaciones = listaVotaciones;
	}
	public float getPromedio() {
		return promedio;
	}
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	
	@Override
	public String toString() {
		return "Encuesta [titulo=" + titulo + ", promedio=" + promedio + "]";
	}
	
}
