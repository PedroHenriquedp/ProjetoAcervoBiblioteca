package bibliotecaMenu;

public class FormaBiblioteca implements Interface {
<<<<<<< HEAD
	// TESTE
=======
>>>>>>> 2668567b03f2493a0dc8960ec070abb4f7663c2e
	//ATRIBUTOS EM PROTECTED PARA SEREM ACESSADOS PELAS CLASSE DE GENEROS (EXEMPLO: A CLASSE ROMANCE)
	protected String nome, categoria, gen, editora, autor, sinopse, tw, classeInd;
	protected int anoPubli, qtdPag;
	protected double nota,x,y;
	
<<<<<<< HEAD
=======
	
>>>>>>> 2668567b03f2493a0dc8960ec070abb4f7663c2e
	//POLIMORFISMO PEGANDOS OS MÉTODOS DA INTERFACE
	@Override
    public void mostrarCategoria() {
		System.out.println(categoria);
	}
	
	public void mostrarNome() {
		System.out.println(nome);
	}
	
	public void mostrarGenero() {
		
		System.out.println(gen);
	}
	
	public void mostrarEditora() {
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.println(anoPubli);
	}
	
	public void mostrarClasseInd() {
		System.out.println(classeInd);
	}
	public void mostrarTW() {
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.println(qtdPag);
	}
	
	public void mostrarNota(double x) {
		System.out.println("Nota: "+x);
	}
	public void mostrarNota(double x,double y) {
<<<<<<< HEAD
		System.out.println("Nota: "+(x+y)/2);
=======
		System.out.println("Nota: "+(x+y)/2+" de 5");
>>>>>>> 2668567b03f2493a0dc8960ec070abb4f7663c2e
	}
}