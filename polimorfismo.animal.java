package polimorfismo;

public abstract class Animal {
	
	protected String nome;
	protected int idade;
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public abstract void locomover(String locomocao);
	public abstract void emitirSom(String som);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// CACHORRO.JAVA

package polimorfismo;

public class Cachorro extends Animal {
	private String corPelo;
	

	public Cachorro(String nome, int idade, String corPelo) {
		super(nome, idade);
		this.corPelo = corPelo;
	}

	@Override
	public void locomover(String locomover) {
		System.out.println("Correndo");		
	}

	@Override
	public void emitirSom(String som) {
		System.out.println("AuAuAu");		
	}
}
// ---------------------------------------------------------------------------------------------------
 //cavalo.java

package polimorfismo;

public class Cavalo extends Animal {
	private String raca;
	
	public Cavalo(String nome, int idade, String raca) {
		super(nome,idade);
		this.raca = raca;
		
	}

	@Override
	public void locomover(String locomover) {
		System.out.println("Correndo");		
	}

	@Override
	public void emitirSom(String som) {
		System.out.println("Irrirri");		
	}

}
// -------------------------------------------------------------------------------------------------------------------
//preguiça.java

package polimorfismo;

public class Preguica extends Animal {
	private String fofinha;

	
	public Preguica(String nome, int idade,String fofinha)
	{
		super(nome,idade);
		this.fofinha = fofinha;
	}
	@Override
	public void locomover(String locomocao) {
		System.out.println("Se move lentamente e sobe em árvores");		
	}

	@Override
	public void emitirSom(String som) {
		System.out.println("Piiiiiiii");		
	}
}
// --------------------------------------------------------------------------------------
// preguiça.java

package polimorfismo;

public class Preguica extends Animal {
	private String fofinha;

	
	public Preguica(String nome, int idade,String fofinha)
	{
		super(nome,idade);
		this.fofinha = fofinha;
	}
	@Override
	public void locomover(String locomocao) {
		System.out.println("Se move lentamente e sobe em árvores");		
	}

	@Override
	public void emitirSom(String som) {
		System.out.println("Piiiiiiii");		
	}
}
// ---------------------------------------------------------------------------------------
// teste animal

package polimorfismo;

import java.util.Scanner;

public class TesteAnimal {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		Cachorro Cachorro = new Cachorro();
		Cavalo Cavalo = new Cavalo(null, 0, null);
		Preguica Preguica = new Preguica(null, 0, null);
		Animal animal = null;
		
		int x=0;
		
		do
		{
			System.out.println("\nQual o tipo do seu animal?\n\n"
					+ "1-CACHORRO\n2-CAVALO\n3-PREGUIÇA\n");
			x = leia.nextInt();
			if(x==1)
			{
				animal = Cachorro;
				
				System.out.println("\nQuantos anos seu cachorro tem?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nQual o nome do seu cachorro: ");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("\nEssa é legal!!!Qual o som que seu cachorro emite?");
				String som = leia.nextLine();
				System.out.println("\n*****************************************************");
				Cachorro.nome(nome);
				Cachorro.idade(idade);
				Cachorro.som(som);
			}
			else if(x==2)
			{
				animal = Cavalo;
				leia.nextLine();
				System.out.println("\nQual o nome do seu cavalo: ");
				String nome = leia.nextLine();
				System.out.println("\nQuantos anos seu cavalo tem?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nEssa é legal!!!Qual o som que seu cavalo emite?");
				String som = leia.nextLine();
				System.out.println("\n*****************************************************");
				Cavalo.nome(nome);
				Cavalo.idade(idade);
				Cavalo.som(som);
			}
			else if(x==3)
			{
				animal = Preguica;
				leia.nextLine();
				System.out.println("\nQual o nome da sua preguiça: ");
				String nome = leia.nextLine();
				System.out.println("\nQuantos anos sua preguiça tem?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nEssa é legal!!!Qual o som que sua preguiça emite?");
				String som = leia.nextLine();
				System.out.println("\n*****************************************************");
				Preguica.nome(nome);
				Preguica.idade(idade);
				Preguica.som(som);
			}
			else
			{
				System.out.println("\nOpção inválida!!!");
			}
		}
		while(x<=0 || x>=4);	
	}
}
