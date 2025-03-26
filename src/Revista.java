public class Revista extends ItemBiblioteca {
	private int numero;
    private String periodicidade;
    private String editora;

    @Override
    public String detalhes() {
        return " Revista: " + getTitulo() + " | Número: " + numero + " | Ano: " + getAnoPublicacao() +
               " | Periodicidade: " + periodicidade + " | Editora: " + editora +
               " | Disponível: " + (isDisponivel() ? "Sim" : "Não");
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
    
}
