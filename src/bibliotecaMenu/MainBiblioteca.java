package bibliotecaMenu;

import java.util.Scanner;
import java.util.ArrayList;

public class MainBiblioteca {
	public static void main(String[] args) {
		FormaBiblioteca nota  = new FormaBiblioteca();
		
		//CRIANDO O OBJETO ROMANCE
		Romance romance = new Romance();
		Terror terror = new Terror();
		Scanner leia = new Scanner(System.in);
		
		//COLLECTION: ARRAY LIST
		ArrayList<String> gensDisponiveis = new ArrayList<String>();
		
		//INSERINDO OS GÊNEROS MANUALMENTE NO ARRAY
		gensDisponiveis.add("Terror");
		gensDisponiveis.add("terror");
		gensDisponiveis.add("Romance");
		gensDisponiveis.add("romance");
		
		
		System.out.print("Digite o gênero que deseja: ");
		String verificar = leia.next();
		//VERIFICAR SE O NOME DE GENERO QUE O USUARIO DIGITOU DA DISPONIVEL
		gensDisponiveis.contains(verificar);

		//CASO O GENERO ESTEJA DISPONIVEL
		if (gensDisponiveis.contains(verificar) == true) {
			System.out.println("O gênero " + verificar + " está disponível.\n");
		}
		
		//CASO O GENERO NÃO ESTEJA DISPONIVEL
		else{
			System.out.println("O gênero " + verificar + " não está disponível.\n");
			//FECHANDO O PROGRAMA
			System.exit(0);
		}
		
		//VERIFICAR A POSIÇÃO DO GENERO
		int posicao = gensDisponiveis.indexOf(verificar);

		//LOGICA: O GENERO  "ROMANCE" ESTÁ NA POSIÇÃO 1. 
		//ASSIM, QUANDO O USUARIO DIGITAR UM TERMO QUE ESTEJA NA POSIÇÃO 1 (OU SEJA, ROMANCE), ESSA INSTRUÇÃO SERA "ATIVADA" 
		//POR EXEMPLO, TERÁ QUE SER FEITO UMA INSTRUÇÃO PRA CASO A POSIÇÃO FOR IGUAL A 0 (OU SEJA, TERROR) E ASSIM POR DIANTE
		
		//------------------------------------ADIÇÃO GÊNERO ROMANCE
		//EXCEPTIONS - TRATANDO O ERRO
		try {
			if (posicao == 2 || posicao == 3) {
				System.out.println("Escolha uma categoria: ");
				romance.mostrarCategoria();
				int catR = leia.nextInt();
				//MOSTRANDO TUDO :)
				if (catR == 1) {
					Lgbtqia l = new Lgbtqia();
					System.out.println("\nTemos essas opções: \n");
					l.mostrarNome();
					l.mostrarEditora();
					l.mostrarAutor();
					l.mostrarSinopse();
					l.mostrarAnoPubli();
					l.mostrarClasseInd();
					l.mostrarTW();
					l.mostrarQtdPag();
					
					//NOTA EM POLIMORFISMO DE SOBRECARGA
					nota.mostrarNota(4.48);
				}
				
				else if (catR==2) {
					RomanceDeEpoca r = new RomanceDeEpoca();
					System.out.println("\nTemos essas opções: \n");
					r.mostrarNome();
					r.mostrarEditora();
					r.mostrarAutor();
					r.mostrarSinopse();
					r.mostrarAnoPubli();
					r.mostrarClasseInd();
					r.mostrarTW();
					r.mostrarQtdPag();
					
					//NOTA EM POLIMORFISMO DE SOBRECARGA
					nota.mostrarNota(4.48, 4.88);
				}
			leia.close();
			}
		}catch(Exception erro)	{
			System.out.println("Você cometeu um erro: "+erro);
		}
		
		//------------------------------------ADIÇÃO GÊNERO TERROR
		//EXCEPTIONS - TRATANDO O ERRO
		try {
			if(posicao == 0 || posicao == 1) {
				System.out.println("Escolha uma categoria: ");
				terror.mostrarCategoria();
				int catT = leia.nextInt();
				if(catT==1) {
					System.out.println("\nTemos essas opções: \n");
					SerialKiller l = new SerialKiller();
					l.mostrarNome();
					l.mostrarEditora();
					l.mostrarAutor();
					l.mostrarSinopse();
					l.mostrarAnoPubli();
					l.mostrarClasseInd();
					l.mostrarTW();
					l.mostrarQtdPag();
					
					//NOTA EM POLIMORFISMO DE SOBRECARGA
					nota.mostrarNota(3.61);
				}
				
				else if (catT==2) {
					TerrorPsicologico r = new TerrorPsicologico();
					System.out.println("\nTemos essas opções: \n");
					r.mostrarNome();
					r.mostrarEditora();
					r.mostrarAutor();
					r.mostrarSinopse();
					r.mostrarAnoPubli();
					r.mostrarClasseInd();
					r.mostrarTW();
					r.mostrarQtdPag();
						
					//NOTA EM POLIMORFISMO DE SOBRECARGA
					nota.mostrarNota(3.61, 3.48);
				}
			}
			leia.close();
		
		}catch(Exception erro)	{
			System.out.println("Você cometeu um erro: "+erro);
		}
	}
}