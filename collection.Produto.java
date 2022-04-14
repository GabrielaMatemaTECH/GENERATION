package collection;

public class Produto {
	
	private static long id;
	private String nome;
	private double preco;
	private int quantidade;

	public Produto() {

	}

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int total) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: " + nome);
		sb.append("\nPreço: R$ " + preco);
		sb.append("\nQuantidade: " + quantidade);
		
		return sb.toString();
	}

}
