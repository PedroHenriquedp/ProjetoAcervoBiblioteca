package bibliotecaMenu;

import java.util.Scanner;
import java.util.ArrayList;

public class MainBiblioteca {
	public static void main(String[] args) {
		//CRIANDO O OBJETO ROMANCE
		Romance romance = new Romance();
//		Terror terror = new Terror();
		Scanner leia = new Scanner(System.in);
		
		//ARRAY LIST
		ArrayList<String> gensDisponiveis = new ArrayList<String>();
		//INSERINDO OS GÊNEROS MANUALMENTE NO ARRAY
		gensDisponiveis.add("Terror");
		gensDisponiveis.add("terror");
		gensDisponiveis.add("Romance");
		gensDisponiveis.add("romance");
//		IGNORADO: System.out.println(gensDisponiveis);

		System.out.print("Digite o gênero que deseja: ");
		String verificar = leia.next();
		//VERIFICAR SE O NOME DE GENERO QUE O USUARIO DIGITOU DA DISPONIVEL
		gensDisponiveis.contains(verificar);

		//CASO O GENERO ESTEJA DISPONIVEL
		if (gensDisponiveis.contains(verificar) == true) {
			System.out.println("O gênero " + verificar + " está disponível.");
		}
		
		//CASO O GENERO NÃO ESTEJA DISPONIVEL
		else{
			System.out.println("O gênero " + verificar + " não está disponível.");
			//FECHANDO O PROGRAMA
			System.exit(0);
		}
		
		//VERIFICAR A POSIÇÃO DO GENERO
		int posicao = gensDisponiveis.indexOf(verificar);

		//LOGICA: O GENERO  "ROMANCE" ESTÁ NA POSIÇÃO 1. 
		//ASSIM, QUANDO O USUARIO DIGITAR UM TERMO QUE ESTEJA NA POSIÇÃO 1 (OU SEJA, ROMANCE), ESSA INSTRUÇÃO SERA "ATIVADA" 
		//POR EXEMPLO, TERÁ QUE SER FEITO UMA INSTRUÇÃO PRA CASO A POSIÇÃO FOR IGUAL A 0 (OU SEJA, TERROR) E ASSIM POR DIANTE
		if (posicao == 2 || posicao == 3) {
			System.out.println("Escolha uma categoria: ");
			romance.mostrarCategoria();
			int catR = leia.nextInt();
			//MOSTRANDO TUDO :)
			if (catR == 1) {
				Lgbtqia l = new Lgbtqia();
				l.mostrarNome();
				l.mostrarEditora();
				l.mostrarAutor();
				l.mostrarSinopse();
				l.mostrarAnoPubli();
				l.mostrarClasseInd();
				l.mostrarTW();
				l.mostrarQtdPag();
				l.mostrarNota();
			}
			
			else if (catR==2) {
				RomanceDeEpoca r = new RomanceDeEpoca();
				r.mostrarNome();
				r.mostrarEditora();
				r.mostrarAutor();
				r.mostrarSinopse();
				r.mostrarAnoPubli();
				r.mostrarClasseInd();
				r.mostrarTW();
				r.mostrarQtdPag();
				r.mostrarNota();
			}
		leia.close();
		}
	}
}