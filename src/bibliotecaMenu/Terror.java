package bibliotecaMenu;

public class Terror extends FormaBiblioteca{
	
     @Override
     public void mostrarGenero() {
    	this.gen = "(1)Terror";
 		System.out.println(gen);
 	}
     public void mostrarCategoria() {
    	 this.categoria = "(1)Serial Killer \n(2)Terror Psicologico";
    	 System.out.println(categoria);
     }
     
     
}