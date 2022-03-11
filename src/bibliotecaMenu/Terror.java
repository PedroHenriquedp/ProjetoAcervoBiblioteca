package bibliotecaMenu;

public class Terror extends FormaBiblioteca{
	
     @Override
<<<<<<< HEAD
 	//SOBRECARGA - MOSTRARCATEGORIA DE FORMABIBLIOTECA
     public void mostrarCategoria() {
    	 this.categoria = "(1) Serial Killer \n(2) Terror Psicologico";
=======
     public void mostrarGenero() {
    	this.gen = "(1)Terror";
 		System.out.println(gen);
 	}
     public void mostrarCategoria() {
    	 this.categoria = "(1)Serial Killer \n(2)Terror Psicologico";
>>>>>>> 2668567b03f2493a0dc8960ec070abb4f7663c2e
    	 System.out.println(categoria);
     }
     
     
}