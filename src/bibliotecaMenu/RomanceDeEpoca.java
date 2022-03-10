package bibliotecaMenu;

public class RomanceDeEpoca extends Romance {
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
		this.sinopse = "Sofia vive em uma metr�pole e est� acostumada com a modernidade e as facilidades que ela traz. Ela � independente e tem pavor � mera men��o da palavra casamento. Ap�s comprar um celular novo, algo misterioso acontece e Sofia descobre que est� perdida no s�culo dezenove, sem ter ideia de como voltar para casa � ou se isso sequer � poss�vel. Enquanto tenta desesperadamente encontrar um meio de retornar ao tempo presente, ela � acolhida pela fam�lia Clarke. Com a ajuda do prestativo � e lindo � Ian Clarke, Sofia embarca numa busca fren�tica e acaba encontrando pistas que talvez possam ajud�-la a resolver esse mist�rio e voltar para sua t�o amada vida moderna.O que ela n�o sabia era que seu cora��o tinha outros planos.";
		System.out.println(sinopse);
	}

	public void mostrarAnoPubli() {
		System.out.print("Ano de publica��o: ");
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
		System.out.print("Quantidade de p�ginas: ");
		this.qtdPag = 364;
		System.out.println(qtdPag);
	}

	public void mostrarNota() {
		System.out.print("Nota: ");
		this.nota = 4.25;
		System.out.println(nota);
	}
}