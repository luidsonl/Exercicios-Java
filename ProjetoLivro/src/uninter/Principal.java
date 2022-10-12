package uninter;

public class Principal {

	public static void main(String[] args) {
		
		LivroDigital ld = new LivroDigital("Pai Rico Pai Pobre", 
				new Autor("Robert Kyiosaki", "Americano", "robertautor@gmail.com"),
				"Finanças", 
				4, 
				10,
				1000000000);
	}

}
