package bibliotecaMenu;

public class InfantoJuvenil extends Infantil {

	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "A Bolsa Amarela";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Casa Lygia Bojunga";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Lygia Bojunga";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "\nÉ o romance de uma menina que entra em conflito consigo mesma e com a família ao"
				+ "\n\t reprimir três grandes vontades "
				+ "\n\t (que ela esconde numa bolsa amarela)- a vontade de crescer, a de ser garoto e a de"
				+ "\n\t se tornar escritora. A partir dessa revelação- por si mesma uma "
				+ "\n\t contestação à estrutura familiar tradicional em cujo meio criança não tem "
				+ "\n\t vontade- essa menina sensível e imaginativa nos conta o seu dia-a-dia, "
				+ "\n\t juntando o mundo real da família ao mundo criado por sua imaginação fértil e povoado"
				+ "\n\t de amigos secretos e fantasias.";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publicação: ");
		this.anoPubli = 1976;
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
		this.qtdPag = 104;
		System.out.println(qtdPag);
	}
	
}
