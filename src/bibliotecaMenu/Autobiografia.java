package bibliotecaMenu;

public class Autobiografia extends FormaBiblioteca{

	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "O Diário de Anne Frank";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Record";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Anne Frank";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "\nO diário de Anne Frank, o depoimento da pequena Anne, "
				+ "\nmorta pelos nazistas após passar anos escondida no sótão de uma casa em Amsterdã, "
				+ "\nnarra os sentimentos, os medos e as pequenas alegrias de uma menina judia que, "
				+ "\ncomo sua família, lutou em vão para sobreviver ao Holocausto. "
				+ "\nUma poderosa lembrança dos horrores de uma guerra, "
				+ "\num testemunho eloquente do espírito humano, "
				+ "\nassim podemos descrever os relatos feitos por Anne em seu diário. "
				+ "\nAs anotações mostram um fascinante relato sobre a coragem e a fraqueza humana e, "
				+ "\nsobretudo, um vigoroso autorretrato de uma menina sensível e determinada";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publicação: ");
		this.anoPubli = 1947;
		System.out.println(anoPubli);
	}
	
	public void mostrarClasseInd() {
		System.out.print("Classe indicativa: ");
		this.classeInd = "12 anos";
		System.out.println(classeInd);
	}
	
	public void mostrarTW() {
		System.out.print("TW: ");
		this.tw = "Nenhum";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de páginas: ");
		this.qtdPag = 352;
		System.out.println(qtdPag);
	}
	
	
}
