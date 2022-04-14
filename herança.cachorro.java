//07/04/2022
package heranca;

public class Cachorro extends Animal {
	
	private String cor;

	public Cachorro(String nome, int idade, String som, String correr, String cor) {
		super(nome, idade, som, correr);
		this.cor = cor;
	
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void imprimirInfoDog()
	{
		System.out.println("\nNome: " + getNome()+ "\n"+"Idade: "
	+getIdade()+ "\n"+ "Som: " + getSom() + "\n"+ "O animal corre? " 
	+ getCorrer() + "\n" + "Cor do Cachorro: "+cor);
	}

}
