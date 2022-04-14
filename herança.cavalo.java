package heranca;

public class Cavalo extends Animal {
	
	private String raca;

	public Cavalo(String nome, int idade, String som, String correr, String raca) {
		super(nome, idade, som, correr);
		this.raca = raca; 
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void imprimirInfoCavalo()
	{
		System.out.println("Nome: " + getNome()+"\nIdade: "+ getIdade() + "\nSom: " +
	getSom() + "\nO animal é corredor? "+ getCorrer() + "\nRaça cavalo: " + raca);
	}

}
