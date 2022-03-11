package bibliotecaMenu;

public class Apocalipse extends FiccaoCientifica {

	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "Ensaio Sobre a Cegueira";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Companhia das Letras";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "José Saramago";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "Um motorista parado no sinal se descobre subitamente cego. "
				+ "\n\t É o primeiro caso de uma \"\"treva branca\"\" que logo se espalha incontrolavelmente. Resguardados em quarentena, "
				+ "\n\t os cegos se perceberão reduzidos à essência humana, numa verdadeira viagem às trevas. "
				+ "\n\t O Ensaio sobre a cegueira é a fantasia de um autor que nos faz lembrar \"a responsabilidade de ter olhos quando os outros "
				+ "\n\t os perderam\".";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publicação: ");
		this.anoPubli = 1995;
		System.out.println(anoPubli);
	}
	
	public void mostrarClasseInd() {
		System.out.print("Classe indicativa: ");
		this.classeInd = "16+";
		System.out.println(classeInd);
	}
	
	public void mostrarTW() {
		System.out.print("TW: ");
		this.tw = "Não disponível";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de páginas: ");
		this.qtdPag = 312;
		System.out.println(qtdPag);
	}
}
