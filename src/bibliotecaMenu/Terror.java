package bibliotecaMenu;

public class Terror extends FormaBiblioteca{
	
     @Override
 	//SOBRECARGA - MOSTRARCATEGORIA DE FORMABIBLIOTECA
     public void mostrarCategoria() {
    	 this.categoria = "(1) Serial Killer \n(2) Terror Psicologico";
    	 System.out.println(categoria);
     }
     
     
}