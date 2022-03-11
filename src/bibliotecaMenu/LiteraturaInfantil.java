package bibliotecaMenu;

public class LiteraturaInfantil extends Infantil{

	
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
		this.sinopse = "\nO protagonista desta história é um ser circular que visivelmente não está completo: "
				+ "\n\t falta-lhe uma parte. E ele acredita que existe pelo mundo uma forma que vai "
				+ "\n\t completá-lo perfeitamente e que, quando estiver completo, vai se sentir feliz de vez. "
				+ "\n\t Então ele parte animado em uma jornada em busca de sua parte que falta. "
				+ "\n\t Mas, ao explorar o mundo, talvez perceba que a verdadeira felicidade não está no outro, "
				+ "\n\t mas dentro de nós mesmos.";
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
		this.qtdPag = 112;
		System.out.println(qtdPag);
	}
	
}
