package bibliotecaMenu;

public class FiccaoCientifica extends FormaBiblioteca {

	@Override
    public void mostrarCategoria() {
		this.categoria = "(1) Distopia \n(2) Apocalipse";
		System.out.println(categoria);
    }
}
