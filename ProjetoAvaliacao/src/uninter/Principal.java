package uninter;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno ("Mario", "Encanador", new Avaliacao(9,4,10));
		Aluno a2 = new Aluno ("Luigo", "Pedreiro", new Avaliacao(6,9,5));
		
		a1.info();
		a2.info();
	}

}
