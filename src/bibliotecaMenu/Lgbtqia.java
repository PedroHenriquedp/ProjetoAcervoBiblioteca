package bibliotecaMenu;
//NESSA CLASSE FOI FEITA ALTERAÃ‡ÃƒO DAS VARIVEIS, ISSO TERIA QUE SER FEITO EM CADA CATEGORIA
//EXEMPLO: NA CATEGORIA "ROMANCE DE EPOCA" TERÃ� QUE SER FEITO A MESMA COISA
public class Lgbtqia extends Romance {
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
		this.sinopse = "LendÃ¡ria estrela de Hollywood, Evelyn Hugo sempre esteve sob os holofotes â€• seja estrelando uma produÃ§Ã£o vencedora do Oscar, protagonizando algum escÃ¢ndalo ou aparecendo com um novo maridoâ€¦ pela sÃ©tima vez. Agora, prestes a completar oitenta anos e reclusa em seu apartamento no Upper East Side, a famigerada atriz decide contar a prÃ³pria histÃ³ria â€• ou sua â€œverdadeira histÃ³riaâ€� â€•, mas com uma condiÃ§Ã£o: que Monique Grant, jornalista iniciante e atÃ© entÃ£o desconhecida, seja a entrevistadora.";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publicaÃ§Ã£o: ");
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
		System.out.print("Quantidade de pÃ¡ginas: ");
		this.qtdPag = 360;
		System.out.println(qtdPag);
	}
	
	public void mostrarNota() {
		System.out.print("Nota: ");
		this.nota = 4.48;
		System.out.println(nota);
	}
}