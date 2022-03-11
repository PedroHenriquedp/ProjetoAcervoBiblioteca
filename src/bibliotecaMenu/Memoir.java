package bibliotecaMenu;

public class Memoir extends FormaBiblioteca{
	
	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "Eu Sei Por Que o Pássaro Canta na Gaiola";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Astral Cultural";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Maya Angelou";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "\n RACISMO. ABUSO. LIBERTAÇÃO. "
				+ "\nA vida de Marguerite Ann Johnson foi marcada por essas três palavras. "
				+ "\nA garota negra, criada no sul por sua avó paterna, carregou consigo um enorme fardo "
				+ "\nque foi aliviado apenas pela literatura e por tudo aquilo que ela pôde lhe trazer: "
				+ "\nconforto através das palavras. Dessa forma, Maya escreve para exibir sua voz e "
				+ "\nlibertar-se das grades que foram colocadas em sua vida. "
				+ "\nAs lembranças dolorosas e suas descobertas estão contidas e eternizadas nas páginas "
				+ "\ndesta obra densa e necessária, dando voz aos jovens que um dia foram, assim como ela, "
				+ "\nfadados a uma vida dura e cheia de preconceitos.";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publicação: ");
		this.anoPubli = 1969;
		System.out.println(anoPubli);
	}
	
	public void mostrarClasseInd() {
		System.out.print("Classe indicativa: ");
		this.classeInd = "12 anos";
		System.out.println(classeInd);
	}
	
	public void mostrarTW() {
		System.out.print("TW: ");
		this.tw = "Violência sexual infantil (verbalizado), Violência sexual (verbalizado), cenas violentas";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de páginas: ");
		this.qtdPag = 336;
		System.out.println(qtdPag);
	}
	
	
	
	
}
