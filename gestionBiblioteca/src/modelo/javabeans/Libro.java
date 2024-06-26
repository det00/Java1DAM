package modelo.javabeans;

import java.util.Objects;

public class Libro {
	private String titulo;
	private String autor;
	private int isbn;
	private int pag;
	private boolean disp;
	
	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, int isbn, int pag, boolean disp) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.pag = pag;
		this.disp = disp;
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

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getPag() {
		return pag;
	}

	public void setPag(int pag) {
		this.pag = pag;
	}

	public boolean isDisp() {
		return disp;
	}

	public void setDisp(boolean disp) {
		this.disp = disp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", pag=" + pag + ", disp=" + disp
				+ "]";
	}
	
	
	
}

