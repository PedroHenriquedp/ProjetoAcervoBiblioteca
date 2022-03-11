package bibliotecaMenu;
//NESSA CLASSE FOI FEITA A ALTERAÇÃO DAS VARIVEIS, ISSO TERIA QUE SER FEITO EM CADA CATEGORIA

public class RomanceDeEpoca extends Romance {
	
	//SOBRECARGA - DE METODOS DE FORMABIBLIOTECA

	@Override
	public void mostrarNome() {
		System.out.print("Nome: ");
		this.nome = "Perdida";
		System.out.println(nome);
	}

	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Verus";
		System.out.println(editora);
	}

	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Carina Rissi";
		System.out.println(autor);
	}

	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "Sofia vive em uma metrópole e está acostumada com a "
				+ "\n\t modernidade e as facilidades que ela traz. "
				+ "\n\t Ela é independente e tem pavor à mera menção da palavra casamento. "
				+ "\n\t Após comprar um celular novo, algo misterioso acontece e Sofia "
				+ "\n\t descobre que está perdida no século dezenove, "
				+ "\n\t sem ter ideia de como voltar para casa – ou se isso sequer é possível. "
				+ "\n\t Enquanto tenta desesperadamente encontrar um meio de retornar ao "
				+ "\n\t tempo presente, ela é acolhida pela família Clarke. "
				+ "\n\t Com a ajuda do prestativo – e lindo – Ian Clarke, Sofia "
				+ "\n\t embarca numa busca frenética e acaba encontrando pistas que talvez "
				+ "\n\t possam ajudá-la a resolver esse mistério e voltar para sua tão "
				+ "\n\t amada vida moderna.O que ela não sabia era que seu coração tinha outros "
				+ "\n\t planos.";

		System.out.println(sinopse);
	}

	public void mostrarAnoPubli() {
		System.out.print("Ano de publicação: ");
		this.anoPubli = 2013;
		System.out.println(anoPubli);
	}

	public void mostrarClasseInd() {
		System.out.print("Classe indicativa: ");
		this.classeInd = "Livre";
		System.out.println(classeInd);
	}

	public void mostrarTW() {
		System.out.print("TW: ");
		this.tw = "Nenhum";
		System.out.println(tw);
	}

	public void mostrarQtdPag() {
		System.out.print("Quantidade de páginas: ");
		this.qtdPag = 364;
		System.out.println(qtdPag);
	}
}