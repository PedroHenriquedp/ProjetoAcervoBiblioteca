package bibliotecaMenu;

public class TerrorPsicologico extends FormaBiblioteca{

	
	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "A Paciente Silenciosa";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Record";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Alex Michaelides";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "Só ela sabe o que aconteceu.Só ele pode fazê-la falar. "
				+ "\nAlicia Berenson tinha uma vida perfeita. "
				+ "\nEla era uma pintora famosa casada com um fotógrafo bem-sucedido. "
				+ "\nAlicia tinha 33 anos quando deu cinco tiros no rosto do marido, e "
				+ "\nela nunca mais disse uma palavra. "
				+ "\nO mistério atrai a atenção do público e aumenta ainda mais a fama da pintora. "
				+ "\nEntretanto, enquanto seus quadros passam a ser mais valorizados que nunca, "
				+ "\nela é levada para o Grove, um hospital psiquiátrico judiciário.Enquanto isso, "
				+ "\nTheo Faber é um psicoterapeuta forense que espera há muito tempo por uma oportunidade de "
				+ "\ntrabalhar com Alicia, ele tem certeza de que é a pessoa certa para lidar com o caso. "
				+ "\nPorém, se ela falar, ele será capaz de ouvir a verdade?";
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
		this.tw = "Automutilação, Assassinato, Idealização de Suícidio";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de páginas: ");
		this.qtdPag = 336;
		System.out.println(qtdPag);
	}
}