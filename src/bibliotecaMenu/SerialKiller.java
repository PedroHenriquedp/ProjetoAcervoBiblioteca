package bibliotecaMenu;
<<<<<<< HEAD
//NESSA CLASSE FOI FEITA A ALTERAÇÃO DAS VARIVEIS, ISSO TERIA QUE SER FEITO EM CADA CATEGORIA

public class SerialKiller extends Terror{
	
	//SOBRECARGA - DE METODOS DE FORMABIBLIOTECA
=======

public class SerialKiller extends FormaBiblioteca{

>>>>>>> 2668567b03f2493a0dc8960ec070abb4f7663c2e
	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "Bom dia, Verônica";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = " Dark Side";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Ilana Casoy, Raphael Montes ";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "A rotina da secretária de polícia Verônica Torres era pacata, "
<<<<<<< HEAD
				+ "\n\t burocrática e repleta de sonhos interrompidos até aquela manhã. "
				+ "\n\t Um abismo se abre diante de seus pés de uma hora para outra quando, "
				+ "\n\t na mesma semana, ela presencia um suicídio inesperado e recebe a ligação "
				+ "\n\t anônima de uma mulher clamando por sua vida. "
				+ "\n\t Verônica sente um verdadeiro calafrio, "
				+ "\n\t mas abraça a oportunidade de mostrar suas habilidades investigativas e "
				+ "\n\t decide mergulhar sozinha nos dois casos";
=======
				+ "\nburocrática e repleta de sonhos interrompidos até aquela manhã. "
				+ "\nUm abismo se abre diante de seus pés de uma hora para outra quando, "
				+ "\nna mesma semana, ela presencia um suicídio inesperado e recebe a ligação "
				+ "\nanônima de uma mulher clamando por sua vida. "
				+ "\nVerônica sente um verdadeiro calafrio, "
				+ "\nmas abraça a oportunidade de mostrar suas habilidades investigativas e "
				+ "\ndecide mergulhar sozinha nos dois casos";
>>>>>>> 2668567b03f2493a0dc8960ec070abb4f7663c2e
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
		this.tw = "Cenas violentas";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de páginas: ");
		this.qtdPag = 256;
		System.out.println(qtdPag);
	}
}