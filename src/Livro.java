public class Livro extends ItemBiblioteca {
	
	private String autor;
    private int numeroPaginas;
    private String isbn;

    @Override
    public String detalhes() {
        return " Livro: " + getTitulo() + " | Autor: " + autor + " | Ano: " + getAnoPublicacao() +
               " | Páginas: " + numeroPaginas + " | ISBN: " + isbn +
               " | Disponível: " + (isDisponivel() ? "Sim" : "Não");
    }

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
    
}
