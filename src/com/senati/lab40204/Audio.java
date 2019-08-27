package com.senati.lab40204;

public class Audio {
	String titulo;
	String autor;
	String lugar;
	Double duracion;
	
	public Audio() {
		super();
	}

	public Audio(String titulo, String autor, String lugar, Double duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.lugar = lugar;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Audio [titulo=" + titulo + ", autor=" + autor + ", lugar=" + lugar + ", duracion=" + duracion + "]";
	}
	
	
}
