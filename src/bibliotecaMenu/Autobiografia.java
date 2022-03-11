package bibliotecaMenu;

public class Autobiografia extends Biografia{

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
				+ "\n\t morta pelos nazistas após passar anos escondida no sótão de uma casa em Amsterdã, "
				+ "\n\t narra os sentimentos, os medos e as pequenas alegrias de uma menina judia que, "
				+ "\n\t como sua família, lutou em vão para sobreviver ao Holocausto. "
				+ "\n\t Uma poderosa lembrança dos horrores de uma guerra, "
				+ "\n\t um testemunho eloquente do espírito humano, "
				+ "\n\t assim podemos descrever os relatos feitos por Anne em seu diário. "
				+ "\n\t As anotações mostram um fascinante relato sobre a coragem e a fraqueza humana e, "
				+ "\n\t sobretudo, um vigoroso autorretrato de uma menina sensível e determinada";
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
