package bibliotecaMenu;

public class Infantil extends FormaBiblioteca {

	
	@Override
    public void mostrarCategoria() {
   	 this.categoria = "(1)InfantoJuvenil \n(2)Literatura Infantil";
   	 System.out.println(categoria);
    }
}
