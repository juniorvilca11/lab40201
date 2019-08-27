package com.senati.lab40204;

public class Libros {
	String titulo;
	String autor;
	int npaginas;
	int isbn;
	
	public Libros() {
		super();
	}

	public Libros(String titulo, String autor, int npaginas, int isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.npaginas = npaginas;
		this.isbn = isbn;
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

	public int getNpaginas() {
		return npaginas;
	}

	public void setNpaginas(int npaginas) {
		this.npaginas = npaginas;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", autor=" + autor + ", npaginas=" + npaginas + ", isbn=" + isbn + "]";
	}
	
	
}
