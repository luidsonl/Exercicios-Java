package uninter;

public class Conta {
	int numero;
	String titular;
	double saldo;
	double limite;
	
	
	
	public Conta(int numero, String titular, double saldo, double limite) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}


	boolean sacar(double valor) {
		if (valor > limite || valor > saldo || valor <= 0) {
			return false;
		}
		saldo -= valor;
		return true;
	}
	
	
	boolean depositar(double valor) {
		if (valor <= 0) {
			return false;
		}
		saldo += valor;
		return true;
	}
	void info() {
		System.out.println("Número da conta:" + numero);
		System.out.println("Nome do titular:" + titular);
		System.out.println("Saldo do titular:" + saldo);
		System.out.println("Valor do limite" + limite);
	}
}
