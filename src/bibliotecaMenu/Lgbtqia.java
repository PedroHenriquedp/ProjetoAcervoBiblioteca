package bibliotecaMenu;
//NESSA CLASSE FOI FEITA ALTERAÃ‡ÃƒO DAS VARIVEIS, ISSO TERIA QUE SER FEITO EM CADA CATEGORIA
//EXEMPLO: NA CATEGORIA "ROMANCE DE EPOCA" TERÃ� QUE SER FEITO A MESMA COISA
public class Lgbtqia extends FormaBiblioteca {
	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "Os Sete Maridos de Evelyn Hugo";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Paralela";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Taylor Jenkins Reid";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "Lendária estrela de Hollywood, "
				+ "Evelyn Hugo sempre esteve sob os holofotes ou seja estrelando uma produção"
				+ "\n vencedora do Oscar, protagonizando algum escândalo ou aparecendo "
				+ "\ncom um novo maridoâ€¦ pela última vez. Agora, prestes a completar "
				+ "\noitenta anos e reclusa em seu apartamento no Upper East Side, "
				+ "\na famigerada atriz decide contar a própria história ou sua verdadeira "
				+ "\nhistória, mas com uma condição que Monique Grant, jornalista iniciante"
				+ "\n e então desconhecida, seja a entrevistadora.";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publicação: ");
		this.anoPubli = 2019;
		System.out.println(anoPubli);
	}
	
	public void mostrarClasseInd() {
		System.out.print("Classe indicativa: ");
		this.classeInd = "Adulto";
		System.out.println(classeInd);
	}
	
	public void mostrarTW() {
		System.out.print("TW: ");
		this.tw = "Aborto, Relacionamento abusivo";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de páginas: ");
		this.qtdPag = 360;
		System.out.println(qtdPag);
	}
}