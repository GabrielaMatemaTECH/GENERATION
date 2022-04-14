package heranca;

public class Preguica extends Animal {
	
	private String fofinha;

	public Preguica(String nome, int idade, String som, String correr, String fofinha) {
		super(nome, idade, som, correr);
		this.fofinha = fofinha;
	}

	public String getFofinha() {
		return fofinha;
	}

	public void setFofinha(String fofinha) {
		this.fofinha = fofinha;
	}
	
	public void imprimirInfoPreg()
	{
		System.out.println("\nNome: " + getNome()+"\nIdade: "+ getIdade() + "\nSom: " +
				getSom() + "\nO animal é corredor? "+ "\nSobe em árvores? " +fofinha);
	}

}
