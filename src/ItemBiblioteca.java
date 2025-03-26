public class ItemBiblioteca {

	private String titulo;
	private int anoPublicacao;
	private boolean disponivel = true; // Encapsulado

	public boolean emprestar() {
		if (disponivel) {
			disponivel = false;
			return true;
		}
		return false;
	}
	
	public String detalhes() {
		return "";
	}

	public void devolver() {
		disponivel = true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}
}
