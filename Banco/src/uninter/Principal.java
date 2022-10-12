package uninter;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(123, "Mario", 2000, 500);
		
		c1.info();
		
		c1.sacar(200);
		c1.depositar(500);
		System.out.println();
		c1.info();

	}

}
// Exercício: complementar esse exercício criando o método transferir que receba uma conta destino e um valor