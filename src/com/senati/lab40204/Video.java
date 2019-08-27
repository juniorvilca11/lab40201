package com.senati.lab40204;

public class Video {
	String titulo;
	String director;
	String actores;
	double duracion;
	
	public Video() {
		super();
	}

	public Video(String titulo, String director, String actores, double duracion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActores() {
		return actores;
	}

	public void setActores(String actores) {
		this.actores = actores;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", director=" + director + ", actores=" + actores + ", duracion=" + duracion
				+ "]";
	}
	
	
}
