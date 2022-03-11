package bibliotecaMenu;

public class Romance extends FormaBiblioteca {
	//SOBRECARGA - MOSTRARCATEGORIA DE FORMABIBLIOTECA
	@Override
    public void mostrarCategoria() {
   	 this.categoria = "(1) LGBTQIA+ \n(2) Romance de Época";
   	 System.out.println(categoria);
    }
}