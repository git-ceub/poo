public class Principal {
	
	public static void main(String[] args) {
        // Criando itens
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Revista revista1 = new Revista();

        livro1.setTitulo("Java");
        livro1.setAnoPublicacao(2000);
        livro1.setAutor("Molina");
        livro1.setIsbn("12345678");
        livro1.setNumeroPaginas(500);
        
        livro2.setTitulo("Php");
        livro2.setAnoPublicacao(2010);
        livro2.setAutor("José");
        livro2.setIsbn("321654987");
        livro2.setNumeroPaginas(030);
        
        revista1.setTitulo("Veja");
        revista1.setAnoPublicacao(2003);
        revista1.setEditora("Abril");
        revista1.setNumero(3);
        revista1.setPeriodicidade("Semanal");
        
        // Criando usuários
        Usuario usuario1 = new Usuario();
        usuario1.setNome("Molina");

        // Emprestando itens
        usuario1.emprestarItem(livro1);
        usuario1.emprestarItem(revista1);
        usuario1.emprestarItem(livro1); // Testando item já emprestado

        // Listando itens emprestados
        usuario1.listarItensEmprestados();

        // Devolvendo item
        usuario1.devolverItem(livro1);
        usuario1.listarItensEmprestados();
	}

}
