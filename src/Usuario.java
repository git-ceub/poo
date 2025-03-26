import java.util.ArrayList;

public class Usuario {
	
	private String nome;
    private ArrayList<ItemBiblioteca> itensEmprestados = new ArrayList<ItemBiblioteca>();

    public boolean emprestarItem(ItemBiblioteca item) {
        if (item.emprestar()) {
            itensEmprestados.add(item);
            System.out.println(nome + " pegou emprestado: " + item.getTitulo());
            return true;
        } else {
            System.out.println("O item " + item.getTitulo() + " está emprestado.");
            return false;
        }
    }

    public void devolverItem(ItemBiblioteca item) {
        if (itensEmprestados.contains(item)) {
            item.devolver();
            itensEmprestados.remove(item);
            System.out.println(nome + " devolveu: " + item.getTitulo());
        } else {
            System.out.println("Este item não foi emprestado por " + nome);
        }
    }

    public void listarItensEmprestados() {
        System.out.println("Itens emprestados por " + nome + ":");
        if (itensEmprestados.isEmpty()) {
            System.out.println("Nenhum item emprestado.");
        } else {
            for (ItemBiblioteca item : itensEmprestados) {
                System.out.println("- " + item.detalhes());
            }
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
