package bibliotecaMenu;

public class Biografia extends FormaBiblioteca {

	
	@Override
    public void mostrarCategoria() {
   	 this.categoria = "(1)Autobiografia \n(2)Memoir";
   	 System.out.println(categoria);
    }
	
}
