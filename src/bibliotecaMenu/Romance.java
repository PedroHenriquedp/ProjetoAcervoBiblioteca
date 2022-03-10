package bibliotecaMenu;

public class Romance extends FormaBiblioteca {
	@Override
    public void mostrarGenero() {
   	 this.gen = "(2)Romance";
		System.out.println(gen);
	}
    public void mostrarCategoria() {
   	 this.categoria = "(1)LGBTQIA+ \n(2)Romance de Época";
   	 System.out.println(categoria);
    }
	public void mostrarNome() {
		// TODO Auto-generated method stub
		
	}
}