# 📚 Acervo Biblioteca

>  *Projeto do Bloco 1 sobre POO com tema livre*


**ProjetoAcervoBiblioteca** é um repositório do ✨ _Grupo 3_ ✨ com conceitos aprendidos no Bloco 1 da Generation Brasil, 
projeto que coloca em prática tudo que vimos em lógica de programação + POO. De tema livre, o grupo escolheu representar uma `Biblioteca`, 
com cadastro de gêneros, subgêneros e livros com diversos atributos retornando com interação no console.

## Integrantes
<div align="center">
<a href="https://github.com/janagt" taget="_blank"><img src="https://github.com/janagt.png" width="70" height="70"/> <a href="https://github.com/EduardaMatias" taget="_blank"><img src="https://www.imagemhost.com.br/images/2022/03/11/WhatsApp-Image-2022-03-11-at-1.35.26-PM.jpg" width="70" height="70"/></a>  <a href="https://github.com/GeordanFS" taget="_blank"><img src="https://github.com/GeordanFS.png" width="70" height="70"/></a>  <a href="https://github.com/nan1b" taget="_blank"><img src="https://github.com/nan1b.png" width="70" height="70"/></a>  <a href="https://github.com/rphaela" taget="_blank"><img src="https://github.com/rphaela.png" width="70" height="70"/></a>  <a href="https://github.com/PedroHenriquedp" taget="_blank"><img src="https://github.com/PedroHenriquedp.png" width="70" height="70"/></a> 
</div>

## Estrutura do Projeto

Projeto final do bloco 1 precisava conter toda programação orientada a objeto visto na semana, ele precisava conter:
1. Classes, Atributos e Objetos
2. Encapsulamento e Herança
3. Polimorfismo, Sobrecarga e Sobreescrita
4. Collections
5. Exceptions

Abaixo há mais informações com exemplos de como aplicamos os conceitos dentro do tema escolhido pelo grupo.

### » Classes, Atributos e Objetos
**Classe** na principal da biblioteca (que faz ação): 
```bash
public class MainBiblioteca {}
```
**Atributos** na classe FormaBiblioteca (o molde): 
```bash
protected String nome, categoria, gen, editora, autor, sinopse, tw, classeInd;
protected int anoPubli, qtdPag;
protected double nota,x,y;
```
**Objeto** dentro da MainBiblioteca para listagem de categorias: 
```bash
Lgbtqia l = new Lgbtqia();
```

### » Encapsulamento e Herança
**Encapsulamento** atribuido na Interface como abstrato: 
```bash
public interface Interface {
	public abstract void mostrarGenero();
	public abstract void mostrarCategoria();
	public abstract void mostrarNome();
	public abstract void mostrarEditora();
	public abstract void mostrarAutor();
	public abstract void mostrarSinopse();
	public abstract void mostrarAnoPubli();
	public abstract void mostrarClasseInd();
	public abstract void mostrarTW();
	public abstract void mostrarQtdPag();
}
```
**Herança** na classe Romance que extende a FormaBiblioteca:
  ```bash
public class Romance extends FormaBiblioteca {}
  ```

### » Polimorfismo, Sobrecarga e Sobreescrita
**Sobrecarga** em FormaBiblioteca para puxar parâmetro de nota:
```bash
public void mostrarNota(double x) {
  System.out.println("Nota: "+x);
}
public void mostrarNota(double x,double y) {
  System.out.println("Nota: "+(x+y)/2);
}
```
  
**Sobreescrita** dentro dos gêneros (Romance, Terror, etc) para sobrescrever de Interface:
```bash
@Override
public void mostrarCategoria() {
  this.categoria = "(1) LGBTQIA+ \n(2) Romance de Época";
  System.out.println(categoria);
}
```

### » Collections e Exceptions
**Collections** dentro de MainBiblioteca para listar as categorias com Array:  
  ```bash
  //COLLECTION: ARRAY LIST
		ArrayList<String> gensDisponiveis = new ArrayList<String>();
		
		//INSERINDO OS GÊNEROS MANUALMENTE NO ARRAY
		gensDisponiveis.add("Terror");
		gensDisponiveis.add("terror");
		gensDisponiveis.add("Romance");
		gensDisponiveis.add("romance");
  ```
  
**Exceptions** dentro de MainBiblioteca para tratar o erro dos menus:
  ```bash
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
  ```

## Resultado final:
  <p align="center"><img width="800" height="auto" src="https://media0.giphy.com/media/bGMiUItyL6Y82tclfu/giphy.gif"/></p>
