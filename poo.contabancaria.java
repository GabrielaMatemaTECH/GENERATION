package poo;

public class ContaBancaria {
	
	private String titular;
	private int numero;
	private int agencia;
	private double saldo;
	
	
	public ContaBancaria(String titular, int numero, int agencia, double saldo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double saque(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}

		return saldo;
	}

	public double deposito(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}

		return saldo;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome do titular: "+titular+",");
	    System.out.println("\nNúmero: "+numero);
	    System.out.println("\nAgência: "+agencia);
	    System.out.println("\nSaldo: "+saldo);
}

}
